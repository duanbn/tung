package com.jybb.wxclient.requests.basesupport.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

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
