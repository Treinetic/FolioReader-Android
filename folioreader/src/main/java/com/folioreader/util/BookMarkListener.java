package com.folioreader.util;

import androidx.annotation.Keep;

import com.folioreader.model.locators.ReadLocator;
@Keep
public interface BookMarkListener {

    void saveBookMark(ReadLocator readLocator);
}
