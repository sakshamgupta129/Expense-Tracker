# Expense Tracker

## 1. Project Overview

Expense Tracker is a command-line Java application used to record and manage personal expenses. The application allows users to add, view, search, calculate, and delete expenses. Expense data is stored in a text file so that previously added expenses can be loaded when the application is started again.

## 2. Objectives

* To provide a simple way to record daily expenses.
* To organize expenses using categories.
* To calculate the total amount spent.
* To search expenses by category.
* To delete an expense using its ID.
* To store expense information using file handling.

## 3. Features

### Add Expense

Users can enter an expense ID, date, category, description, and amount.

### View Expenses

Displays all the expenses currently stored in the application.

### Search by Category

Allows users to search for expenses belonging to a particular category.

### Calculate Total

Calculates and displays the total amount of all stored expenses.

### Delete Expense

Removes an expense using its unique ID.

### File Storage

Expenses are stored in `data/expenses.txt`, allowing the data to remain available after the program is closed.

## 4. Technologies Used

* Java
* Object-Oriented Programming
* ArrayList
* File Handling
* Command-Line Interface

## 5. Requirements

To run this project, you need:

* Java Development Kit (JDK)
* Command Prompt, PowerShell, or VS Code Terminal
* Git (optional, if cloning the repository)

Check Java installation using:

```bash
java -version
```

and:

```bash
javac -version
```

## 6. Project Structure

```text
Expense-Tracker/
│
├── src/
│   ├── Main.java
│   ├── Expense.java
│   └── ExpenseManager.java
│
├── data/
│   └── expenses.txt
│
├── README.md
└── .gitignore
```

## 7. Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/sakshamgupta129/Expense-Tracker.git
```

Replace `YOUR-USERNAME` with the GitHub username that owns the repository.

### Step 2: Open the Project

```bash
cd Expense-Tracker
```

### Step 3: Compile the Java Files

```bash
javac src/*.java
```

### Step 4: Run the Application

```bash
java -cp src Main
```

## 8. How to Use

After starting the application, the following menu is displayed:

```text
===== EXPENSE TRACKER =====
1. Add Expense
2. View Expenses
3. Search by Category
4. Calculate Total
5. Delete Expense
6. Exit
```

Enter the number corresponding to the required operation.

### Example: Adding an Expense

```text
Enter your choice: 1
Enter Expense ID: 1
Enter Date: 18-09-2026
Enter Category: Food
Enter Description: Lunch
Enter Amount: 250

Expense added successfully.
```

### Example: Viewing Expenses

```text
Enter your choice: 2

===== ALL EXPENSES =====
ID: 1 | Date: 18-09-2026 | Category: Food | Description: Lunch | Amount: ₹250.0
```

### Example: Calculating Total

```text
Enter your choice: 4
Total Expense: ₹250.0
```

## 9. Data Storage

The application stores expense information in:

```text
data/expenses.txt
```

The stored information follows this format:

```text
ID,Date,Category,Description,Amount
```

Example:

```text
1,18-09-2026,Food,Lunch,250.0
```

## 10. Testing

The following operations were tested:

| Operation             | Test Result |
| --------------------- | ----------- |
| Add Expense           | Successful  |
| View Expenses         | Successful  |
| Search by Category    | Successful  |
| Calculate Total       | Successful  |
| Delete Expense        | Successful  |
| File Storage          | Successful  |
| Loading Previous Data | Successful  |

## 11. Limitations

* The application currently uses a command-line interface.
* Data is stored in a text file rather than a database.
* The application does not include user login or authentication.
* Expense information is entered manually.

## 12. Future Enhancements

Possible future improvements include:

* Adding a graphical user interface.
* Using a database for storing expenses.
* Adding monthly and yearly expense reports.
* Adding expense charts and statistics.
* Adding user authentication.
* Adding budget tracking.

## 13. Conclusion

The Expense Tracker provides a simple command-line solution for managing personal expenses. It demonstrates Java programming concepts including classes, objects, ArrayList, methods, loops, conditional statements, and file handling.

## 14. Author

**Saksham Gupta**

B.Tech Computer Science (AIML)
VIT Bhopal University

