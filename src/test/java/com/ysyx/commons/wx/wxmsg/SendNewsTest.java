package com.ysyx.commons.wx.wxmsg;

import com.ysyx.commons.wx.Response;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.WXMediaUploadResult;
import com.ysyx.commons.wx.requests.basesupport.EnumUploadMediaType;
import com.ysyx.commons.wx.requests.basesupport.GetAccessTokenRequest;
import com.ysyx.commons.wx.requests.basesupport.MediaUploadRequest;
import com.ysyx.commons.wx.requests.basesupport.respbeans.AccessToken;
import com.ysyx.commons.wx.requests.wxmsg.EnumSendType;
import com.ysyx.commons.wx.requests.wxmsg.SendRequest;
import com.ysyx.commons.wx.requests.wxmsg.UploadNewsRequest;

import org.junit.Test;

import java.io.File;

/**
 * Created by Daly.Osborn on 2015/2/13.
 */
public class SendNewsTest {
	
	private static final String APP_ID = "wxedabf9b277b61d91";
	private static final String APP_SECRET = "d9134bee753052e8df681c4514768e02";
	
    @Test
    public void testSendNews() {
        final GetAccessTokenRequest getAccessTokenRequest = new GetAccessTokenRequest(APP_ID, APP_SECRET);
        final Response<AccessToken> resp = getAccessTokenRequest.execute();
        final AccessToken accessToken = resp.get();

        final MediaUploadRequest mediaUploadRequest = new MediaUploadRequest(accessToken.getAccessToken(), EnumUploadMediaType.IMAGE, new File("D:\\tmp\\1404107585487.jpg"));
        final Response<WXMediaUploadResult> mediaUploadResultResponse = mediaUploadRequest.execute();
        final String mediaId = mediaUploadResultResponse.get().getMediaId();

        //创建图文
        final UploadNewsRequest uploadNewsRequest = new UploadNewsRequest(accessToken.getAccessToken());
        final UploadNewsRequest.ArticleItem articleItem = new UploadNewsRequest.ArticleItem(mediaId, "测试中文", "中午输入1222Test");
        articleItem.setAuthor("tttt");
        articleItem.setContentSourceUrl("");
        articleItem.setDigest("中文123iii");
        articleItem.setShowCoverPic(String.valueOf(1));
        uploadNewsRequest.append(articleItem);

        final Response<WXMediaUploadResult> uploadNewsResp = uploadNewsRequest.execute();
        final String newsMediaId = uploadNewsResp.get().getMediaId();


        //推送群发消息
        final SendRequest sendRequest = new SendRequest(accessToken.getAccessToken(), EnumSendType.MPNEWS);
        //final SendPreviewRequest sendRequest = new SendPreviewRequest(accessToken.getAccessToken(), EnumSendType.MPNEWS);
        sendRequest.setMediaId(newsMediaId);
        sendRequest.appendOpenId("onJmIs-vCXsTkf_J1z1Lv2uQ-2cw");

        final Response<WXCommonResult> sendResp = sendRequest.execute();
        final long msgId = sendResp.get().getMsgId();
    }
}
