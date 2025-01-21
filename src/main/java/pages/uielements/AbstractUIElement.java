package pages.uielements;

import com.codeborne.selenide.SelenideElement;

public abstract class AbstractUIElement {

    protected final SelenideElement parentElement;

    public AbstractUIElement(SelenideElement parentElement) {
        this.parentElement = parentElement;
    }
}
