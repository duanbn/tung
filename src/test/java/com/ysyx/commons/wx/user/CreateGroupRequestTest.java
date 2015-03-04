package com.ysyx.commons.wx.user;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.user.CreateGroupRequest;
import com.ysyx.commons.wx.requests.user.respbeans.CreateGroupResult;
import org.junit.Test;

public class CreateGroupRequestTest extends BaseTest {

	@Test
	public void test() {
		CreateGroupRequest req = new CreateGroupRequest(accessToken, "test group");
		
		Response<CreateGroupResult> resp = req.execute();
		
		displayResp(resp);
	}

}
