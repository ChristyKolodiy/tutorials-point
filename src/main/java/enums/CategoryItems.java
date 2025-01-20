package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CategoryItems {
    AI_ML_DATA_SCIENCE("AI, ML, and Data Science"),
    PROGRAMMING_LANGUAGES("Programming Languages"),
    WEB_DEVELOPMENT_LANGUAGES("Web Development Languages"),
    DEVOPS("DevOps");

    private final String name;
}
