package com.ysyx.commons.wx.requests.account;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.account.respbeans.ShortUrlResult;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * gen a short url by long url.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/shorturl")
public class GetShortUrlRequest extends TextHttpRequest<ShortUrlResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("action")
	private final String action;

	@JsonProperty("long_url")
	private final String longUrl;

	/**
	 * 
	 * @param accessToken
	 * @param longUrl
	 */
	public GetShortUrlRequest(final String accessToken, final String longUrl) {
		this.accessToken = accessToken;
		this.action = "long2short";
		this.longUrl = longUrl;
	}

}
