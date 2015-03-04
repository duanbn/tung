package com.ysyx.commons.wx.requests.basesupport;

import com.ysyx.commons.wx.FileUploadHttpRequest;
import com.ysyx.commons.wx.WXMediaUploadResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;

import java.io.File;

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
