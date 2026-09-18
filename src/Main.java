import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        manager.loadExpenses();

        int choice;

        do {

            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Search by Category");
            System.out.println("4. Calculate Total");
            System.out.println("5. Delete Expense");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Expense ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    Expense expense = new Expense(
                            id,
                            date,
                            category,
                            description,
                            amount
                    );

                    manager.addExpense(expense);
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter category: ");
                    String searchCategory = sc.nextLine();

                    manager.searchByCategory(searchCategory);
                    break;

                case 4:
                    manager.calculateTotal();
                    break;

                case 5:

                    System.out.print("Enter Expense ID to delete: ");
                    int deleteId = sc.nextInt();

                    manager.deleteExpense(deleteId);
                    break;

                case 6:
                    System.out.println("Thank you for using Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
