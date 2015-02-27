package com.jybb.wxclient.requests.wxmsg;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author duanbn
 *
 */
public class SendFilter {

	@JsonProperty("is_to_all")
	private final boolean isToAll;

	@JsonProperty("group_id")
	private final String groupId;

	/**
	 * 
	 * @param isToAll
	 * @param groupId
	 */
	public SendFilter(final boolean isToAll, final String groupId) {
		this.isToAll = isToAll;
		this.groupId = groupId;
	}

}
