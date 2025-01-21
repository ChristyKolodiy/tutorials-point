package pages.uielements;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class NavigationBar extends AbstractUIElement {

    private final SelenideElement categoryButton = parentElement.$x(".//button[@aria-controls='category']");

    private final SelenideElement categoriesTable = parentElement.$("div.categories-menu > div > ul");

    public CategoryDropDownMenu clickOnCategoryButton() {
        categoryButton.shouldBe(visible, Duration.ofSeconds(60));
        categoryButton.click();
        return new CategoryDropDownMenu(categoriesTable);
    }

    public NavigationBar(SelenideElement parentElement) {
        super(parentElement);
    }
}
