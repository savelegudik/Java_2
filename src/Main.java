import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        chooseAction(arr);
    }

    public static void chooseAction(ArrayList arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - add; 2 - remove; 3 - show list");
        int chosenNumber = sc.nextInt();
        switch (chosenNumber) {
            case 1:
                add(arr);
                returnProgram(arr);
                break;
            case 2:
                remove(arr);
                returnProgram(arr);
                break;
            case 3:
                showList(arr);
                returnProgram(arr);
                break;
            default:
                System.out.println("Error");
                returnProgram(arr);
                break;
        }
    }

    public static ArrayList add(ArrayList arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write to add to list: ");
        arr.add(sc.nextLine());
        System.out.println(arr);
        System.out.println();
        return arr;
    }

    public static ArrayList remove(ArrayList arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write to remove to list: ");
        arr.remove(sc.nextLine());
        System.out.println(arr);
        System.out.println();
        return arr;
    }

    public static ArrayList showList(ArrayList arr) {
        System.out.println(arr);
        System.out.println();
        return arr;
    }

    public static void returnProgram(ArrayList arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to restart a program? ");
        String decision = sc.nextLine();
        if (decision.equals("y")) {
            chooseAction(arr);
        }
    }
}
