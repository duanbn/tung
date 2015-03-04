package com.ysyx.commons.wx.account;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.account.GetShortUrlRequest;
import com.ysyx.commons.wx.requests.account.respbeans.ShortUrlResult;
import org.junit.Test;

public class GetShortUrlRequestTest extends BaseTest {

	@Test
	public void test() {

		String testUrl = "http://wap.koudaitong.com/v2/showcase/goods?alias=128wi9shh&spm=h56083&redirect_count=1";

		GetShortUrlRequest req = new GetShortUrlRequest(accessToken, testUrl);

		Response<ShortUrlResult> resp = req.execute();

		displayResp(resp);

	}

}
