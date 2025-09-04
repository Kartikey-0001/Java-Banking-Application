# Java Banking Application
# Problem Statement
Design and implement a banking application that allows users to manage their bank accounts through operations such as creating accounts, depositing money, withdrawing money, and viewing account details. The application uses Java features, control structures, arrays, and strings.

# Learning Outcomes
Understand the basics of Java programming.
Gain practical experience with control structures, arrays, and strings.
Implement a real-world application in Java.
Learn to manage code using GitHub.
# Project Instructions
# Account Class
# Attributes:

accountNumber – Unique account number
accountHolderName – Name of the account holder
balance – Current balance
email – Email address
phoneNumber – Contact number
address – Address of the account holder
# Methods:

deposit(double amount) – Deposit money (validate positive amount)
withdraw(double amount) – Withdraw money (validate positive amount and sufficient balance)
displayAccountDetails() – Show account details
updateContactDetails(String email, String phoneNumber,  String address) – Update contact details
# User Interface Class
# Attributes:

Array to store multiple Account objects
Scanner object for input
# Methods:

createAccount() – Create a new account
performDeposit() – Handle deposit operations
performWithdrawal() – Handle withdrawal operations
showAccountDetails() – Display account details
updateContact() – Update contact details
mainMenu() – Display menu and handle user choices
# Implementation Steps
Define the Account class with attributes and methods.
Create the UserInterface class to manage accounts and interact with users.
Implement methods for account creation, deposit, withdrawal, and displaying details.
Use control structures and loops for menu navigation and input handling.
Use arrays to manage multiple accounts.
Handle strings for account holder names and contact details.
# Sample Interaction
Welcome to the Banking Application!

Create a new account
Deposit money
Withdraw money
View account details
Update contact details
Exit
Enter your choice: 1

Enter account holder name: John Doe
Enter initial deposit amount: 1000.0
Enter email address: john.doe@example.com
Enter phone number: 1234567890
Account created successfully with Account Number: 1001
