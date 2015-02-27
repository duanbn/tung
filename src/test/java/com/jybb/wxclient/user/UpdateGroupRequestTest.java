package com.jybb.wxclient.user;

import org.junit.Test;

import com.jybb.wxclient.BaseTest;
import com.jybb.wxclient.Response;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.requests.user.UpdateGroupRequest;

public class UpdateGroupRequestTest extends BaseTest {

	@Test
	public void test() {
		UpdateGroupRequest req = new UpdateGroupRequest(accessToken, 102, "test group");

		Response<WXCommonResult> resp = req.execute();

		displayResp(resp);
	}

}
