package com.automationpractice.tests;

import com.automationpractice.pages.AccountPage;
import com.automationpractice.pages.AuthenticationPage;
import com.automationpractice.pages.HomePage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    private final String userEmail = "kevef56801@unknmail.com";
    private final String userPassword = "testtest";
    private final String accountName = "Jack Test";


    @Test
    public void userLogin() {
        Selenide.open("");
        new HomePage().clickToLoginButton();
        new AuthenticationPage().fiilLoginForm(userEmail, userPassword);
        String accountActualName = new AccountPage().getAccountName();
        Assertions.assertEquals(accountName, accountActualName);
    }
}
