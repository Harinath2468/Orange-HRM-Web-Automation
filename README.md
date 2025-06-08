# Orange HRM Web Automation

This project automates test scenarios for the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) application using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** design pattern. It is designed to ensure test reliability, maintainability, and easy integration into CI/CD pipelines.

## 📌 Features

- Login functionality validation
- Admin and PIM module automation
- Employee management test flows
- Page Object Model (POM) structure for code reusability
- TestNG for test execution and assertions
- Maven for dependency management and build
- Apache POI integration for data-driven testing (Excel)

## 🔧 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI (for Excel data)
- PageFactory / POM
- ExtentReports (if integrated)

## 📁 Project Structure

```bash
Orange-HRM-Web-Automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/         # Page classes for each module (LoginPage, DashboardPage, etc.)
│   │       └── utils/         # Utility classes (e.g., ExcelUtils, WebDriverUtils)
│   ├── test/
│       └── java/
│           └── tests/         # Test classes (LoginTest, AdminTest, etc.)
│
├── testng.xml                 # TestNG suite configuration
├── pom.xml                    # Maven dependencies and build settings
└── README.md
