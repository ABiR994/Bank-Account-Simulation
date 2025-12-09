# Banking Application in Java

A simple, console-based **Banking Application** built using Java and organized with proper **package structure**.  
This program enables users to create and manage **Savings** and **Checking** accounts through a clean, menu-driven interface.  
It demonstrates core **Object-Oriented Programming (OOP)** concepts such as:

- Classes & Objects  
- Inheritance  
- Encapsulation  
- Method Overriding  
- Polymorphism (via array of Account references)
- Packages

---

## 📁 Project Structure

```text
📦 Bank Account Simulation/
├── 📁 Account/
│   ├── 📄 Account.java
│   ├── 📄 CheckingAccount.java
│   └── 📄 SavingsAccount.java
├── 📄 Main.java
├── 📝 README.md
└── 📄 .gitignore

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

## 📘 OOP Concepts Used

- **Encapsulation:** private fields with getters/setters  
- **Inheritance:** SavingsAccount & CheckingAccount extend Account  
- **Polymorphism:** array of `Account` storing both account types  
- **Method Overriding:** SavingsAccount overrides `withdraw()`  

---

## ▶ Example Console Output

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

---

## 👤 Author

**Salem Nur Abir**  
CSE Student at AIUB

---
