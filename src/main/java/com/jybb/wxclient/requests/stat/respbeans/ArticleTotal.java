package com.jybb.wxclient.requests.stat.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * statisic data of article total.
 * 
 * @author duanbn
 *
 */
public class ArticleTotal {
	
	@JsonProperty("list")
	private List<Article> list;
	
	/**
	 * 
	 * @return
	 */
	public List<Article> getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 */
	public void setList(final List<Article> list) {
		this.list = list;
	}

	/**
	 * 
	 * @author duanbn
	 *
	 */
	public static class Article {
		@JsonProperty("ref_date")
		private String refDate;
		
		@JsonProperty("msgid")
		private String msgId;
		
		@JsonProperty("title")
		private String title;
		
		@JsonProperty("details")
		private List<Summary> details;

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
		public List<Summary> getDetails() {
			return details;
		}

		/**
		 * 
		 * @param details
		 */
		public void setDetails(final List<Summary> details) {
			this.details = details;
		}
	}

	/**
	 * 
	 * @author duanbn
	 *
	 */
	public static class Summary {
		@JsonProperty("stat_date")
		private String statDate;
		
		@JsonProperty("target_user")
		private int targetUser;

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
		public String getStatDate() {
			return statDate;
		}

		/**
		 * 
		 * @param statDate
		 */
		public void setStatDate(final String statDate) {
			this.statDate = statDate;
		}

		/**
		 * 
		 * @return
		 */
		public int getTargetUser() {
			return targetUser;
		}

		/**
		 * 
		 * @param targetUser
		 */
		public void setTargetUser(final int targetUser) {
			this.targetUser = targetUser;
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
