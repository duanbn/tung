package com.ysyx.commons.wx.requests.account.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * two-dimension code result.
 * 
 * @author duanbn
 *
 */
public class QRCodeResult {

	@JsonProperty("ticket")
	private String ticket;

	@JsonProperty("expire_seconds")
	private String expireSeconds;

	@JsonProperty("url")
	private String url;

	/**
	 * 
	 * @return
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * 
	 * @param ticket
	 */
	public void setTicket(final String ticket) {
		this.ticket = ticket;
	}

	/**
	 * 
	 * @return
	 */
	public String getExpireSeconds() {
		return expireSeconds;
	}

	/**
	 * 
	 * @param expireSeconds
	 */
	public void setExpireSeconds(final String expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	/**
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 */
	public void setUrl(final String url) {
		this.url = url;
	}

}
