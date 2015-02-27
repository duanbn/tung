package com.jybb.wxclient.requests.wxmsg;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;

/**
 * send template message request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/message/template/send")
public class SendTemplateMessageRequest extends TextHttpRequest<WXCommonResult> {

	// TODO:

}
