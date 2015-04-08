package com.ysyx.commons.wx;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * common result. {"errcode":0, "errmsg":""}
 *
 * @author duanbn.
 */
public class WXCommonResult2 {

	@JsonProperty("errcode")
	private int errcode;

	@JsonProperty("errmsg")
	private String errmsg;

	@JsonProperty("msgid")
	private long msgId;

	@JsonProperty("msg_status")
	private String msgStatus;

	@JsonProperty("template_id")
	private String templateId;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "WXCommonResult [errcode=" + errcode + ", errmsg=" + errmsg + ", msgId=" + msgId + ", msgStatus="
				+ msgStatus + ", templateId=" + templateId + "]";
	}

	/**
     *
     */
	public int getErrcode() {
		return errcode;
	}

	/**
     *
     */
	public void setErrcode(final int errcode) {
		this.errcode = errcode;
	}

	/**
     *
     */
	public String getErrmsg() {
		return errmsg;
	}

	/**
     *
     */
	public void setErrmsg(final String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * 
	 * @return
	 */
	public long getMsgId() {
		return msgId;
	}

	/**
	 * 
	 * @param msgId
	 */
	public void setMsgId(final long msgId) {
		this.msgId = msgId;
	}

	/**
	 * 
	 * @return
	 */
	public String getMsgStatus() {
		return msgStatus;
	}

	/**
	 * 
	 * @param msgStatus
	 */
	public void setMsgStatus(final String msgStatus) {
		this.msgStatus = msgStatus;
	}

	/**
	 * 
	 * @return
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * 
	 * @param templateId
	 */
	public void setTemplateId(final String templateId) {
		this.templateId = templateId;
	}
}
