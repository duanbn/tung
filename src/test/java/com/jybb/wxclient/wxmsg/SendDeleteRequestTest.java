package com.jybb.wxclient.wxmsg;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.requests.wxmsg.SendDeleteRequest;

public class SendDeleteRequestTest extends BaseTest {

	@Test
	public void test() {
		SendDeleteRequest req = new SendDeleteRequest(accessToken, 1);
		
		Response<WXCommonResult> resp = req.execute();
		
		displayResp(resp);
	}
	
}
