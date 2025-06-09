# CIMB Digital Bank - Savings Account System

## Overview

CIMB is a digital bank that employs an innovative savings account system, offering diverse options like GSave and UpSave. These accounts come with distinct features and benefits, and the system follows a decorator pattern approach to provide flexible functionality.

## Class Definitions

### `BankAccount`

The `BankAccount` class represents a typical savings account and includes attributes such as `accountNumber`, `accountName`, and `balance`. It serves as the base class for the decorator pattern.

### `SavingsAccountDecorator` (Interface)

The `SavingsAccountDecorator` interface defines the methods that decorators must implement. It includes methods for showing account type, getting interest rates, retrieving balance, displaying benefits, computing balance with interest, and showing account information.

### `StandardSavingsAccount`

The `StandardSavingsAccount` class is a concrete class implementing the `SavingsAccountDecorator` interface. It represents the typical savings account with a 1% interest rate.

### `GSaveAccount`

The `GSaveAccount` class is a concrete decorator for the GSave savings account. It extends the `SavingsAccountDecorator` interface and adds functionality such as a 2.5% interest rate and additional benefits like "GCash transfer."

### `UpSaveAccount`

The `UpSaveAccount` class is a concrete decorator for the UpSave savings account. It extends the `SavingsAccountDecorator` interface and adds functionality such as a 4.0% interest rate and benefits like "With Insurance."


## Expected Behavior

- **`showAccountType()`**
  - **Expected Return:** "Savings Account," "GSave," or "UpSave."

- **`getInterestRate()`**
  - **Expected Return:** Corresponding interest rate (1%, 2.5%, or 4.0%).

- **`getBalance()`**
  - **Expected Return:** Current balance of the account.

- **`showBenefits()`**
  - **Expected Return:** Benefits associated with each account type.
    - For Savings Account: "Standard Savings Account"
    - For GSave: Benefits offered by savings account + "GSave Transfer"
    - For UpSave: Benefits offered by savings account + "With Insurance"

- **`computeBalanceWithInterest()`**
  - **Expected Behavior:** Calculates the new balance with added interest based on the interest rate.

- **`showInfo()`**
  - **Expected Return:** Details of the account, including the account number, account name, and balance.

![DecoratorPattern](https://github.com/lloydestrada/DecoratorPattern/assets/142376663/1b70107d-5e77-4fb3-9e19-97d3d3850e83)
