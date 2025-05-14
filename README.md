# 🌐 Web Automation Basics

This repository contains the basic concepts and commonly used commands in web automation using Selenium WebDriver. It's a reference for beginners who are starting to learn automation testing.

## 📘 Topics Covered

### ✅ Basic Browser Operations

| Action | Code Example |
|--------|--------------|
| Open URL | `driver.get("url");` |
| Get current URL | `driver.getCurrentUrl();` |
| Get page title | `driver.getTitle();` |
| Minimize window | `driver.manage().window().minimize();` |
| Maximize window | `driver.manage().window().maximize();` |
| Fullscreen window | `driver.manage().window().fullscreen();` |

### 🔁 Navigation Commands

| Action | Code Example |
|--------|--------------|
| Navigate to URL | `driver.navigate().to("url");` |
| Back | `driver.navigate().back();` |
| Forward | `driver.navigate().forward();` |
| Refresh | `driver.navigate().refresh();` |

### 🗂️ Window & Tab Handling

| Action | Code Example |
|--------|--------------|
| Open new tab | `driver.switchTo().newWindow(WindowType.TAB);` |
| Open new window | `driver.switchTo().newWindow(WindowType.WINDOW);` |
| Get all windows | `driver.getWindowHandles();` |
| Switch to window | `driver.switchTo().window("WindowHandle");` |
| Close current window | `driver.close();` |
| Quit all windows | `driver.quit();` |

### 🔍 Locating Web Elements

| Locator Type | Example |
|--------------|---------|
| By ID | `driver.findElement(By.id("elementId"));` |
| By Name | `driver.findElement(By.name("elementName"));` |
| By Class Name | `driver.findElement(By.className("elClassName"));` |
| By Tag Name | `driver.findElement(By.tagName("elementTagName"));` |
| By CSS Selector | `driver.findElement(By.cssSelector("cssSelector"));` |
| By XPath | `driver.findElement(By.xpath("elementXpath"));` |
| By Link Text | `driver.findElement(By.linkText("elementlinkText"));` |
| By Partial Link Text | `driver.findElement(By.partialLinkText("partialLinkText"));` |

## 📝 Example Automation Steps

1. Open the browser and navigate to [https://example.com](https://example.com).
2. Maximize the browser window.
3. Print the current URL and page title.
4. Open a new tab and go to [https://www.wikipedia.org](https://www.wikipedia.org).
5. Switch between tabs.
6. In Wikipedia, locate the search input by its name and type "Selenium (software)".
7. Submit the search form.
8. Refresh the page.
9. Close the current tab.
10. Go back to the original tab and close it using `quit()`.

---

## 🛠 Technologies Used

- Java
- Selenium WebDriver

## 📂 Project Status

This is an ongoing learning repository. More advanced topics and test scripts will be added as I progress.

## 👤 Author

**Fahim Shahriar**  
Beginner QA Engineer | Automation Learner

---

> _"Learning one command at a time. Consistency beats intensity."_  
