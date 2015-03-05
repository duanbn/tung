package com.ysyx.commons.wx;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ysyx.commons.wx.exception.ResponseParseException;
import com.ysyx.commons.wx.util.JsonUtil;

/**
 * apache http client response handler implement.
 * 
 * @author duanbn
 *
 * @param <T>
 */
public class HttpResponseHandler<T> implements ResponseHandler<HttpResponse<T>> {

	public static final Logger LOG = LoggerFactory.getLogger(HttpResponseHandler.class);

	/**
	 * if response message contain this string, this maybe a weixin error
	 * message.
	 */
	public static final String WX_ERRMSG_FEATURE = "errcode";

	public static final String WX_SUCMSG_FEATURE = "\"errcode\":0";

	private final EnumContentType contentType;

	private Class respValueClazz;

	/**
	 * 
	 * @param respType
	 */
	public HttpResponseHandler(final EnumContentType contentType) {
		this.contentType = contentType;
	}

	/**
	 * 
	 */
	@Override
	public HttpResponse<T> handleResponse(final org.apache.http.HttpResponse arg) throws ClientProtocolException,
			IOException {
		final int status = arg.getStatusLine().getStatusCode();
		HttpResponse<T> resp = null;
		if (status >= 200 && status < 300) {
			resp = new HttpResponse<T>(Response.OK);
			switch (contentType) {
			case JSON:
				final String respContent = EntityUtils.toString(arg.getEntity(), "UTF-8");
				
				if (LOG.isDebugEnabled()) {
					LOG.debug("response content:" + respContent);
				}

				if (respContent.indexOf(WX_ERRMSG_FEATURE) > -1 && respContent.indexOf(WX_SUCMSG_FEATURE) == -1
						&& respContent.indexOf("ok") == -1) {
					final WXCommonResult wxErrMessage = JsonUtil.parseObject(respContent, WXCommonResult.class);
					resp.setCode(wxErrMessage.getErrcode());
					resp.setErrMessage(wxErrMessage.getErrmsg());
				} else {
					final T sucMessage = (T) JsonUtil.parseObject(respContent, respValueClazz);
					resp.set(sucMessage);
				}
				break;
			case XML:
				break;
			default:
				throw new ResponseParseException("unknow response content type " + contentType);
			}
		} else {
			resp = new HttpResponse<T>(Response.ERROR);
			resp.setErrMessage("do post failure " + EntityUtils.toString(arg.getEntity()));
		}
		return resp;
	}

	/**
	 * 
	 * @return
	 */
	public Class getRespValueClazz() {
		return respValueClazz;
	}

	/**
	 * 
	 * @param respValueClazz
	 */
	public void setRespValueClazz(final Class respValueClazz) {
		this.respValueClazz = respValueClazz;
	}

}
