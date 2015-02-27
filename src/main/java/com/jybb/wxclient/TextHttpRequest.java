package com.jybb.wxclient;

import java.io.IOException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jybb.wxclient.util.JsonUtil;
import com.jybb.wxclient.util.ReflectUtil;

/**
 * post data is string.
 * 
 * @author duanbn
 *
 * @param <T>
 */
public class TextHttpRequest<T> extends AbstractHttpRequest<T> {

	public static final Logger LOG = LoggerFactory.getLogger(TextHttpRequest.class);

	/**
     *
     */
	protected Response<T> doPost(final String url, final EnumContentType contentType) throws IOException {
		HttpResponse<T> resp = null;
		CloseableHttpClient httpClient = null;
		try {
			httpClient = HttpClients.createDefault();
			final StringEntity stringEntity = new StringEntity(getPostData());
			if (LOG.isDebugEnabled()) {
				LOG.debug("post data " + EntityUtils.toString(stringEntity));
			}
			final HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(stringEntity);
			final HttpResponseHandler<T> respHandler = new HttpResponseHandler<T>(contentType);
			respHandler.setRespValueClazz(ReflectUtil.getSuperClassGenricType(this.getClass(), 0));
			resp = httpClient.execute(httpPost, respHandler);
		} finally {
			if (httpClient != null) {
				httpClient.close();
			}
		}
		return resp;
	}

	/**
	 * 
	 * @return
	 */
	protected String getPostData() {
		String postData = "";

		final RequestMeta reqMeta = parseRequestMeta();
		switch (reqMeta.getReqContentType()) {
		case JSON:
			postData = JsonUtil.toJson(this);
			break;
		case XML:
			// TODO:
			throw new UnsupportedOperationException();
		default:
			throw new IllegalStateException("unknow request content type " + reqMeta.getReqContentType());
		}

		return postData;
	}

}
