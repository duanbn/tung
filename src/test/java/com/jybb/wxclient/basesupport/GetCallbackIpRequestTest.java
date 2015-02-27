package com.jybb.wxclient.basesupport;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.basesupport.GetCallbackIpRequest;
import com.jybb.wxclient.requests.basesupport.respbeans.CallbackIp;

public class GetCallbackIpRequestTest extends BaseTest {

	@Test
	public void test() {
		Response<CallbackIp> resp = new GetCallbackIpRequest(accessToken).execute();

		displayResp(resp);
	}

}
