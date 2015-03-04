package com.ysyx.commons.wx.requests.basesupport;

import com.ysyx.commons.wx.FileDownloadHttpRequest;
import com.ysyx.commons.wx.annotations.Get;
import com.ysyx.commons.wx.annotations.QueryString;

/**
 * 
 * @author duanbn
 *
 */
@Get("/cgi-bin/media/get")
public class MediaDownloadRequest extends FileDownloadHttpRequest {

	@QueryString("access_token")
	private final String accessToken;

	@QueryString("media_id")
	private final String mediaId;

	/**
	 * 
	 * @param accessToken
	 * @param mediaId
	 */
	public MediaDownloadRequest(final String accessToken, final String mediaId) {
		this.accessToken = accessToken;
		this.mediaId = mediaId;
	}

}
