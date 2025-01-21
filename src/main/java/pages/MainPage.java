package pages;

import com.codeborne.selenide.SelenideElement;
import pages.uielements.NavigationBar;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement mainNavBar = $("header.header.show");

    public NavigationBar getNavBar() {
        mainNavBar.shouldBe(visible);
        return new NavigationBar(mainNavBar);
    }
}

