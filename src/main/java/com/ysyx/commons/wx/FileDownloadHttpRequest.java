package com.ysyx.commons.wx;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * download file request.
 * 
 * @author duanbn
 *
 */
public class FileDownloadHttpRequest extends AbstractHttpRequest<byte[]> {

	/**
	 * 
	 */
	@Override
	protected Response<byte[]> doGet(final String url, final EnumContentType respType) throws IOException {
		HttpResponse<byte[]> resp = null;
		CloseableHttpClient httpClient = null;
		try {
			httpClient = HttpClients.createDefault();
			final HttpGet httpGet = new HttpGet(url);
			final ResponseHandler<HttpResponse<byte[]>> respHandler = new ResponseHandler<HttpResponse<byte[]>>() {

				/**
				 * 
				 */
				@Override
				public HttpResponse<byte[]> handleResponse(final org.apache.http.HttpResponse response)
						throws ClientProtocolException, IOException {
					final int status = response.getStatusLine().getStatusCode();
					HttpResponse<byte[]> resp = null;
					if (status >= 200 && status < 300) {
						ByteArrayOutputStream baos = null;
						InputStream is = null;
						try {
							baos = new ByteArrayOutputStream();
							is = response.getEntity().getContent();
							byte[] readBuf = new byte[4096];
							int len = -1;
							while ((len = is.read(readBuf, 0, readBuf.length)) != -1) {
								baos.write(readBuf, 0, len);
							}
							baos.flush();

							resp = new HttpResponse<byte[]>(Response.OK);
							resp.set(baos.toByteArray());
						} finally {
							if (baos != null) {
								baos.close();
							}
							if (is != null) {
								is.close();
							}
						}
					} else {
						resp = new HttpResponse<byte[]>(Response.ERROR);
						resp.setErrMessage("download file failure " + EntityUtils.toString(response.getEntity()));
					}
					return resp;
				}
			};

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
	 */
	@Override
	protected Response<byte[]> doPost(final String url, final EnumContentType respType) throws IOException {
		throw new UnsupportedOperationException("download request unsupport post action");
	}

}
