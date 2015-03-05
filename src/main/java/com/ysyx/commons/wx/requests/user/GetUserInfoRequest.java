package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.user.respbeans.UserInfoResult;

/**
 * get user info request.
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/user/info")
public class GetUserInfoRequest extends TextHttpRequest<UserInfoResult> {

	@QueryString("access_token")
	private final String accessToken;

	@QueryString("openid")
	private final String openId;

	/**
	 * 
	 * @param accessToken
	 * @param openId
	 */
	public GetUserInfoRequest(final String accessToken, final String openId) {
		this.accessToken = accessToken;
		this.openId = openId;
	}

}
