package com.jybb.wxclient.requests.stat;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.stat.respbeans.ArticleSummary;

/**
 * get statistic data of article summary request.
 * 
 * @author duanbn
 *
 */
@Post("/datacube/getarticlesummary")
public class GetArticleSummaryRequest extends TextHttpRequest<ArticleSummary> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("begin_date")
	private final String beginDate;

	@JsonProperty("end_date")
	private final String endDate;

	/**
	 * 
	 * @param accessToken
	 * @param beginDate
	 *            yyyy-MM-dd
	 * @param endDate
	 *            yyyy-MM-dd
	 */
	public GetArticleSummaryRequest(final String accessToken, final String beginDate, final String endDate) {
		this.accessToken = accessToken;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

}
