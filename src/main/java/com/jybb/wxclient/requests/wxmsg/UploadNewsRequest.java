package com.jybb.wxclient.requests.wxmsg;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXMediaUploadResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

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
