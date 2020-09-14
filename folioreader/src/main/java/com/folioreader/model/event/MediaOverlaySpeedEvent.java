package com.folioreader.model.event;

import androidx.annotation.Keep;

/**
 * @author gautam chibde on 14/6/17.
 */
@Keep
public class MediaOverlaySpeedEvent {

    public enum Speed {
        HALF, ONE, ONE_HALF, TWO,
    }

    private Speed speed;

    public MediaOverlaySpeedEvent(Speed speed) {
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }
}
