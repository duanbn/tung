package com.jybb.wxclient.requests.menu;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;

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
