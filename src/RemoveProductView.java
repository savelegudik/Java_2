import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProductView {
    public void execute(ArrayList<String> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write title to remove from list: ");
        arr.remove(sc.nextLine());
        System.out.println();
    }
}
