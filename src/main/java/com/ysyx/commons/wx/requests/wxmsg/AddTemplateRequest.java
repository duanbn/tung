package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * add wechart template.
 * 
 * @author duanbn
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
