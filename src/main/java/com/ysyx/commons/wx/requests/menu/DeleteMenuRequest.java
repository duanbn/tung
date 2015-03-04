package com.ysyx.commons.wx.requests.menu;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;

/**
 * delete custom menu request.
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/menu/delete")
public class DeleteMenuRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	/**
	 * 
	 * @param accessToken
	 */
	public DeleteMenuRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

}
