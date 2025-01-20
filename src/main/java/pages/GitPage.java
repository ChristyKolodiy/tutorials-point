package pages;

import com.codeborne.selenide.WebDriverRunner;
import enums.SubCategoryItems;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class GitPage extends GenericPage {

    @Override
    public boolean isOpened() {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains(SubCategoryItems.GIT.getUrl());
    }

    @Override
    public boolean isTitleDisplayed() {
        return $x("//h1").shouldHave(text(SubCategoryItems.GIT.getTitle())).isDisplayed();
    }
}
