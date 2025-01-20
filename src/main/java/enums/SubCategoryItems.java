package enums;

import helpers.ConfigReader;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SubCategoryItems {
    GIT("GIT", "Git Tutorial","/git"),
    JIRA("Jira", "JIRA Tutorial","/jira"),
    OPEN_SHIFT("OpenShift", "OpenShift Tutorial","/openshift"),
    UNIX("UNIX", "Linux/Unix Tutorial","/unix");

    private static final String BASE_URL = ConfigReader.getProperty("url");
    private final String name;
    private final String title;
    private final String endpoint;

    public String getUrl() {
        return BASE_URL + endpoint;
    }
}
