package com.jybb.wxclient.requests.user;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.user.respbeans.UserInfoResult;

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

	@JsonProperty("openid")
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
