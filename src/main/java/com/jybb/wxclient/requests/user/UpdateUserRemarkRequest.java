package com.jybb.wxclient.requests.user;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

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
