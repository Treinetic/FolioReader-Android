package com.folioreader.ui.base;

import androidx.annotation.Keep;

/**
 * @author gautam chibde on 12/6/17.
 */
@Keep
public interface HtmlTaskCallback extends BaseMvpView {
    void onReceiveHtml(String html);
}
