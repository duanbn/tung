package com.ysyx.commons.wx.user;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.user.GetGroupRequest;
import com.ysyx.commons.wx.requests.user.respbeans.GetGroupResult;
import org.junit.Test;

public class GetGroupRequestTest extends BaseTest {

	@Test
	public void test() {
		GetGroupRequest req = new GetGroupRequest(accessToken);

		Response<GetGroupResult> resp = req.execute();

		displayResp(resp);
	}

}
