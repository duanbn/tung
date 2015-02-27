package com.jybb.wxclient.requests.wxmsg;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

/**
 * add wechart template.
 * 
 * @author duanb
 *
 */
@Post("/cgi-bin/template/api_add_template")
public class AddTemplateRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("template_id_short")
	private final String templateIdShort;

	/**
	 * 
	 * @param accessToken
	 * @param templateIdShort
	 */
	public AddTemplateRequest(final String accessToken, final String templateIdShort) {
		this.accessToken = accessToken;
		this.templateIdShort = templateIdShort;
	}

}
