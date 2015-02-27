package com.jybb.wxclient.requests.user;

import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.user.respbeans.CreateGroupResult;

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
