package com.ysyx.commons.wx.wxmsg;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXMediaUploadResult;
import com.ysyx.commons.wx.requests.wxmsg.UploadNewsRequest;
import com.ysyx.commons.wx.requests.wxmsg.UploadNewsRequest.ArticleItem;
import org.junit.Test;

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
