package com.ysyx.commons.wx.requests.stat.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * statistic data of article summary on one day.
 * 
 * @author duanbn
 *
 */
public class ArticleSummary {

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

		@JsonProperty("msgid")
		private String msgId;

		@JsonProperty("title")
		private String title;

		@JsonProperty("int_page_read_user")
		private int intPageReadUser;

		@JsonProperty("int_page_read_count")
		private int intPageReadCount;

		@JsonProperty("ori_page_read_user")
		private int oriPageReadUser;

		@JsonProperty("ori_page_read_count")
		private int oriPageReadCount;

		@JsonProperty("share_user")
		private int shareUser;

		@JsonProperty("share_count")
		private int shareCount;

		@JsonProperty("add_to_fav_user")
		private int addToFavUser;

		@JsonProperty("add_to_fav_count")
		private int addToFavCount;

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
		public String getMsgId() {
			return msgId;
		}

		/**
		 * 
		 * @param msgId
		 */
		public void setMsgId(final String msgId) {
			this.msgId = msgId;
		}

		/**
		 * 
		 * @return
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * 
		 * @param title
		 */
		public void setTitle(final String title) {
			this.title = title;
		}

		/**
		 * 
		 * @return
		 */
		public int getIntPageReadUser() {
			return intPageReadUser;
		}

		/**
		 * 
		 * @param intPageReadUser
		 */
		public void setIntPageReadUser(final int intPageReadUser) {
			this.intPageReadUser = intPageReadUser;
		}

		/**
		 * 
		 * @return
		 */
		public int getIntPageReadCount() {
			return intPageReadCount;
		}

		/**
		 * 
		 * @param intPageReadCount
		 */
		public void setIntPageReadCount(final int intPageReadCount) {
			this.intPageReadCount = intPageReadCount;
		}

		/**
		 * 
		 * @return
		 */
		public int getOriPageReadUser() {
			return oriPageReadUser;
		}

		/**
		 * 
		 * @param oriPageReadUser
		 */
		public void setOriPageReadUser(final int oriPageReadUser) {
			this.oriPageReadUser = oriPageReadUser;
		}

		/**
		 * 
		 * @return
		 */
		public int getOriPageReadCount() {
			return oriPageReadCount;
		}

		/**
		 * 
		 * @param oriPageReadCount
		 */
		public void setOriPageReadCount(final int oriPageReadCount) {
			this.oriPageReadCount = oriPageReadCount;
		}

		/**
		 * 
		 * @return
		 */
		public int getShareUser() {
			return shareUser;
		}

		/**
		 * 
		 * @param shareUser
		 */
		public void setShareUser(final int shareUser) {
			this.shareUser = shareUser;
		}

		/**
		 * 
		 * @return
		 */
		public int getShareCount() {
			return shareCount;
		}

		/**
		 * 
		 * @param shareCount
		 */
		public void setShareCount(final int shareCount) {
			this.shareCount = shareCount;
		}

		/**
		 * 
		 * @return
		 */
		public int getAddToFavUser() {
			return addToFavUser;
		}

		/**
		 * 
		 * @param addToFavUser
		 */
		public void setAddToFavUser(final int addToFavUser) {
			this.addToFavUser = addToFavUser;
		}

		/**
		 * 
		 * @return
		 */
		public int getAddToFavCount() {
			return addToFavCount;
		}

		/**
		 * 
		 * @param addToFavCount
		 */
		public void setAddToFavCount(final int addToFavCount) {
			this.addToFavCount = addToFavCount;
		}
	}

}
