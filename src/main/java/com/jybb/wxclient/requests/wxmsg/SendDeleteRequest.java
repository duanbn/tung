package com.jybb.wxclient.requests.wxmsg;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

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
	private final int msgId;

	/**
	 * 
	 * @param accessToken
	 * @param msgId
	 */
	public SendDeleteRequest(final String accessToken, final int msgId) {
		this.accessToken = accessToken;
		this.msgId = msgId;
	}

}
