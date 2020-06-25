package com.automationpractice.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void setUp() {
        Configuration.baseUrl = "http://automationpractice.com/index.php";
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void tearDown() {

        Selenide.clearBrowserCookies();
    }
}
