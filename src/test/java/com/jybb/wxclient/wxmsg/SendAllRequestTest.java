package com.jybb.wxclient.wxmsg;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.requests.wxmsg.EnumSendType;
import com.jybb.wxclient.requests.wxmsg.SendAllRequest;

public class SendAllRequestTest extends BaseTest {

	@Test
	public void test() {
		SendAllRequest req = new SendAllRequest(accessToken, EnumSendType.TEXT);
		req.setContent("test message").setGroupId("102").setToAll(false);

		Response<WXCommonResult> resp = req.execute();

		displayResp(resp);
	}

}
