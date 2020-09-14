package com.folioreader.model.event;

import androidx.annotation.Keep;

/**
 * @author gautam chibde on 14/6/17.
 */
@Keep
public class MediaOverlayHighlightStyleEvent {
    public enum Style {
        UNDERLINE, BACKGROUND, DEFAULT,
    }

    private Style style;

    public MediaOverlayHighlightStyleEvent(Style style) {
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }
}