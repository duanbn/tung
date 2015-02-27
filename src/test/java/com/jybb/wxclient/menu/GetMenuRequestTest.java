package com.jybb.wxclient.menu;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.menu.GetMenuRequest;
import com.jybb.wxclient.requests.menu.respbeans.GetMenuResult;

public class GetMenuRequestTest extends BaseTest {

	@Test
	public void test() {
		GetMenuRequest req = new GetMenuRequest(accessToken);
		
		Response<GetMenuResult> resp = req.execute();
		
		displayResp(resp);
	}

}
