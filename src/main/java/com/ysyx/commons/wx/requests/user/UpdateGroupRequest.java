package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * update group name request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/groups/update")
public class UpdateGroupRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("group")
	private final UpdateGroupInfo group;

	/**
	 * 
	 * @param accessToken
	 * @param groupId
	 * @param groupName
	 */
	public UpdateGroupRequest(final String accessToken, final int groupId, final String groupName) {
		this.accessToken = accessToken;
		this.group = new UpdateGroupInfo(groupId, groupName);
	}

	/**
	 * 
	 * @author apple
	 *
	 */
	private class UpdateGroupInfo {
		@JsonProperty("id")
		private final int id;

		@JsonProperty("name")
		private final String name;

		/**
		 * 
		 * @param id
		 * @param name
		 */
		public UpdateGroupInfo(final int id, final String name) {
			this.id = id;
			this.name = name;
		}
	}

}
