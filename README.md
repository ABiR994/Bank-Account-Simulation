# Banking Application in Java

A simple console-based **Banking Application** implemented in Java that allows users to create and manage **Savings** and **Checking** accounts. This project demonstrates fundamental **Object-Oriented Programming (OOP)** concepts such as **inheritance** and **encapsulation**.

---

## Features

- Create **Savings Accounts** and **Checking Accounts**
- Deposit money into accounts
- Withdraw money with **minimum balance validation** for savings accounts
- Display account information
- Display a list of all existing accounts
- Easy-to-use console menu interface

---

## Account Types

### 🔹 Savings Account
- Requires a **minimum balance of 500**
- Withdrawals are not allowed if they reduce the balance below the minimum requirement
- Inherits methods and attributes from the `Account` base class

### 🔹 Checking Account
- No minimum balance requirement
- Inherits all functionality from the base `Account` class

---

## Classes Overview

1. **Account** (Base Class)
    - Attributes: `accountNumber`, `accountHolderName`, `balance`
    - Core Methods:  
      `deposit()`, `withdraw()`, `displayInfo()`

2. **SavingsAccount** (Derived Class)
    - Overrides `withdraw()` to enforce minimum balance policy
    - Displays account-type information

3. **CheckingAccount** (Derived Class)
    - Displays account-type information

4. **Main**
    - Contains the **menu-driven interface**
    - Handles:
      - Creating accounts  
      - Deposits  
      - Withdrawals  
      - Displaying single/all account information  

---

## Example Output

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

=======
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
│
├── 📁 Account/
│   ├── 📄 Account.java
│   ├── 📄 CheckingAccount.java
│   └── 📄 SavingsAccount.java
│
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
