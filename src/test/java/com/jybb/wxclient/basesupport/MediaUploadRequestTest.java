package com.jybb.wxclient.basesupport;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.WXMediaUploadResult;
import com.jybb.wxclient.requests.basesupport.EnumUploadMediaType;
import com.jybb.wxclient.requests.basesupport.MediaUploadRequest;

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