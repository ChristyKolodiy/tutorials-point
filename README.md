## Selenide Automation Framework - TutorialsPoint

This document outlines the basic structure and usage of a Selenide automation framework built using Selenide with the Page Object Model.

## Installation

1. **Choose and Install an IDE**
2. **Install Java 17 or higher:** Download and install Java 17(or higher) from the official Oracle website or use a suitable Java distribution.
3. **Git:** Install Git from [https://git-scm.com/](https://git-scm.com/).
4. **Maven:** Install Maven from [https://maven.apache.org/](https://maven.apache.org/).
5. **Clone this repository:** `git clone <your-repository-url>`.


**1. Introduction**

This framework aims to automate tests for the TutorialsPoint website, specifically navigating to the Unix page. It demonstrates key concepts like:

*   Page Object Model
*   WebDriver Management
*   Test Data Handling

**2. Key Components**

*   **DriverManager:**
    *   Manages the creation and teardown of the WebDriver instance.
    *   Uses open-source Java library that carries out the management (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver.
    *   Ensures thread safety using `ThreadLocal`.
    *   Handles WebDriver configuration (e.g., browser, headless mode).
*   **Page Object Model:**
    *   Represents web pages as classes (e.g., `MainPage`, `UnixPage`).
    *   Encapsulates page elements and their interactions.
    *   Improves code readability, maintainability, and usability.
*   **Utility Classes:**
    *   `ConfigReader`: Reads configuration parameters from a properties file.

**4. Testing Approach**

*   **Framework:** Uses TestNG for test execution. Uses Maven for build automation and dependency management.
*   **Assertions:** Verifies successful navigation by asserting page title, extracting part of URL.

**5. Example Test Case:**

*   `UnixNavigationTest`:
    *   Navigates to the TutorialsPoint homepage.
    *   Clicks on the 'Category' button.
    *   Selects the "DevOps" category from the dropdown.
    *   Selects the "Unix" sub-category.
    *   Asserts that the page title contains "Linux/Unix Tutorial" and URL contains "unix"'.

**6. Further Enhancements**

*   Implement more robust error handling and reporting.
*   Integrate with a reporting framework (e.g., Allure, Extent Reports).
*   Add support for different browsers (e.g., Chrome, Firefox, Edge).



