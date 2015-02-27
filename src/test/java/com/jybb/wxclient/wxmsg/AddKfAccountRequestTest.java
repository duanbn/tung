package com.jybb.wxclient.wxmsg;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.wxmsg.AddKfAccountRequest;

public class AddKfAccountRequestTest extends BaseTest {

	@Test
	public void test() {
		String kfAccount = "test@test.com";
		String nickName = "测试客服";

		AddKfAccountRequest req = new AddKfAccountRequest(accessToken, kfAccount, nickName);
		Response<WXCommonResult> resp = req.execute();

		displayResp(resp);
	}
}
