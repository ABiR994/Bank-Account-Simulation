# 🏦 Banking Application in Java

A **console-based Banking Application** built using Java, following a **layered package structure** and core **Object-Oriented Programming (OOP)** principles.  
The application allows users to create and manage **Savings** and **Checking** accounts through a clean, menu-driven interface.

---

## 📘 OOP Concepts Used

- **Encapsulation**  
  Private fields with controlled access via getters and setters.

- **Inheritance**  
  `SavingsAccount` and `CheckingAccount` extend the abstract `Account` class.

- **Polymorphism**  
  Accounts are stored using an `Account[]` reference, allowing different account types to be managed uniformly.

- **Method Overriding**  
  `SavingsAccount` overrides `withdraw()` to enforce minimum balance rules.

- **Abstraction**  
  `Account` is an abstract base class defining common behavior.

- **Separation of Concerns**  
  Logic is divided into `account`, `services`, and `ui` packages.

---

## 📁 Project Structure
```
📦 Bank Account Simulation/
│
├── 📁 account/
│   ├── 📄 Account.java
│   ├── 📄 CheckingAccount.java
│   └── 📄 SavingsAccount.java
│
├── 📁 services/
│   ├── 📄 AccountCreation.java
│   ├── 📄 FindAccount.java
│   └── 📄 Transaction.java
│
├── 📁 ui/
│   ├── 📄 InputHandler.java
│   └── 📄 Menu.java
│
├── 📄 Main.java
├── 📝 README.md
└── 📄 .gitignore
```
---

---

## 📦 Package Overview

### 🔹 account
Contains all account-related classes.

- **Account.java**  
  Abstract base class defining shared fields and operations.

- **CheckingAccount.java**  
  A standard account with no minimum balance restriction.

- **SavingsAccount.java**  
  Enforces a **minimum balance of 500** during withdrawals.

---

### 🔹 services
Handles core business logic.

- **AccountCreation.java**  
  Creates and stores accounts using a centralized account array.

- **FindAccount.java**  
  Searches and displays account information.

- **Transaction.java**  
  Manages deposits and withdrawals.

---

### 🔹 ui
Handles user interaction.

- **Menu.java**  
  Displays main and account-type menus.

- **InputHandler.java**  
  Validates and processes user input safely.

---

## 🏦 Account Types

### 🔸 Savings Account
- Requires a **minimum balance of 500**
- Withdrawals are blocked if the balance would fall below the minimum
- Uses an overridden `withdraw()` method

### 🔸 Checking Account
- No minimum balance requirement
- Inherits base account behavior

---

## ✨ Features

- Create **Savings** and **Checking** accounts
- Supports **string-based account numbers** (e.g., `A001`, `ACC-55`)
- Deposit and withdraw funds with validation
- Display individual account details
- Display all accounts using polymorphism
- Menu-driven, user-friendly console interface
- Clean separation between UI, services, and data models

---

## ▶ Sample Console Output
```
Welcome to the Banking Application!

Menu:
1 Create Account
2 Deposit
3 Withdraw
4 Display Account Info
5 Show All Accounts

Enter your choice:
```
---

## 📊 UML Diagram

![UML Diagram](Assets/uml.png)

---

## 👤 Author

**Salem Nur Abir**  
CSE Student at AIUB

---
