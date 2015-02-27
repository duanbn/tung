package com.jybb.wxclient.requests.menu;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.menu.respbeans.GetMenuResult;

/**
 * get custom menu request.
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/menu/get")
public class GetMenuRequest extends TextHttpRequest<GetMenuResult> {

	@QueryString("access_token")
	private final String accessToken;

	/**
	 * 
	 * @param accessToken
	 */
	public GetMenuRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

}
