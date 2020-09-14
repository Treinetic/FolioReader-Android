package com.folioreader.util;

import androidx.annotation.Keep;

import com.folioreader.model.locators.ReadLocator;

/**
 * Created by Hrishikesh Kadam on 17/04/2018.
 */
@Keep
public interface ReadLocatorListener {

    void saveReadLocator(ReadLocator readLocator);
}
