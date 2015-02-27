package com.jybb.wxclient.requests.user;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.user.respbeans.GetGroupResult;

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
