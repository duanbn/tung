package com.ysyx.commons.wx.wxmsg;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.requests.wxmsg.SendDeleteRequest;
import org.junit.Test;

public class SendDeleteRequestTest extends BaseTest {

	@Test
	public void test() {
		SendDeleteRequest req = new SendDeleteRequest(accessToken, 1);
		
		Response<WXCommonResult> resp = req.execute();
		
		displayResp(resp);
	}
	
}
