import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        AddProductView addProductView = new AddProductView();
        RemoveProductView removeProductView = new RemoveProductView();
        PrintShoppingListView printShoppingListView = new PrintShoppingListView();

        while (true) {
            showMenu();
            int menuItem = getFromUserMenuToExecute();
            if (menuItem == 4) {
                System.out.println("Good buy!");
                break;
            }
            switch (menuItem) {
                case 1:
                    addProductView.execute(arr);
                    break;
                case 2:
                    removeProductView.execute(arr);
                    break;
                case 3:
                    printShoppingListView.execute(arr);
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("Program Menu:");
        System.out.println("1 - Add to list");
        System.out.println("2 - Remove from list");
        System.out.println("3 - Show list");
        System.out.println("4 - Exit from program");
        System.out.println();
    }

    public static int getFromUserMenuToExecute() {
        System.out.print("Enter menu item number: ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
