package com.jybb.wxclient.requests.user;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

/**
 * batch move user to another group.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/groups/members/batchupdate")
public class MoveBatchUserGroupRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("openid_list")
	private final List<String> openIdList = new ArrayList<String>();

	@JsonProperty("to_groupid")
	private final int toGroupId;

	/**
	 * 
	 * @param accessToken
	 * @param toGroupId
	 */
	public MoveBatchUserGroupRequest(final String accessToken, final int toGroupId) {
		this.accessToken = accessToken;
		this.toGroupId = toGroupId;
	}

	/**
	 * 
	 * @param openId
	 */
	public void appendOpenId(final String openId) {
		this.openIdList.add(openId);
	}

}
