package com.jybb.wxclient.user;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.user.CreateGroupRequest;
import com.jybb.wxclient.requests.user.respbeans.CreateGroupResult;

public class CreateGroupRequestTest extends BaseTest {

	@Test
	public void test() {
		CreateGroupRequest req = new CreateGroupRequest(accessToken, "test group");
		
		Response<CreateGroupResult> resp = req.execute();
		
		displayResp(resp);
	}

}
