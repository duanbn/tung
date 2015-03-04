package com.ysyx.commons.wx.user;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.requests.user.UpdateGroupRequest;
import org.junit.Test;

public class UpdateGroupRequestTest extends BaseTest {

	@Test
	public void test() {
		UpdateGroupRequest req = new UpdateGroupRequest(accessToken, 102, "test group");

		Response<WXCommonResult> resp = req.execute();

		displayResp(resp);
	}

}
