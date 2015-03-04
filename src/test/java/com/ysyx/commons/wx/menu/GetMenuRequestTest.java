package com.ysyx.commons.wx.menu;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.menu.GetMenuRequest;
import com.ysyx.commons.wx.requests.menu.respbeans.GetMenuResult;
import org.junit.Test;

public class GetMenuRequestTest extends BaseTest {

	@Test
	public void test() {
		GetMenuRequest req = new GetMenuRequest(accessToken);
		
		Response<GetMenuResult> resp = req.execute();
		
		displayResp(resp);
	}

}
