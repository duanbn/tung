package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.util.JsonUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * send message with open id.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/message/mass/send")
public class SendRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	private final List<String> openIdList = new ArrayList<String>();

	private final EnumSendType sendType;

	private String mediaId;

	private String content;

	/**
	 * 
	 * @param accessToken
	 */
	public SendRequest(final String accessToken, final EnumSendType sendType) {
		this.accessToken = accessToken;
		this.sendType = sendType;
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

	/**
	 * 
	 */
	@Override
	protected String getPostData() {
		final Map<String, Object> data = new LinkedHashMap<String, Object>(3);

		data.put("touser", this.openIdList);
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
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * 
	 * @param mediaId
	 */
	public SendRequest setMediaId(final String mediaId) {
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
	public SendRequest setContent(final String content) {
		this.content = content;
		return this;
	}

}
