import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        chooseAction(arr);
    }

    public static void chooseAction(ArrayList arr) {
        while (true) {
            showMenu();
            int menuItem = getFromUserMenuToExecute();
            switch (menuItem) {
                case 1:
                    addToList(arr);
                    break;
                case 2:
                    removeFromList(arr);
                    break;
                case 3:
                    showListToConsole(arr);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static void addToList(ArrayList arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write title to add to list: ");
        arr.add(sc.nextLine());
        System.out.println();
    }

    public static void removeFromList(ArrayList arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write title to remove from list: ");
        arr.remove(sc.nextLine());
        System.out.println();
    }

    public static void showListToConsole(ArrayList arr) {
        System.out.println(arr);
        System.out.println();
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
        System.out.println("Enter menu item number: ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
