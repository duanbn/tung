package com.jybb.wxclient.account;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.account.GetShortUrlRequest;
import com.jybb.wxclient.requests.account.respbeans.ShortUrlResult;

public class GetShortUrlRequestTest extends BaseTest {

	@Test
	public void test() {

		String testUrl = "http://wap.koudaitong.com/v2/showcase/goods?alias=128wi9shh&spm=h56083&redirect_count=1";

		GetShortUrlRequest req = new GetShortUrlRequest(accessToken, testUrl);

		Response<ShortUrlResult> resp = req.execute();

		displayResp(resp);

	}

}
