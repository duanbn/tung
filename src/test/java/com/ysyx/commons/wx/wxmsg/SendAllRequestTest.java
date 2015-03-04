package com.ysyx.commons.wx.wxmsg;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.requests.wxmsg.EnumSendType;
import com.ysyx.commons.wx.requests.wxmsg.SendAllRequest;
import org.junit.Test;

public class SendAllRequestTest extends BaseTest {

	@Test
	public void test() {
		SendAllRequest req = new SendAllRequest(accessToken, EnumSendType.TEXT);
		req.setContent("test message").setGroupId("102").setToAll(false);

		Response<WXCommonResult> resp = req.execute();

		displayResp(resp);
	}

}
