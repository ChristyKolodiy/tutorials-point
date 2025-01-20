package pages;

import com.codeborne.selenide.WebDriverRunner;
import enums.SubCategoryItems;

public class UnixPage extends GenericPage {

    @Override
    public boolean isTitleDisplayed() {
        return WebDriverRunner.getWebDriver().getTitle().equals((SubCategoryItems.UNIX.getTitle()));
    }

    @Override
    public boolean isOpened() {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains(SubCategoryItems.UNIX.getUrl());
    }
}
