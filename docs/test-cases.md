# Inventory Management – Manual Test Cases

## TC-1: Create Product with Valid Data

**Related Scenario:** TS-1
**Related Requirements:** FR-1

**Priority:** High
**Severity:** Critical
**Test Type:** Functional / Positive
**Automation Candidate:** Yes

**Preconditions:**

* User has access to the inventory management system
* System is available

**Test Data:**

* Product Name: "Laptop"
* Quantity: 10
* Status: Active

**Steps:**

1. Navigate to the Create Product page
2. Enter a valid product name
3. Enter a valid quantity
4. Select status as Active
5. Click on Save / Create button

**Expected Result:**

* Product is successfully created
* Success confirmation message is displayed
* Product appears in the product list

---

## TC-2: Create Product with Missing Name

**Related Scenario:** TS-2
**Related Requirements:** FR-1, BR-1

**Priority:** High
**Severity:** Major
**Test Type:** Functional / Negative
**Automation Candidate:** Yes

**Preconditions:**

* User has access to the inventory management system

**Test Data:**

* Product Name: (empty)
* Quantity: 5
* Status: Active

**Steps:**

1. Navigate to the Create Product page
2. Leave the product name field empty
3. Enter a valid quantity
4. Click on Save / Create button

**Expected Result:**

* Product is not created
* Validation error message is displayed for product name field empty

3. Enter a valid quantity
4. Click on Save / Create button

**Expected Result:**

* Product is not created
* Validation error message is displayed for product name

---

## TC-3: Create Product with Negative Quantity

**Related Scenario:** TS-3
**Related Requirements:** FR-1, BR-2

**Priority:** High
**Severity:** Major
**Test Type:** Functional / Negative
**Automation Candidate:** Yes

**Preconditions:**

* User has access to the inventory management system

**Test Data:**

* Product Name: "Mouse"
* Quantity: -3
* Status: Active

**Steps:**

1. Navigate to the Create Product page
2. Enter a valid product name
3. Enter a negative quantity
4. Click on Save / Create button

**Expected Result:**

* Product is not created
* Validation error message is displayed for quantity

4. Click on Save / Create button

**Expected Result:**

* Product is not created
* Validation error message is displayed for quantity

---

## TC-4: View Product List

**Related Scenario:** TS-4
**Related Requirements:** FR-2

**Priority:** Medium
**Severity:** Major
**Test Type:** Functional / Positive
**Automation Candidate:** Yes

**Preconditions:**

* At least one product exists in the system

**Steps:**

1. Navigate to the Product List page

**Expected Result:**

* All existing products are displayed
* Product details (name, quantity, status) are correct

---

## TC-5: Update Active Product

**Related Scenario:** TS-5
**Related Requirements:** FR-3

**Priority:** High
**Severity:** Critical
**Test Type:** Functional / Positive
**Automation Candidate:** Yes

**Preconditions:**

* An active product exists in the system

**Test Data:**

* Updated Quantity: 20

**Steps:**

1. Navigate to the Product List page
2. Select an active product
3. Click on Edit
4. Modify the quantity
5. Save changes

**Expected Result:**

* Product information is updated successfully
* Updated values are displayed in the product list

---

## TC-6: Update Discontinued Product

**Related Scenario:** TS-6
**Related Requirements:** FR-3, BR-4

**Priority:** Medium
**Severity:** Major
**Test Type:** Functional / Negative
**Automation Candidate:** Partial

**Preconditions:**

* A discontinued product exists in the system

**Steps:**

1. Navigate to the Product List page
2. Select a discontinued product
3. Attempt to edit product details

**Expected Result:**

* System prevents modification
* Informative error or warning message is displayed

---

## TC-7: Delete Product

**Related Scenario:** TS-7
**Related Requirements:** FR-4

**Priority:** High
**Severity:** Critical
**Test Type:** Functional / Destructive
**Automation Candidate:** Yes

**Preconditions:**

* A product exists in the system

**Steps:**

1. Navigate to the Product List page
2. Select a product
3. Click on Delete
4. Confirm deletion

**Expected Result:**

* Product is removed from the system
* Product no longer appears in the product list
