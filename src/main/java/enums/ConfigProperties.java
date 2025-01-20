package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ConfigProperties {
    URL("url"),
    TIMEOUT("timeout");

    private final String name;
}
