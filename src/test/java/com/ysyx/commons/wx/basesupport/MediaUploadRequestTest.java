package com.ysyx.commons.wx.basesupport;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXMediaUploadResult;
import com.ysyx.commons.wx.requests.basesupport.EnumUploadMediaType;
import com.ysyx.commons.wx.requests.basesupport.MediaUploadRequest;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class MediaUploadRequestTest extends BaseTest {

	@Test
	public void test() {
		String fileName = "1404107585487.jpg";
		URL fileUrl = Thread.currentThread().getContextClassLoader().getResource(fileName);
		File media = new File(fileUrl.getFile());

		MediaUploadRequest req = new MediaUploadRequest(accessToken, EnumUploadMediaType.IMAGE, media);

		Response<WXMediaUploadResult> resp = req.execute();

		displayResp(resp);
	}

}