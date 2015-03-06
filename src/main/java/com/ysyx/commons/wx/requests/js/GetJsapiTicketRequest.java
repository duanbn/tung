package com.ysyx.commons.wx.requests.js;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.js.respbeans.JsapiTicket;

/**
 * get js api ticket request.
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/ticket/getticket")
public class GetJsapiTicketRequest extends TextHttpRequest<JsapiTicket> {

	@QueryString("access_token")
	private String accessToken;

	@QueryString("type")
	private String type = "jsapi";

	/**
	 * 
	 * @param accessToken
	 */
	public GetJsapiTicketRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 
	 * @return
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * 
	 * @param accessToken
	 */
	public void setAccessToken(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(final String type) {
		this.type = type;
	}

}
