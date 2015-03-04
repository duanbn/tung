package com.ysyx.commons.wx.requests.menu;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.menu.respbeans.GetMenuResult;

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
