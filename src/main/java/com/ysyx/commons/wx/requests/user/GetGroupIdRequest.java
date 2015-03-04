package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.user.respbeans.GetGroupIdResult;
import org.codehaus.jackson.annotate.JsonProperty;

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
