package com.ysyx.commons.wx.requests.wxmsg;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXMediaUploadResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * upload news request.
 *
 * @author duanbn
 */
@Post("/cgi-bin/media/uploadnews")
public class UploadNewsRequest extends TextHttpRequest<WXMediaUploadResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("articles")
	private final List<ArticleItem> articles = new ArrayList<ArticleItem>();

	/**
	 * 
	 * @param accessToken
	 */
	public UploadNewsRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
     *
     */
	public void append(final List<ArticleItem> items) {
		articles.addAll(items);
	}

	/**
     *
     */
	public void append(final ArticleItem item) {
		articles.add(item);
	}

	/**
     *
     */
	public void clean() {
		this.articles.clear();
	}

	/**
	 * 
	 * @return
	 */
	public List<ArticleItem> getArticles() {
		return articles;
	}

	/**
	 * 
	 * @author apple
	 *
	 */
	public static class ArticleItem {

		@JsonProperty("thumb_media_id")
		private final String thumbMediaId;

		@JsonProperty("author")
		private String author;

		@JsonProperty("title")
		private final String title;

		@JsonProperty("content_source_url")
		private String contentSourceUrl;

		@JsonProperty("content")
		private final String content;

		@JsonProperty("digest")
		private String digest;

		@JsonProperty("show_cover_pic")
		private String showCoverPic;

		/**
	     *
	     */
		public ArticleItem(final String thumbMediaId, final String title, final String content) {
			this.thumbMediaId = thumbMediaId;
			this.title = title;
			this.content = content;
		}

		/**
	     *
	     */
		public String getAuthor() {
			return author;
		}

		/**
	     *
	     */
		public void setAuthor(final String author) {
			this.author = author;
		}

		/**
	     *
	     */
		public String getContentSourceUrl() {
			return contentSourceUrl;
		}

		/**
	     *
	     */
		public void setContentSourceUrl(final String contentSourceUrl) {
			this.contentSourceUrl = contentSourceUrl;
		}

		/**
	     *
	     */
		public String getDigest() {
			return digest;
		}

		/**
	     *
	     */
		public void setDigest(final String digest) {
			this.digest = digest;
		}

		/**
	     *
	     */
		public String getShowCoverPic() {
			return showCoverPic;
		}

		/**
	     *
	     */
		public void setShowCoverPic(final String showCoverPic) {
			this.showCoverPic = showCoverPic;
		}

	}

}
