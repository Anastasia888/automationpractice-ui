package com.automationpractice.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage {
    private SelenideElement userEmail = $("input[name='email']");
    private SelenideElement userPassword = $("input[name='passwd']");
    private SelenideElement loginButton = $("#SubmitLogin");

    public void fiilLoginForm(String email, String password) {
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        loginButton.click();
    }

}
