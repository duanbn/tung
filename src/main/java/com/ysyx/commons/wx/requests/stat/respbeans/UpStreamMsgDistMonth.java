package com.ysyx.commons.wx.requests.stat.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * statistic data of up stream msg dist month.
 * 
 * @author duanbn
 *
 */
public class UpStreamMsgDistMonth {

	@JsonProperty("list")
	private List<Summary> list;

	/**
	 * 
	 * @return
	 */
	public List<Summary> getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 */
	public void setList(final List<Summary> list) {
		this.list = list;
	}

	/**
	 * 
	 * @author duanbn
	 *
	 */
	public static class Summary {
		@JsonProperty("ref_date")
		private String refDate;

		@JsonProperty("count_interval")
		private int countInterval;

		@JsonProperty("msg_user")
		private int msgUser;

		/**
		 * 
		 * @return
		 */
		public String getRefDate() {
			return refDate;
		}

		/**
		 * 
		 * @param refDate
		 */
		public void setRefDate(final String refDate) {
			this.refDate = refDate;
		}

		/**
		 * 
		 * @return
		 */
		public int getCountInterval() {
			return countInterval;
		}

		/**
		 * 
		 * @param countInterval
		 */
		public void setCountInterval(final int countInterval) {
			this.countInterval = countInterval;
		}

		/**
		 * 
		 */
		public int getMsgUser() {
			return msgUser;
		}

		/**
		 * 
		 * @param msgUser
		 */
		public void setMsgUser(final int msgUser) {
			this.msgUser = msgUser;
		}
	}

}
