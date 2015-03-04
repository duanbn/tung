package com.ysyx.commons.wx.basesupport;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.basesupport.GetCallbackIpRequest;
import com.ysyx.commons.wx.requests.basesupport.respbeans.CallbackIp;
import org.junit.Test;

public class GetCallbackIpRequestTest extends BaseTest {

	@Test
	public void test() {
		Response<CallbackIp> resp = new GetCallbackIpRequest(accessToken).execute();

		displayResp(resp);
	}

}
