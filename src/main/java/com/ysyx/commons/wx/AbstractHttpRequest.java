package com.ysyx.commons.wx;

import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.basesupport.MediaDownloadRequest;
import com.ysyx.commons.wx.util.ReflectUtil;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * base http request implement.
 *
 * @author duanbn
 */
public abstract class AbstractHttpRequest<T> implements Request<T> {

	public static final Logger LOG = LoggerFactory.getLogger(AbstractHttpRequest.class);

	/**
	 * cache for request annotation.
	 */
	private static final Map<Class<?>, Annotation> ANNO_CACHE = new WeakHashMap<Class<?>, Annotation>(1);

	/**
	 * cache for request fields.
	 */
	private static final Map<Class<?>, Field[]> FIELD_CACHE = new WeakHashMap<Class<?>, Field[]>();

	/**
	 * do request.
	 *
	 * @return response.
	 */
	@Override
	public Response<T> execute() {
		final RequestMeta reqMeta = parseRequestMeta();

		StringBuilder urlBuilder = null;
		if (this instanceof FileUploadHttpRequest || this instanceof MediaDownloadRequest) {
			urlBuilder = new StringBuilder(WX_FILE_DOMAIN);
		} else {
			urlBuilder = new StringBuilder(WX_DOMAIN);
		}
		urlBuilder.append(reqMeta.getUri()).append('?').append(getQueryString());
		final String url = urlBuilder.toString();

		if (LOG.isDebugEnabled()) {
			LOG.debug("request url " + url);
		}

		Response<T> resp = null;
		try {
			switch (reqMeta.reqType) {
			case GET:
				resp = doGet(url, reqMeta.respContentType);
				break;
			case POST:
				resp = doPost(url, reqMeta.respContentType);
				break;
			default:
				throw new IllegalArgumentException("unknow request type " + reqMeta.reqType);
			}
		} catch (IOException e) {
			throw new IllegalStateException("execute http request failure ", e);
		}

		return resp;
	}

	/**
     *
     */
	protected Response<T> doGet(final String url, final EnumContentType respType) throws IOException {
		HttpResponse<T> resp = null;
		CloseableHttpClient httpClient = null;
		try {
			httpClient = HttpClients.createDefault();
			final HttpGet httpGet = new HttpGet(url);
			final HttpResponseHandler<T> respHandler = new HttpResponseHandler<T>(respType);
			respHandler.setRespValueClazz(ReflectUtil.getSuperClassGenricType(this.getClass(), 0));
			resp = httpClient.execute(httpGet, respHandler);
		} finally {
			if (httpClient != null) {
				httpClient.close();
			}
		}
		return resp;
	}

	/**
	 * 
	 * @param url
	 * @param resp
	 * @param respType
	 */
	protected abstract Response<T> doPost(final String url, final EnumContentType respType) throws IOException;

	/**
	 * 
	 * @return
	 */
	protected RequestMeta parseRequestMeta() {
		final Class<?> clazz = this.getClass();

		Annotation anno = (Annotation) ANNO_CACHE.get(clazz);
		if (anno == null) {
			final Get get = clazz.getAnnotation(Get.class);
			final Post post = clazz.getAnnotation(Post.class);

			// check annotation.
			if (get != null && post != null) {
				throw new IllegalStateException("request should be annotated by @Get or @Post");
			}

			if (get != null && post == null) {
				anno = get;
			} else if (post != null && get == null) {
				anno = post;
			} else {
				throw new IllegalStateException("request must be annotated by @Get or @Post");
			}

			ANNO_CACHE.put(clazz, anno);
		}

		final RequestMeta meta = new RequestMeta();
		if (anno instanceof Get) {
			final Get getAnno = (Get) anno;
			meta.setUri(getAnno.value());
			meta.setReqType(EnumRequestType.GET);
			meta.setReqContentType(getAnno.reqContentType());
			meta.setRespContentType(getAnno.respContentType());
		} else if (anno instanceof Post) {
			final Post postAnno = (Post) anno;
			meta.setUri(postAnno.value());
			meta.setReqType(EnumRequestType.POST);
			meta.setReqContentType(postAnno.reqContentType());
			meta.setRespContentType(postAnno.respContentType());
		}

		return meta;
	}

	/**
	 * 
	 * @return
	 */
	protected String getQueryString() {
		try {
			final Class<?> clazz = this.getClass();

			Field[] fields = (Field[]) FIELD_CACHE.get(clazz);
			if (fields == null) {
				fields = clazz.getDeclaredFields();
				FIELD_CACHE.put(clazz, fields);
			}

			final StringBuilder queryString = new StringBuilder();
			QueryString queryStringField = null;
			Object fieldVal = null;
			for (final Field field : fields) {
				field.setAccessible(true);
				fieldVal = field.get(this);
				if (fieldVal == null) {
					continue;
				}
				String name = field.getName();
				queryStringField = field.getAnnotation(QueryString.class);
				if (queryStringField != null) {
					if (!queryStringField.value().equals("") && queryStringField.value() != null) {
						name = queryStringField.value();
					}
					queryString.append(name).append('=').append(field.get(this));
					queryString.append('&');
				}
			}
			if (queryString.length() > 1) {
				queryString.deleteCharAt(queryString.length() - 1);
			}

			return queryString.toString();
		} catch (Exception e) {
			throw new IllegalStateException("get query string failure", e);
		}
	}

	/**
	 * request meta data.
	 */
	protected class RequestMeta {
		private String uri;

		private EnumRequestType reqType;

		private EnumContentType reqContentType;

		private EnumContentType respContentType;

		/**
		 * 
		 * @return
		 */
		public String getUri() {
			return uri;
		}

		/**
		 * 
		 * @param uri
		 */
		public void setUri(final String uri) {
			this.uri = uri;
		}

		/**
		 * 
		 * @return
		 */
		public EnumRequestType getReqType() {
			return reqType;
		}

		/**
		 * 
		 * @param reqType
		 */
		public void setReqType(final EnumRequestType reqType) {
			this.reqType = reqType;
		}

		/**
		 * 
		 * @return
		 */
		public EnumContentType getReqContentType() {
			return reqContentType;
		}

		/**
		 * 
		 * @param reqContentType
		 */
		public void setReqContentType(final EnumContentType reqContentType) {
			this.reqContentType = reqContentType;
		}

		/**
		 * 
		 * @return
		 */
		public EnumContentType getRespContentType() {
			return respContentType;
		}

		/**
		 * 
		 * @param respContentType
		 */
		public void setRespContentType(final EnumContentType respContentType) {
			this.respContentType = respContentType;
		}

	}

}
