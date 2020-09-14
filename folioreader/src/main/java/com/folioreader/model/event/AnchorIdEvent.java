package com.folioreader.model.event;

import androidx.annotation.Keep;

/**
 * Created by Shrikant on 7/28/2017.
 */
@Keep
public class AnchorIdEvent {
    private String href;

    public AnchorIdEvent() {
    }

    public AnchorIdEvent(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}