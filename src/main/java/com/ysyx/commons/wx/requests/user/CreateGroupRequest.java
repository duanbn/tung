package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.user.respbeans.CreateGroupResult;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * create user group request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/groups/create")
public class CreateGroupRequest extends TextHttpRequest<CreateGroupResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("group")
	private final Map<String, String> group = new LinkedHashMap<String, String>(1);

	/**
	 * 
	 * @param accessToken
	 * @param groupName
	 */
	public CreateGroupRequest(final String accessToken, final String groupName) {
		this.accessToken = accessToken;
		this.group.put("name", groupName);
	}

}
