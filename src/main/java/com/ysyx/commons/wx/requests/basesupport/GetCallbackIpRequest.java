package com.ysyx.commons.wx.requests.basesupport;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.basesupport.respbeans.CallbackIp;

/**
 * get call back ip list.
 *
 * @author duanbn
 */
@Get("/cgi-bin/getcallbackip")
public class GetCallbackIpRequest extends TextHttpRequest<CallbackIp> {

	@QueryString("access_token")
	private String accessToken;

	/**
	 * 
	 * @param accessToken
	 */
	public GetCallbackIpRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
     *
     */
	public String getAccessToken() {
		return accessToken;
	}

	/**
     *
     */
	public void setAccessToken(final String accessToken) {
		this.accessToken = accessToken;
	}
}
