package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.util.JsonUtil;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * send preview request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/message/mass/preview")
public class SendPreviewRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	private final EnumSendType sendType;

	private String openId;

	private String mediaId;

	private String content;

	/**
	 * 
	 * @param accessToken
	 * @param sendType
	 */
	public SendPreviewRequest(final String accessToken, final EnumSendType sendType) {
		this.accessToken = accessToken;
		this.sendType = sendType;
	}

	/**
	 * 
	 */
	@Override
	protected String getPostData() {
		final Map<String, Object> data = new LinkedHashMap<String, Object>(3);
		data.put("touser", this.openId);
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
	 * @return
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * 
	 */
	public void setOpenId(final String openId) {
		this.openId = openId;
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
	public void setMediaId(final String mediaId) {
		this.mediaId = mediaId;
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
	public void setContent(final String content) {
		this.content = content;
	}

}
