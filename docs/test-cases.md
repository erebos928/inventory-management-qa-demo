# Inventory Management – Test Cases

## TC-1: Create Product with Valid Data
Related Scenario: TS-1

Preconditions:
- User is on the product creation page

Test Steps:
1. Enter valid product name
2. Enter valid category
3. Enter quantity >= 0
4. Enter price >= 0
5. Select status ACTIVE
6. Click Save

Expected Result:
- Product is created successfully
- Product appears in the product list

---

## TC-2: Create Product without Name
Related Scenario: TS-2

Preconditions:
- User is on the product creation page

Test Steps:
1. Leave name field empty
2. Fill other fields with valid data
3. Click Save

Expected Result:
- Error message is displayed
- Product is not created
