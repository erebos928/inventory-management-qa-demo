# Inventory Management System – Functional Requirements

## 1. Overview
The Inventory Management System allows users to manage products in stock.
The system supports basic inventory operations such as creating, updating,
viewing, and deleting products.

## 2. Functional Requirements

### FR-1: Create Product
The system shall allow the user to create a new product with the following attributes:
- Product ID (auto-generated)
- Name (mandatory)
- Category
- Quantity (must be >= 0)
- Price (must be >= 0)
- Status (ACTIVE, DISCONTINUED)

### FR-2: View Products
The system shall allow the user to view a list of all products.

### FR-3: Update Product
The system shall allow the user to update an existing product.

### FR-4: Delete Product
The system shall allow the user to delete a product.

## 3. Business Rules
- BR-1: Product name is mandatory.
- BR-2: Quantity cannot be negative.
- BR-3: Price cannot be negative.
- BR-4: A discontinued product cannot be updated.

## 4. Error Handling
- The system shall display an error message when mandatory fields are missing.
- The system shall reject invalid numeric values.

## 5. Out of Scope
- User authentication and authorization
- Reporting and analytics
- Supplier management

## 6. Assumptions
- The system is used by a single type of user.
- Persistence is handled by a database.
