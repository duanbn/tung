package com.jybb.wxclient.requests.user.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * user list.
 * 
 * @author duanbn
 *
 */
public class UserListResult {

	@JsonProperty
	private int total;

	@JsonProperty
	private int count;

	@JsonProperty
	private Data data;

	@JsonProperty("next_openid")
	private String nextOpenId;

	/**
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 
	 * @param total
	 */
	public void setTotal(final int total) {
		this.total = total;
	}

	/**
	 * 
	 * @return
	 */
	public int getCount() {
		return count;
	}

	/**
	 * 
	 * @param count
	 */
	public void setCount(final int count) {
		this.count = count;
	}

	/**
	 * 
	 * @return
	 */
	public Data getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(final Data data) {
		this.data = data;
	}

	/**
	 * 
	 * @return
	 */
	public String getNextOpenId() {
		return nextOpenId;
	}

	/**
	 * 
	 * @param nextOpenId
	 */
	public void setNextOpenId(final String nextOpenId) {
		this.nextOpenId = nextOpenId;
	}

	/**
	 * 
	 * @author apple
	 *
	 */
	public static class Data {

		@JsonProperty("openid")
		private List<String> openId;

		/**
		 * 
		 * @return
		 */
		public List<String> getOpenId() {
			return openId;
		}

		/**
		 * 
		 * @param openId
		 */
		public void setOpenId(final List<String> openId) {
			this.openId = openId;
		}

	}

}
