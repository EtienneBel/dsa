package src;
import java.util.*;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        System.out.println("input ");
        System.out.println(a);

        int size = a.size();
        List<Integer> tmpArray = new ArrayList<>();

        for (int i = size; i > 0; i--) {
            tmpArray.add(a.get(i - 1));
        }

        return tmpArray;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(2);
        List<Integer> reverseData = reverseArray(a);
        System.out.println("reverseData ");
        System.out.println(reverseData);
    }

}
