package com.ysyx.commons.wx.requests.user.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

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
	 */
	@Override
	public String toString() {
		return "UserListResult [total=" + total + ", count=" + count + ", data=" + data + ", nextOpenId=" + nextOpenId
				+ "]";
	}

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
		 */
		@Override
		public String toString() {
			return "Data [openId=" + openId + "]";
		}

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
