package com.ysyx.commons.wx.requests.account.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * short url result.
 * 
 * @author duanbn
 *
 */
public class ShortUrlResult {

	@JsonProperty("errcode")
	private int errcode;

	@JsonProperty("errmsg")
	private String errmsg;
	
	@JsonProperty("short_url")
	private String shortUrl;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "ShortUrlResult [errcode=" + errcode + ", errmsg=" + errmsg + ", shortUrl=" + shortUrl + "]";
	}

	/**
	 * 
	 * @return
	 */
	public int getErrcode() {
		return errcode;
	}

	/**
	 * 
	 * @param errcode
	 */
	public void setErrcode(final int errcode) {
		this.errcode = errcode;
	}

	/**
	 * 
	 * @return
	 */
	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * 
	 * @param errmsg
	 */
	public void setErrmsg(final String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * 
	 * @return
	 */
	public String getShortUrl() {
		return shortUrl;
	}

	/**
	 * 
	 * @param shortUrl
	 */
	public void setShortUrl(final String shortUrl) {
		this.shortUrl = shortUrl;
	}
	
}
