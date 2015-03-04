package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

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
     */
    public void appendOpenId(final List<String> openIds) {
        this.openIdList.addAll(openIds);
    }

	/**
	 * 
	 * @param openId
	 */
	public void appendOpenId(final String openId) {
		this.openIdList.add(openId);
	}

}
