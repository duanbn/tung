package com.ysyx.commons.wx.basesupport;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.basesupport.MediaDownloadRequest;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class MediaDownloadRequestTest extends BaseTest {

	@Test
	public void test() throws Exception {
		URL fileUrl = Thread.currentThread().getContextClassLoader().getResource("");
		File downloadFile = new File(fileUrl.getFile(), "download.jpg");

		String mediaId = "t1XT1CRygSkJxBNIvR3WGSjvAeXuKX95fjuW2aNOGpOEgeX4QX59gbPzl2Xl2r9Q";

		MediaDownloadRequest req = new MediaDownloadRequest(accessToken, mediaId);

		Response<byte[]> resp = req.execute();

		FileUtils.writeByteArrayToFile(downloadFile, resp.get());

		displayResp(resp);
	}
}