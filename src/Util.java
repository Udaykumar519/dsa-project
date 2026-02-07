import java.util.ArrayList;

public class Util {
    static void printArrow(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" => ");
            }
        }
        System.out.println();
    }
}
