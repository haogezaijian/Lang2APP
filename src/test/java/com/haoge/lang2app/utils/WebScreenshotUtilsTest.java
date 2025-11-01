package com.haoge.lang2app.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebScreenshotUtilsTest {

    @Test
    void saveWebPageScreenshot() {
        String path = WebScreenshotUtils.saveWebPageScreenshot("https://www.baidu.com");
        Assertions.assertNotNull(path);
        System.out.println(path);
    }
}