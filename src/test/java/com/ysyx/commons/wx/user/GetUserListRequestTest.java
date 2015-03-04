package com.ysyx.commons.wx.user;

import com.ysyx.commons.wx.BaseTest;
import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.requests.user.GetUserListRequest;
import com.ysyx.commons.wx.requests.user.respbeans.UserListResult;
import org.junit.Test;

public class GetUserListRequestTest extends BaseTest {

	@Test
	public void test() {
		GetUserListRequest req = new GetUserListRequest(accessToken);
		
		Response<UserListResult> resp = req.execute();
		
		displayResp(resp);
	}
	
}
