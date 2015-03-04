package com.ysyx.commons.wx;

import com.ysyx.commons.wx.util.ReflectUtil;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;
import java.io.IOException;

/**
 * request post data is file. this request use form method to post.
 *
 * @author duanbn
 *
 * @param <T>
 *            response type.
 */
public class FileUploadHttpRequest<T> extends AbstractHttpRequest<T> {

	protected final File file;

	/**
	 * 
	 * @param inputStream
	 */
	public FileUploadHttpRequest(final File file) {
		this.file = file;
	}

	/**
     *
     */
	protected HttpResponse<T> doPost(final String url, final EnumContentType respType) throws IOException {
		HttpResponse<T> resp = null;
		CloseableHttpClient httpClient = null;
		try {
			httpClient = HttpClients.createDefault();
			final HttpEntity httpEntity = MultipartEntityBuilder.create().addBinaryBody("media", getPostData()).build();
			final HttpPost httpPost = new HttpPost(url);
			httpPost.setHeader("Content-Type", ContentType.MULTIPART_FORM_DATA.toString());
			httpPost.setEntity(httpEntity);
			final HttpResponseHandler<T> respHandler = new HttpResponseHandler<T>(respType);
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
	protected File getPostData() {
		return this.file;
	}

}
