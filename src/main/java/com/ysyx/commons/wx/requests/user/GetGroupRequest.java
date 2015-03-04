package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.user.respbeans.GetGroupResult;

/**
 * get group info request.
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/groups/get")
public class GetGroupRequest extends TextHttpRequest<GetGroupResult> {

	@QueryString("access_token")
	private final String accessToken;

	/**
	 * 
	 * @param accessToken
	 */
	public GetGroupRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

}
