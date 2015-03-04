package com.ysyx.commons.wx.requests.stat.respbeans;

import java.util.List;

/**
 * statistic data of interface summary.
 * 
 * @author duanbn
 *
 */
public class InterfaceSummary {

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
		private String refDate;

		private int refHour;

		private int callbackCount;

		private int failCount;

		private long totalTimeCost;

		private int maxTimeCost;

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
		public int getRefHour() {
			return refHour;
		}

		/**
		 * 
		 * @param refHour
		 */
		public void setRefHour(final int refHour) {
			this.refHour = refHour;
		}

		/**
		 * 
		 * @return
		 */
		public int getCallbackCount() {
			return callbackCount;
		}

		/**
		 * 
		 * @param callbackCount
		 */
		public void setCallbackCount(final int callbackCount) {
			this.callbackCount = callbackCount;
		}

		/**
		 * 
		 * @return
		 */
		public int getFailCount() {
			return failCount;
		}

		/**
		 * 
		 * @param failCount
		 */
		public void setFailCount(final int failCount) {
			this.failCount = failCount;
		}

		/**
		 * 
		 * @return
		 */
		public long getTotalTimeCost() {
			return totalTimeCost;
		}

		/**
		 * 
		 * @param totalTimeCost
		 */
		public void setTotalTimeCost(final long totalTimeCost) {
			this.totalTimeCost = totalTimeCost;
		}

		/**
		 * 
		 * @return
		 */
		public int getMaxTimeCost() {
			return maxTimeCost;
		}

		/**
		 * 
		 * @param maxTimeCost
		 */
		public void setMaxTimeCost(final int maxTimeCost) {
			this.maxTimeCost = maxTimeCost;
		}
	}

}
