# Banking Application in Java

A simple, console-based **Banking Application** built using Java and organized with proper **package structure**.
This program enables users to create and manage **Savings** and **Checking** accounts through a clean, menu-driven interface.
It demonstrates core **Object-Oriented Programming (OOP)** concepts.

---

## 📘 OOP Concepts Used

- **Encapsulation:** Private fields accessed via public getters/setters.
- **Inheritance:** `SavingsAccount` and `CheckingAccount` classes **extend** the `Account` base class.
- **Polymorphism:** An array of `Account` references is used to store and manage both account types.
- **Method Overriding:** The `SavingsAccount` class **overrides** the base `withdraw()` method to enforce specific rules.
- **Packages:** Classes are organized into the `Account` package.

---

## 📁 Project Structure

```
📦 Bank Account Simulation/
├── 📁 Account/
│   ├── 📄 Account.java
│   ├── 📄 CheckingAccount.java
│   └── 📄 SavingsAccount.java
├── 📄 Main.java
├── 📝 README.md
└── 📄 .gitignore
```
---

### 🔸 Package: `Account`
Contains all account-related classes.

- **Account.java**  
  Base class with shared attributes and methods.

- **CheckingAccount.java**  
  Extends `Account` and represents a basic checking account.

- **SavingsAccount.java**  
  Extends `Account` and enforces a **minimum balance of 500** during withdrawals.

---

## 🏦 Account Types

### 🔹 **Savings Account**
- Requires **minimum balance of 500**
- Withdrawal is blocked if it reduces balance below minimum
- Uses overridden `withdraw()` method

### 🔹 **Checking Account**
- No minimum balance requirement
- Fully inherits base `Account` behavior

---

## ✨ Features

- Create **Savings** or **Checking** accounts
- Supports **String-based account numbers** (e.g., “19001”, “ACC-55”, “A001”)
- Deposit money into selected accounts
- Withdraw money (with validation)
- Display specific account information
- Display **all accounts** using polymorphism
- Clean, user-friendly console interactions

---

## ▶ Example Console Output

```
Welcome to the Banking Application!

Menu:
1. Create Savings Account
2. Create Checking Account
3. Deposit
4. Withdraw
5. Display Account Info
6. Show All Accounts
7. Exit

Choose an option: 
```
---

## 👤 Author

**Salem Nur Abir**  
CSE Student at AIUB

---
