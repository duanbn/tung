package com.jybb.wxclient.requests.account;

import java.util.LinkedHashMap;
import java.util.Map;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.account.respbeans.QRCodeResult;
import com.jybb.wxclient.util.JsonUtil;

/**
 * create a permanent two-dimension code.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/qrcode/create")
public class CreatePermanentQRCodeRequest extends TextHttpRequest<QRCodeResult> {

	@QueryString("access_token")
	private final String accessToken;

	private static final String ACTION_NAME = "QR_LIMIT_SCENE";

	private final int sceneId;

	/**
	 * 
	 * @param accessToken
	 * @param sceneId
	 */
	public CreatePermanentQRCodeRequest(final String accessToken, final int sceneId) {
		this.accessToken = accessToken;
		this.sceneId = sceneId;
	}

	/**
	 * 
	 */
	@Override
	protected String getPostData() {
		final Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("action_name", ACTION_NAME);
		final Map<String, Object> actionInfoMap = new LinkedHashMap<String, Object>();
		final Map<String, Integer> sceneIdMap = new LinkedHashMap<String, Integer>();
		sceneIdMap.put("scene_id", this.sceneId);
		actionInfoMap.put("scene", sceneIdMap);
		data.put("action_info", actionInfoMap);
		return JsonUtil.toJson(data);
	}

}
