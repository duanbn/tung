package com.ysyx.commons.wx.basesupport;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.basesupport.GetAccessTokenRequest;
import com.ysyx.commons.wx.requests.basesupport.respbeans.AccessToken;
import org.junit.Test;

public class GetAccessTokenRequestTest extends BaseTest {

	@Test
	public void test() {
		GetAccessTokenRequest req = new GetAccessTokenRequest();

		Response<AccessToken> resp = req.execute();

		displayResp(resp);
	}

}
