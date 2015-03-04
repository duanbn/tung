package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * add kf request.
 *
 * @author duanbn
 */
@Post("/customservice/kfaccount/add")
public class AddKfAccountRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("kf_account")
	private final String kfAccount;

	@JsonProperty("nickname")
	private final String nickName;

	@JsonProperty("password")
	private String password;

	/**
	 * 
	 * @param accessToken
	 * @param kfAccount
	 * @param nickName
	 */
	public AddKfAccountRequest(final String accessToken, final String kfAccount, final String nickName) {
		this.accessToken = accessToken;
		this.kfAccount = kfAccount;
		this.nickName = nickName;
	}

	/**
     *
     */
	public String getPassword() {
		return this.password;
		// FIXME: fast json encode error.
		// return DigestUtil.md5(this.password);
	}

	/**
     *
     */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * 
	 * @return
	 */
	public String getKfAccount() {
		return kfAccount;
	}

	/**
	 * 
	 * @return
	 */
	public String getNickName() {
		return nickName;
	}
}
