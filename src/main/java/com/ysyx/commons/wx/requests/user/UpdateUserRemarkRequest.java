package com.ysyx.commons.wx.requests.user;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * update user remark request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/user/info/updateremark")
public class UpdateUserRemarkRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("openid")
	private final String openId;

	@JsonProperty("remark")
	private final String remark;

	/**
	 * 
	 * @param accessToken
	 * @param openId
	 * @param remark
	 */
	public UpdateUserRemarkRequest(final String accessToken, final String openId, final String remark) {
		this.accessToken = accessToken;
		this.openId = openId;
		this.remark = remark;
	}

}
