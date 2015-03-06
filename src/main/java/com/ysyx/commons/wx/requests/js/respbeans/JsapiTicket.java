package com.ysyx.commons.wx.requests.js.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * js api ticket bean.
 * 
 * @author duanbn
 *
 */
public class JsapiTicket {

	@JsonProperty("errcode")
	private int errcode;

	@JsonProperty("errmsg")
	private String errmsg;

	@JsonProperty("ticket")
	private String ticket;

	@JsonProperty("expires_in")
	private int expiresIn;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "JsapiTicket [errcode=" + errcode + ", errmsg=" + errmsg + ", ticket=" + ticket + ", expiresIn="
				+ expiresIn + "]";
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
