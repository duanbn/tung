package com.ysyx.commons.wx.requests.basesupport;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.basesupport.respbeans.AccessToken;

/**
 * get weixin access token.
 *
 * @author duanbn
 * @see http://mp.weixin.qq.com/wiki/11/0e4b294685f817b95cbed85ba5e82b8f.html
 */
@Get("/cgi-bin/token")
public class GetAccessTokenRequest extends TextHttpRequest<AccessToken> {

	@QueryString("grant_type")
	private String grantType = "client_credential";

	@QueryString("appid")
	private String appId;

	@QueryString("secret")
	private String secret;

	/**
	 * 
	 * @param grant_type
	 * @param appid
	 * @param secret
	 */
	public GetAccessTokenRequest(final String appId, final String secret) {
		this.appId = appId;
		this.secret = secret;
	}

	/**
	 * 
	 * @return
	 */
	public String getGrantType() {
		return grantType;
	}

	/**
	 * 
	 * @param grantType
	 */
	public void setGrantType(final String grantType) {
		this.grantType = grantType;
	}

	/**
	 * 
	 * @return
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * 
	 * @param appId
	 */
	public void setAppId(final String appId) {
		this.appId = appId;
	}

	/**
	 * 
	 * @return
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * 
	 * @param secret
	 */
	public void setSecret(final String secret) {
		this.secret = secret;
	}

}
