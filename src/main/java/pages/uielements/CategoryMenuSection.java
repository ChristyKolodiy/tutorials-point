package pages.uielements;

import com.codeborne.selenide.SelenideElement;

import java.util.function.Supplier;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CategoryMenuSection extends AbstractUIElement {

    public CategoryMenuSection(SelenideElement parentElement) {
        super(parentElement);
    }

    public <T> T openMenuItem(String menuItemName, Supplier<T> pageSupplier) {
        $x(format(".//a[text()='%s']", menuItemName)).shouldBe(visible).click();
        return pageSupplier.get();
    }
}
