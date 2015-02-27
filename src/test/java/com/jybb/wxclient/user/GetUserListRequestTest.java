package com.jybb.wxclient.user;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.user.GetUserListRequest;
import com.jybb.wxclient.requests.user.respbeans.UserListResult;

public class GetUserListRequestTest extends BaseTest {

	@Test
	public void test() {
		GetUserListRequest req = new GetUserListRequest(accessToken);
		
		Response<UserListResult> resp = req.execute();
		
		displayResp(resp);
	}
	
}
