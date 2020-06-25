package com.automationpractice.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    private SelenideElement logoutItem = $(".logout");
    private SelenideElement actualAccountName=$(".account");

    public void logout() {

        logoutItem.shouldBe(Condition.visible).click();
    }

    public String getAccountName() {
       return actualAccountName.getText();
    }
}
