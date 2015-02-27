package com.jybb.wxclient.requests.user;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

/**
 * move one user to another group request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/groups/members/update")
public class MoveOneUserRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("openid")
	private final String openId;

	@JsonProperty("to_groupid")
	private final String toGroupId;

	/**
	 * 
	 * @param accessToken
	 * @param openId
	 * @param toGroupId
	 */
	public MoveOneUserRequest(final String accessToken, final String openId, final String toGroupId) {
		this.accessToken = accessToken;
		this.openId = openId;
		this.toGroupId = toGroupId;
	}

}
