package pages.uielements;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.util.NoSuchElementException;

public class CategoryDropDownMenu extends AbstractUIElement implements IDropdownMenu {

    private final ElementsCollection menuCategories = parentElement.$$("li");

    private final SelenideElement menuSection = parentElement.$x(".//div[@class= 'categories-menu-sections-wrapper']");

    public CategoryDropDownMenu(SelenideElement parentElement) {
        super(parentElement);
    }

    @Override
    public CategoryMenuSection selectCategoryByText(String categoryName) {
        menuCategories.shouldHave(CollectionCondition.sizeGreaterThan(0), Duration.ofSeconds(60));
        menuCategories.stream().filter(el -> el.getText().equals(categoryName)).findFirst()
                .orElseThrow(() -> new NoSuchElementException("No items in a dropdown menu with a text: " + categoryName))
                .click();
        return new CategoryMenuSection(menuSection);
    }
}
