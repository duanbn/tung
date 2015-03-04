package com.ysyx.commons.wx.requests.user.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * result of create group request.
 * 
 * @author duanbn
 *
 */
public class CreateGroupResult {

	@JsonProperty("group")
	private Map<String, Object> group = new LinkedHashMap<String, Object>(1);

	/**
	 * 
	 * @return
	 */
	public Map<String, Object> getGroup() {
		return group;
	}

	/**
	 * 
	 * @param group
	 *            key is group id, value is group name.
	 */
	public void setGroup(final Map<String, Object> group) {
		this.group = group;
	}

}
