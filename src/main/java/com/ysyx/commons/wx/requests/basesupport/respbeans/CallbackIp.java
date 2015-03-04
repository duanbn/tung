package com.ysyx.commons.wx.requests.basesupport.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * call back ip.
 * 
 * @author duanbn
 */
public class CallbackIp {

	@JsonProperty("ip_list")
	private List<String> ipList;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "CallbackIp [ipList=" + ipList + "]";
	}

	/**
     *
     */
	public void setIpList(final List<String> ipList) {
		this.ipList = ipList;
	}

	/**
     *
     */
	public List<String> getIpList() {
		return this.ipList;
	}

}
