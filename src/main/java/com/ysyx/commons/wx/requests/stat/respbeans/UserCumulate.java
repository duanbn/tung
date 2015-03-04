package com.ysyx.commons.wx.requests.stat.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * statistic data of user cumulate.
 * 
 * @author duanbn
 *
 */
public class UserCumulate {

	@JsonProperty("list")
	private List<Cumulate> list;

	/**
	 * 
	 * @return
	 */
	public List<Cumulate> getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 */
	public void setList(final List<Cumulate> list) {
		this.list = list;
	}

	/**
	 * 
	 * @author apple
	 *
	 */
	public static class Cumulate {
		@JsonProperty("ref_date")
		private String refDate;

		@JsonProperty("cumulate_user")
		private int cumulateUser;

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
		public int getCumulateUser() {
			return cumulateUser;
		}

		/**
		 * 
		 * @param cumulateUser
		 */
		public void setCumulateUser(final int cumulateUser) {
			this.cumulateUser = cumulateUser;
		}
	}

}
