package com.jybb.wxclient.requests.basesupport;

import com.jybb.wxclient.FileDownloadHttpRequest;
import com.jybb.wxclient.annotations.Get;
import com.jybb.wxclient.annotations.QueryString;

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
