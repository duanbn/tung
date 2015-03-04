package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.user.respbeans.UserListResult;

/**
 * get user list request.
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/user/get")
public class GetUserListRequest extends TextHttpRequest<UserListResult> {

	@QueryString("access_token")
	private final String accessToken;

	@QueryString("next_openid")
	private String nextOpenId;

	/**
	 * 
	 * @param accessToken
	 * @param nextOpenId
	 */
	public GetUserListRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 
	 * @return
	 */
	public String getNextOpenId() {
		return nextOpenId;
	}

	/**
	 * 
	 * @param nextOpenId
	 */
	public void setNextOpenId(final String nextOpenId) {
		this.nextOpenId = nextOpenId;
	}

}
