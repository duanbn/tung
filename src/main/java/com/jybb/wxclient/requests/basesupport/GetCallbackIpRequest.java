package com.jybb.wxclient.requests.basesupport;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.basesupport.respbeans.CallbackIp;

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
