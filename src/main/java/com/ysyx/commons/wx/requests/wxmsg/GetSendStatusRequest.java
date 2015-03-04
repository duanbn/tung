package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * get send status request.
 * 
 * @author duanbn
 * 
 */
@Post("/cgi-bin/message/mass/get")
public class GetSendStatusRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("msg_id")
	private final String msgId;

	/**
	 * 
	 * @param accessToken
	 * @param msgId
	 */
	public GetSendStatusRequest(final String accessToken, final String msgId) {
		this.accessToken = accessToken;
		this.msgId = msgId;
	}

}
