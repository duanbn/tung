package com.jybb.wxclient.requests.stat.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * statistic data of up stream message.
 * 
 * @author duanbn
 *
 */
public class UpStreamMsg {

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

		@JsonProperty("msg_type")
		private int msgType;

		@JsonProperty("msg_user")
		private int msgUser;

		@JsonProperty("msg_count")
		private int msgCount;

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
		public int getMsgType() {
			return msgType;
		}

		/**
		 * 
		 * @param msgType
		 */
		public void setMsgType(final int msgType) {
			this.msgType = msgType;
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

		/**
		 * 
		 * @return
		 */
		public int getMsgCount() {
			return msgCount;
		}

		/**
		 * 
		 * @param msgCount
		 */
		public void setMsgCount(final int msgCount) {
			this.msgCount = msgCount;
		}
	}

}
