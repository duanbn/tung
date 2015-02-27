package com.jybb.wxclient.requests.user.respbeans;

import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

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
	 */
	public void setGroup(final Map<String, Object> group) {
		this.group = group;
	}

}
