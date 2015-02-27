package com.jybb.wxclient.requests.stat.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * statistic data of user summary.
 * 
 * @author duanbn
 *
 */
public class UserSummary {

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
	 */
	public static class Summary {

		@JsonProperty("ref_date")
		private String refDate;

		@JsonProperty("user_source")
		private int userSource;

		@JsonProperty("new_user")
		private int newUser;

		@JsonProperty("cancel_user")
		private int cancelUser;

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
		public int getUserSource() {
			return userSource;
		}

		/**
		 * 
		 * @param userSource
		 */
		public void setUserSource(final int userSource) {
			this.userSource = userSource;
		}

		/**
		 * 
		 * @return
		 */
		public int getNewUser() {
			return newUser;
		}

		/**
		 * 
		 * @param newUser
		 */
		public void setNewUser(final int newUser) {
			this.newUser = newUser;
		}

		/**
		 * 
		 * @return
		 */
		public int getCancelUser() {
			return cancelUser;
		}

		/**
		 * 
		 * @param cancelUser
		 */
		public void setCancelUser(final int cancelUser) {
			this.cancelUser = cancelUser;
		}
	}

}
