package com.jybb.wxclient.requests.basesupport;

import java.io.File;

import com.jybb.wxclient.FileUploadHttpRequest;
import com.jybb.wxclient.WXMediaUploadResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

/**
 * upload request.
 *
 * @author duanbn
 */
@Post("/cgi-bin/media/upload")
public class MediaUploadRequest extends FileUploadHttpRequest<WXMediaUploadResult> {

	@QueryString("access_token")
	private final String accessToken;

	@QueryString("type")
	private final String type;

	/**
	 * @param accessToken
	 * @param mediaType
	 * @param file
	 */
	public MediaUploadRequest(final String accessToken, final EnumUploadMediaType mediaType, final File file) {
		super(file);
		this.accessToken = accessToken;
		this.type = mediaType.getValue();
	}

}
