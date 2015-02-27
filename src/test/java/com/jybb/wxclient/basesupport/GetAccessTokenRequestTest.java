package com.jybb.wxclient.basesupport;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.basesupport.GetAccessTokenRequest;
import com.jybb.wxclient.requests.basesupport.respbeans.AccessToken;

public class GetAccessTokenRequestTest extends BaseTest {

	@Test
	public void test() {
		GetAccessTokenRequest req = new GetAccessTokenRequest();

		Response<AccessToken> resp = req.execute();

		displayResp(resp);
	}

}
