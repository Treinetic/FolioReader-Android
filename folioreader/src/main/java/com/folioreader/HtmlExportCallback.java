package com.folioreader;

import androidx.annotation.Keep;

@Keep
public interface HtmlExportCallback {

    String exportHtml(String data);
}
