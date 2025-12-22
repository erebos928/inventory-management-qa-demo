# Inventory Management System – Project Scope & QA Objectives

## 1. Purpose
The purpose of this project is to build a sample Inventory Management REST API
used primarily to demonstrate software quality assurance skills, including
requirement analysis, test design, and test automation.

The project prioritizes testability, clarity of business rules, and realistic
QA scenarios over complex implementation.

---

## 2. In Scope

### Functional Scope
The system will support the following core features:
- Product management (create, view, update, delete)
- Category management
- Inventory stock tracking per product
- Stock movements (IN / OUT)
- Validation rules (e.g. no negative stock allowed)

### QA Scope
The following QA activities are included:
- Requirement-based test design
- Manual API test cases
- Negative and edge-case testing
- Basic automated API testing
- Defect documentation via GitHub Issues

---

## 3. Out of Scope
The following are intentionally excluded:
- User authentication and authorization
- User interface (UI) testing
- Performance and load testing
- Deployment to cloud infrastructure
- Mobile or desktop applications

---

## 4. Assumptions
- The system is used by internal users
- Data volume is limited
- API consumers follow documented contracts

---

## 5. QA Objectives
- Ensure functional correctness of all API endpoints
- Validate enforcement of business rules
- Identify and document defects clearly
- Demonstrate structured QA methodology
- Show traceability between requirements and tests

---

## 6. Success Criteria
- All in-scope features are documented and testable
- Test cases map directly to requirements
- Defects are reproducible and well-documented
- Automated tests cover core scenarios
