package com.ysyx.commons.wx.wxmsg;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.requests.wxmsg.AddKfAccountRequest;
import org.junit.Test;

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
