package com.automationpractice.tests;

import com.automationpractice.pages.AccountPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutByUI() {
        new LoginTest().userLogin();
        new AccountPage().logout();
    }

    @Test
    public void logoutByAccountURL() {
        new LoginTest().userLogin();
        open("?mylogout");
    }
}
