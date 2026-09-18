import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    private final String FILE_NAME = "data/expenses.txt";

    // Add expense
    public void addExpense(Expense expense) {

        expenses.add(expense);

        saveExpenses();

        System.out.println("Expense added successfully.");
    }

    // View expenses
    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\n===== ALL EXPENSES =====");

        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    // Calculate total
    public void calculateTotal() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        System.out.println("Total Expense: ₹" + total);
    }

    // Search by category
    public void searchByCategory(String category) {

        boolean found = false;

        for (Expense expense : expenses) {

            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expense found in this category.");
        }
    }

    // Delete expense
    public void deleteExpense(int id) {

        Iterator<Expense> iterator = expenses.iterator();

        while (iterator.hasNext()) {

            Expense expense = iterator.next();

            if (expense.getId() == id) {

                iterator.remove();

                saveExpenses();

                System.out.println("Expense deleted successfully.");
                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Save expenses into file
    private void saveExpenses() {

        try {

            FileWriter writer = new FileWriter(FILE_NAME);

            for (Expense expense : expenses) {

                writer.write(
                    expense.getId() + "," +
                    expense.getDate() + "," +
                    expense.getCategory() + "," +
                    expense.getDescription() + "," +
                    expense.getAmount() + "\n"
                );
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving expenses.");
        }
    }

    // Load expenses from file
    public void loadExpenses() {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return;
            }

            BufferedReader reader = new BufferedReader(
                    new FileReader(file)
            );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String date = data[1];
                String category = data[2];
                String description = data[3];
                double amount = Double.parseDouble(data[4]);

                Expense expense = new Expense(
                        id,
                        date,
                        category,
                        description,
                        amount
                );

                expenses.add(expense);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error loading expenses.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid data in expense file.");
        }
    }
}