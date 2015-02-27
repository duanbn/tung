package com.jybb.wxclient.requests.basesupport.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * access token.
 * 
 * @author duanbn
 *
 */
public class AccessToken {

	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("expires_in")
	private int expiresIn;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "AccessToken [accessToken=" + accessToken + ", expiresIn=" + expiresIn + "]";
	}

	/**
	 * 
	 * @return
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * 
	 * @param accessToken
	 */
	public void setAccessToken(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 
	 * @return
	 */
	public int getExpiresIn() {
		return expiresIn;
	}

	/**
	 * 
	 * @param expiresIn
	 */
	public void setExpiresIn(final int expiresIn) {
		this.expiresIn = expiresIn;
	}
}
