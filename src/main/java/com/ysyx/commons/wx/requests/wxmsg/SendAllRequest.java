package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.util.JsonUtil;

import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * send request with group id.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/message/mass/sendall")
public class SendAllRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	private final EnumSendType sendType;

	private boolean toAll;

	private String groupId;

	private String mediaId;

	private String content;

	/**
	 * 
	 * @param accessToken
	 * @param sendType
	 */
	public SendAllRequest(final String accessToken, final EnumSendType sendType) {
		this.accessToken = accessToken;
		this.sendType = sendType;
	}

	/**
	 * 
	 */
	@Override
	protected String getPostData() {
		final Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("filter", new SendFilter(this.toAll, this.groupId));

		final Map<String, Object> content = new LinkedHashMap<String, Object>(1);
		if (sendType == EnumSendType.TEXT) {
			content.put("content", this.content);
		} else {
			content.put("media_id", this.mediaId);
		}
		data.put(sendType.getValue(), content);
		data.put("msgtype", sendType.getValue());

		return JsonUtil.toJson(data);
	}
	
	/**
	 * 
	 * @author duanbn
	 *
	 */
	public static class SendFilter {
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

	/**
	 * 
	 * @return
	 */
	public boolean isToAll() {
		return toAll;
	}

	/**
	 * 
	 * @param isToAll
	 */
	public SendAllRequest setToAll(final boolean isToAll) {
		this.toAll = isToAll;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * 
	 * @param groupId
	 */
	public SendAllRequest setGroupId(final String groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * 
	 * @param mediaId
	 */
	public SendAllRequest setMediaId(final String mediaId) {
		this.mediaId = mediaId;
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
	 */
	public SendAllRequest setContent(final String content) {
		this.content = content;
		return this;
	}

}
