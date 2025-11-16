package collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> RollTable = new HashMap<>();

        RollTable.put(1, "Aamir Shaikh");
        RollTable.put(2, "Chand Alam");
        RollTable.put(3, "Ruqaiyya Begum");

        System.out.println(RollTable);

        System.out.println("\nEnter a roll no. to search student data");

        Scanner scanner = new Scanner(System.in);
        int rollno = scanner.nextInt();
        System.out.println(RollTable.get(rollno));

    }
}
