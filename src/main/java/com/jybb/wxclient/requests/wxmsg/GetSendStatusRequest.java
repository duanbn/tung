package com.jybb.wxclient.requests.wxmsg;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

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
