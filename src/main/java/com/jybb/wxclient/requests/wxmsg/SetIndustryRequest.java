package com.jybb.wxclient.requests.wxmsg;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

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
