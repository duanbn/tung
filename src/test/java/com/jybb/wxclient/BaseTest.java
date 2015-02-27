package com.jybb.wxclient;

public class BaseTest {

	protected String accessToken = "iHGaXu7uqO7lqdxd7hQxKeX9eA6vQ3DPu2BSZFv9skZivl9DGIKbjQbg24Jh9K4-tY-xOcZOoGJBvXkzV6Y8fBNbj4EX7FUDReSlb-3N5Rg";

	protected String IMAGE_MEDIA_ID = "t1XT1CRygSkJxBNIvR3WGSjvAeXuKX95fjuW2aNOGpOEgeX4QX59gbPzl2Xl2r9Q";

	protected void displayResp(Response<?> resp) {
		if (resp.isOK()) {
			System.out.println(resp.get());
		} else {
			System.out.println(resp.getCode() + " " + resp.getErrMessage());
		}
	}

}
