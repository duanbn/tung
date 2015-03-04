package com.ysyx.commons.wx.requests.user.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * get group id result.
 * 
 * @author duanbn
 *
 */
public class GetGroupIdResult {

	@JsonProperty("groupid")
	private int groupId;

	/**
	 * 
	 * @return
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * 
	 * @param groupId
	 */
	public void setGroupId(final int groupId) {
		this.groupId = groupId;
	}

}
