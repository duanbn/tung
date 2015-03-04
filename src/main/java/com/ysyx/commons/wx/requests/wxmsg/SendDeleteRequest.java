package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * send delete message request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/message/mass/delete")
public class SendDeleteRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("msg_id")
	private final long msgId;

	/**
	 * 
	 * @param accessToken
	 * @param msgId
	 */
	public SendDeleteRequest(final String accessToken, final long msgId) {
		this.accessToken = accessToken;
		this.msgId = msgId;
	}

}
