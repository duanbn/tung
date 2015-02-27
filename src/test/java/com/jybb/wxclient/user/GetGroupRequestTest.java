package com.jybb.wxclient.user;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.requests.user.GetGroupRequest;
import com.jybb.wxclient.requests.user.respbeans.GetGroupResult;

public class GetGroupRequestTest extends BaseTest {

	@Test
	public void test() {
		GetGroupRequest req = new GetGroupRequest(accessToken);

		Response<GetGroupResult> resp = req.execute();

		displayResp(resp);
	}

}
