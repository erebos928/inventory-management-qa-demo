# Inventory Management – Test Automation Strategy

## Objective

Select the most valuable manual test cases for automation and define a clear, realistic automation approach aligned with QA best practices.

---

## Selected Test Cases for Automation

| Test Case ID | Title                                 | Priority | Reason for Automation                                    |
| ------------ | ------------------------------------- | -------- | -------------------------------------------------------- |
| TC-1         | Create Product with Valid Data        | High     | Core business flow, frequently executed, stable behavior |
| TC-2         | Create Product with Missing Name      | High     | Input validation, prevents bad data                      |
| TC-3         | Create Product with Negative Quantity | High     | Business rule enforcement                                |
| TC-4         | View Product List                     | Medium   | Regression coverage for UI/API responses                 |
| TC-5         | Update Active Product                 | High     | Critical inventory operation                             |
| TC-7         | Delete Product                        | High     | Destructive operation, high risk                         |

---

## Test Cases Not Fully Automated

| Test Case ID | Reason                                                                   |
| ------------ | ------------------------------------------------------------------------ |
| TC-6         | Business rule + message validation; partially automated (API level only) |

---

## Automation Level Strategy

* **API Tests**

  * Create product
  * Update product
  * Delete product
  * Validation rules (negative quantity, missing name)

* **UI Tests (Limited)**

  * View product list
  * End-to-end sanity flow (create → update → delete)

---

## Proposed Tools

* **Language:** JavaScript or Java
* **API Automation:** Playwright (API testing) or REST Assured
* **UI Automation:** Playwright or Cypress
* **Test Runner:** JUnit / TestNG (Java) or Playwright Test (JS)
* **CI Integration (future):** GitHub Actions

---

## Automation Principles Applied

* Automate high-risk and repetitive scenarios first
* Keep UI automation minimal and stable
* Prefer API tests for speed and reliability
* Maintain clear traceability to requirements

---

## Expected Outcome

* Faster regression testing
* Reduced manual effort
* Scalable QA process suitable for CI/CD
