# Inventory Management System – QA Demonstration Project

## 1. Purpose of the Project

This project is a **QA-oriented demonstration system** designed to showcase professional practices in **software quality assurance**, with a strong focus on **data integrity, system behavior, and risk-based testing**.

Rather than emphasizing feature richness, the project focuses on **observable system behavior**, **business rules**, and **failure scenarios** that commonly occur in real-world inventory systems.

The goal is to demonstrate how a QA engineer:
- Understands a system before testing it
- Identifies critical risks
- Designs meaningful test strategies
- Detects and documents defects with clarity and precision

---

## 2. Project Scope

### In Scope
- Product creation
- Stock initialization and adjustment
- Order creation
- Order cancellation
- Stock level consultation
- Stock movement history

### Out of Scope (Intentionally)
- Payment processing
- Shipping and logistics
- Authentication and authorization
- Complex user interface
- Cloud deployment

This deliberate limitation keeps the project **focused on quality, not complexity**.

---

## 3. Core Business Concept

The system manages **physical inventory**, where stock quantities represent **real, measurable values**.

Every operation on the system must preserve **data consistency over time**, regardless of operation order or concurrency.

The system behaves according to a set of **invariant rules** (see below), which serve as the primary test oracles.

---

## 4. System Invariants (Non-Negotiable Rules)

The following rules must **never be violated**:

1. Stock quantity can never be negative
2. Every stock change must be traceable through a stock movement record
3. A confirmed order must decrease stock
4. A canceled order must restore stock
5. Concurrent operations must not produce inconsistent stock states

Any violation of these rules is considered a **critical defect**.

---

## 5. Quality-First Approach

This project is intentionally built using a **QA-first workflow**:

1. System understanding and documentation
2. Risk identification
3. Test strategy definition
4. Test scenario design
5. Issue tracking
6. Automation where it adds real value

Implementation decisions are guided by **testability and observability**, not speed.

---

## 6. Testing Strategy Overview

Testing focuses primarily on:
- API-level validation
- Business rule enforcement
- Edge cases and boundary conditions
- Concurrency scenarios
- Regression prevention

UI testing is intentionally minimal and limited to critical end-to-end flows.

Detailed test strategies and scenarios are documented separately.

---

## 7. Issue Tracking and Defect Management

All defects, enhancements, and test-related tasks are tracked using **GitHub Issues**.

Each defect report includes:
- Preconditions
- Steps to reproduce
- Expected vs actual behavior
- Impact analysis
- Root cause hypothesis (when applicable)

Some known issues may remain intentionally open to reflect real-world project constraints.

---

## 8. Technology Stack (Minimal and Purposeful)

- Backend: Java + Spring Boot
- Database: H2 (in-memory)
- API Testing: RestAssured
- UI Testing: Selenium (limited)
- Build Tool: Maven
- Version Control: GitHub

Technology choices favor **clarity, stability, and testability**.

---

## 9. Intended Audience

This project is intended for:
- Recruiters evaluating QA engineers
- Hiring managers looking for structured thinking
- Anyone interested in practical, behavior-driven quality assurance

---

## 10. Key Takeaway

This is not a showcase of how many technologies can be used.

It is a demonstration of **how a QA engineer thinks** when faced with a real system that must remain consistent, reliable, and trustworthy over time.

---

## 11. Getting Started

1. Clone this repository:  
   git clone https://github.com/erebos928/inventory-management-qa-demo.git
Install Maven and Java (if you don't have them already installed).

Build the project:

mvn clean install


Run the tests:

mvn test

12. Contributing

Feel free to fork this project and create pull requests. If you find any issues, please create a GitHub Issue to discuss.

13. License

MIT License - see LICENSE file for details.
