package com.jybb.wxclient.requests.user;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.user.respbeans.GetGroupIdResult;

/**
 * get group id request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/groups/getid")
public class GetGroupIdRequest extends TextHttpRequest<GetGroupIdResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("openid")
	private final String openId;

	/**
	 * 
	 * @param accessToken
	 * @param openId
	 */
	public GetGroupIdRequest(final String accessToken, final String openId) {
		this.accessToken = accessToken;
		this.openId = openId;
	}

}
