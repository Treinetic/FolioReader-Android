package com.folioreader.model.event;

import androidx.annotation.Keep;

/**
 * Created by PC on 12/24/2016.
 */
@Keep
public class WebViewPosition {
    private String href;
    private String highlightId;

    public String getHref() {
        return href;
    }

    public WebViewPosition(String href, String highlightId) {
        this.href = href;
        this.highlightId = highlightId;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getHighlightId() {
        return highlightId;
    }

    public void setHighlightId(String highlightId) {
        this.highlightId = highlightId;
    }
}
