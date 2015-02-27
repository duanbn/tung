package com.jybb.wxclient.wxmsg;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.WXMediaUploadResult;
import com.jybb.wxclient.requests.wxmsg.UploadNewsRequest;
import com.jybb.wxclient.requests.wxmsg.UploadNewsRequest.ArticleItem;

public class UploadNewsRequestTest extends BaseTest {

	@Test
	public void test() {

		UploadNewsRequest req = new UploadNewsRequest(accessToken);
		req.append(new ArticleItem("t1XT1CRygSkJxBNIvR3WGSjvAeXuKX95fjuW2aNOGpOEgeX4QX59gbPzl2Xl2r9Q", "test",
				"test test"));

		Response<WXMediaUploadResult> resp = req.execute();

		displayResp(resp);

	}
}
