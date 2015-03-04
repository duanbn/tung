package com.ysyx.commons.wx.requests.wxmsg;

import org.codehaus.jackson.annotate.JsonProperty;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;

/**
 * send template message request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/message/template/send")
public class SendTemplateMessageRequest<T> extends TextHttpRequest<WXCommonResult> {
    
    @QueryString("access_token")
	private final String accessToken;

    @JsonProperty("touser")
    private final String toUser;

    @JsonProperty("template_id")
    private final String templateId;

    @JsonProperty("url")
    private final String url;

    @JsonProperty("topcolor")
    private String topcolor = "#FF0000";

    /**
     * defferent template has defferent data structure.
     * reference weixin's document.
     */
    @JsonProperty("data")
    private final T data;

    /**
     *
     */
    public SendTemplateMessageRequest(final String accessToken, final String toUser, final String templateId, final String url, final T data) {
        this.accessToken = accessToken;
        this.toUser = toUser;
        this.templateId = templateId;
        this.url = url;
        this.data = data;
    }
    
    /**
     *
     */
    public String getTopcolor() {
        return topcolor;
    }
    
    /**
     *
     */
    public void setTopcolor(final String topcolor) {
        this.topcolor = topcolor;
    }
}
