# Selenium Automation Framework

A scalable, data-driven test automation framework built with Java 21, Selenium 4, and TestNG.

## Tech Stack
- Java 21
- Selenium WebDriver 4.38
- TestNG 7.11
- ExtentReports 5
- Apache POI (Excel data)
- Jackson (JSON data)
- Log4j2
- WebDriverManager
- AssertJ

## Project Structure

    src/
    ├── main/java/com/tsd/
    │   ├── annotation/      # @FrameworkAnnotation
    │   ├── constant/        # FrameworkConstant
    │   ├── driver/          # Driver, DriverManager
    │   ├── enums/           # WaitStrategy, CategoryType, ConfigProperties
    │   ├── factory/         # DriverFactory, ExplicitWaitFactory
    │   ├── listeners/       # ListenerClass, MethodInterceptor, AnnotationTransformer
    │   ├── pages/           # BasePage, page objects
    │   ├── reports/         # ExtentLogger, ExtentManager, ExtentReport
    │   └── utils/           # ConfigUtils, ScreenshotUtils, ExcelUtils, JsonUtils
    ├── main/resources/
    │   └── log4j2.xml
    └── test/java/com/tsd/test/
        └── OrangeHRMTests.java

## How to Run

    # Run full suite
    mvn test

    # Run specific category
    mvn test -Dcategories=SANITY

    # Run on specific browser
    mvn test -Dbrowser=chrome

## Reports
After execution, open extent-test-output/index.html in a browser to view
the test report with screenshots on failure.
