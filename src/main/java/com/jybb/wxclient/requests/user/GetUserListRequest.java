package com.jybb.wxclient.requests.user;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.user.respbeans.UserListResult;

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
