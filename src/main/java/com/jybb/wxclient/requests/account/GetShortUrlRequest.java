package com.jybb.wxclient.requests.account;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.account.respbeans.ShortUrlResult;

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
