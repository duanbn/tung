package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * set industry request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/template/api_set_industry")
public class SetIndustryRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("industry_id1")
	private final String industryId1;

	@JsonProperty("industry_id2")
	private final String industryId2;

	/**
	 * 
	 * @param accessToken
	 * @param industryId1
	 * @param industryId2
	 */
	public SetIndustryRequest(final String accessToken, final String industryId1, final String industryId2) {
		this.accessToken = accessToken;
		this.industryId1 = industryId1;
		this.industryId2 = industryId2;
	}
}
