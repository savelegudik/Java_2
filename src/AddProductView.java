import java.util.ArrayList;
import java.util.Scanner;

public class AddProductView {
    public void execute(ArrayList<String> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write title to add to list: ");
        arr.add(sc.nextLine());
        System.out.println();
    }
}
