# Orange HRM Web Automation

This repository contains a complete automation framework for testing the [OrangeHRM](https://www.orangehrm.com/) web application. It uses Java, Selenium WebDriver, TestNG, and Cucumber with Maven for dependency management and Allure for reporting. It also supports integration with Jenkins for CI/CD.

## 🚀 Features

- Automates end-to-end test cases for OrangeHRM.
- Uses Page Object Model (POM) for code modularity and maintainability.
- BDD with Cucumber for readable feature files.
- Generates Allure test reports.
- Easily integrated with Jenkins for continuous testing.

## 🛠 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Cucumber (BDD)
- Maven
- Allure Reports
- Jenkins (CI/CD)
- Git & GitHub

## 📁 Project Structure

Orange-HRM-Web-Automation/
├── src/
│ ├── main/java/ # Page classes, utilities
│ └── test/java/ # Step Definitions, Test Runners
├── chromedriver/ # ChromeDriver binary
├── testng.xml # TestNG suite configuration
├── pom.xml # Maven configuration
└── README.md


## ⚙️ Setup Instructions

### Prerequisites

- Java JDK 8 or above
- Maven
- Chrome browser
- ChromeDriver executable
- IDE (Eclipse, IntelliJ, etc.)

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/Harinath2468/Orange-HRM-Web-Automation.git
   cd Orange-HRM-Web-Automation
