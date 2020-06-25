package com.automationpractice.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement signInItem = $(".login");

    public AuthenticationPage clickToLoginButton() {
        signInItem.click();
        return new AuthenticationPage();
    }
}
