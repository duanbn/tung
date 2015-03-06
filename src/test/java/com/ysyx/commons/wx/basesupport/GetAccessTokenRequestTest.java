package com.ysyx.commons.wx.basesupport;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.basesupport.GetAccessTokenRequest;
import com.ysyx.commons.wx.requests.basesupport.respbeans.AccessToken;

import org.junit.Test;

public class GetAccessTokenRequestTest extends BaseTest {
	
	private static final String APP_ID = "wxedabf9b277b61d91";
	private static final String APP_SECRET = "d9134bee753052e8df681c4514768e02";
	
	@Test
	public void test() {
		GetAccessTokenRequest req = new GetAccessTokenRequest(APP_ID, APP_SECRET);

		Response<AccessToken> resp = req.execute();

		displayResp(resp);
	}

}
