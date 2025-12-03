# Banking Application in Java

A simple console-based **Banking Application** implemented in Java that allows users to create and manage **Savings** and **Checking** accounts. This project demonstrates fundamental **Object-Oriented Programming (OOP)** concepts such as **inheritance**, **polymorphism**, and **encapsulation**.

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
