# Inventory Management – Test Scenarios

## TS-1: Create Product – Valid Data
Related Requirement: FR-1  
Description: Verify that a product can be created with valid inputs.

## TS-2 – Create Product with Missing Product Name

### Feature
Create Product API

### Description
Verify that the system does not allow creation of a product when the product name is missing and returns an appropriate validation error.

### Business Context
Product name is a mandatory field required to uniquely identify a product in the inventory system. Creating a product without a name must be prevented to ensure data integrity.

### Preconditions
- Inventory Management API is running
- User has permission to create products
- API endpoint `/api/products` is accessible

### Trigger
A client sends a request to create a product without providing the `name` field.

### Expected Behavior
- The product is **not created**
- The API rejects the request
- A validation error related to the missing product name is returned

### Expected Result Summary
- HTTP response indicates a client error (4xx)
- Error message clearly states that the product name is required
- No product record is persisted in the system

### Notes
- This scenario focuses on API-level validation
- Detailed validations (null, empty, whitespace) will be covered in individual test cases
- This scenario is suitable for automation using RestAssured

## TS-3: Create Product – Non-positive Quantity
Related Requirement: FR-2, BR-2  
Description: Verify that the system rejects negative quantity values.
### Feature
Create Product API
### Business Context
Product quantity is a mandatory field required to determine the qualtity of the product and must be a positive number.
### Preconditions
Inventory Management API is running
User has permission to create products
API endpoint /api/products is accessible
### Trigger
A client sends a request to create a product with negative or zero quantity field.
### Expected Behavior
The product is not created
The API rejects the request
A validation error related to the negative product quantity is returned
### Expected Result Summary
HTTP response indicates a client error (4xx)
Error message clearly states that quantity should be positive integer
No product record is persisted in the system
### Notes
This scenario focuses on API-level validation
Detailed validations (negative, zero) will be covered in individual test cases
This scenario is suitable for automation using RestAssured
## TS-4: View Product List
Related Requirement: FR-2  
Description: Verify that all products are displayed correctly.

## TS-5: Update Product – Active Product
Related Requirement: FR-3  
Description: Verify that an active product can be updated.

## TS-6: Update Product – Discontinued Product
Related Requirement: FR-3, BR-4  
Description: Verify that a discontinued product cannot be updated.

## TS-7: Delete Product
Related Requirement: FR-4  
Description: Verify that a product can be deleted.
