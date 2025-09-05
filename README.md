# Java Banking Application  

## Problem Statement  
Design and implement a **banking application** in Java that allows users to manage their accounts through operations such as creating accounts, depositing money, withdrawing money, and viewing account details.  

The application uses **Java features, control structures, arrays, and strings** to implement the solution.  



## Learning Outcomes  
- Understand the basics of **Java programming**  
- Gain practical experience with **control structures, arrays, and strings**  
- Implement a **real-world application** in Java  
- Learn to manage code effectively using **GitHub**  



## Project Instructions  

### Account Class  

**Attributes:**  
- accountNumber – Unique account number  
- accountHolderName – Name of the account holder  
- balance – Current balance  
- email – Email address  
- phoneNumber – Contact number  
- address – Address of the account holder  

**Methods:**  
- `deposit(double amount)` – Deposit money (validate positive amount)  
- `withdraw(double amount)` – Withdraw money (validate positive amount and sufficient balance)  
- `displayAccountDetails()` – Show account details  
- `updateContactDetails(String email, String phoneNumber, String address)` – Update contact details  



### UserInterface Class  

**Attributes:**  
- `Account[] accounts` – Array to store multiple Account objects  
- `Scanner sc` – For input  
- `int accountCount` – Keeps track of the number of accounts created  

**Methods:**  
- `createAccount()` – Create a new account  
- `performDeposit()` – Handle deposit operations  
- `performWithdrawal()` – Handle withdrawal operations  
- `showAccountDetails()` – Display account details  
- `updateContact()` – Update contact details  
- `mainMenu()` – Display menu and handle user choices  



## Implementation Steps  
1. Define the **Account** class with attributes and methods  
2. Create the **UserInterface** class to manage accounts and interact with users  
3. Implement methods for account creation, deposit, withdrawal, and displaying details  
4. Use **control structures and loops** for menu navigation and input handling  
5. Use **arrays** to manage multiple accounts  
6. Handle **strings** for account holder names and contact details  



## Sample Interaction  
**Welcome to the Banking Application!** 

===== Banking Application =====
1. Create a new account
2. Deposit money
3. Withdraw money
4. View account details
5. Update contact details
6. Exit
Enter your choice: 1

1.Enter account holder name: John Doe
2.Enter initial deposit amount: 1000.0
3.Enter email address: john.doe@example.com
4.Enter phone number: 1234567890
5.Account created successfully with Account Number: 1001

## Screenshots

**Account Creation**

<img width="323" height="378" alt="image" src="https://github.com/user-attachments/assets/019dd844-1284-4851-8d4d-d2236d9d0b4e" />

<img width="348" height="352" alt="image" src="https://github.com/user-attachments/assets/e515fade-3e48-4028-a61b-a1714c5c692d" />

## Author
- Name - Nikita Saharan
- Roll no. - 2401840008
- Course - B.Sc. (H) Data Science
