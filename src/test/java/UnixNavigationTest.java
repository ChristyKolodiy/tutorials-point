import enums.SubCategoryItems;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.UnixPage;

import static enums.CategoryItems.DEVOPS;
import static java.lang.String.format;

public class UnixNavigationTest extends BaseWebTest {
    private static final String INCORRECT_URL_MESSAGE = "Current URL should be equal to '%s'";
    private static final String INCORRECT_TITLE_MESSAGE = "Current title should be equal to '%s'";

    private MainPage mainPage;

    @BeforeClass
    public void beforeMethod() {
        mainPage = new MainPage();
    }

    @Test
    public void checkUnixPageIsOpened() {
        UnixPage unixPage = mainPage
                .getNavBar()
                .clickOnCategoryButton()
                .selectCategoryByText(DEVOPS.getName())
                .openMenuItem(SubCategoryItems.UNIX.getName(), UnixPage::new);
        boolean isUnixPageOpened = unixPage.isOpened();

        softly.assertThat(isUnixPageOpened)
                .as(format(INCORRECT_URL_MESSAGE, SubCategoryItems.UNIX.getUrl()))
                .isTrue();
        softly.assertThat(unixPage.isTitleDisplayed())
                .as(format(INCORRECT_TITLE_MESSAGE, SubCategoryItems.UNIX.getTitle()))
                .isTrue();
        softly.assertAll();
    }
}
