package com.ysyx.commons.wx.requests.stat;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.stat.respbeans.UserShare;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * get user share request.
 *
 * @author duanbn
 */
@Post("/datacube/getusershare")
public class GetUserShareRequest extends TextHttpRequest<UserShare> {

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
	public GetUserShareRequest(final String accessToken, final String beginDate, final String endDate) {
		this.accessToken = accessToken;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

}
