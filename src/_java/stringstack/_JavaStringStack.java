package _java.stringstack;

import java.util.Scanner;
import java.io.IOException;

public class _JavaStringStack {
    public static void main(String[] args) {
        Scanner _scan = new Scanner(System.in);
        System.out.println("Input String: ");
        String my_string = _scan.nextLine();
        char[] char_array = my_string.toCharArray();
        for (int it = 0; it < char_array.length; it++) {
            if (char_array[it] == '(') {
                int start = it + 1;
                int end = my_string.indexOf(")");
                if (end != -1) {
                    String enclosed_string = my_string.substring(start, end);
                    System.out.println("Enclosed String: " + enclosed_string);
                    System.out.println("Opening ( Position: " + it);
                    System.out.println("Closing ) Position: " + end);
                } else {
                    System.out.println("Closing ) is not found");
                }
            } else if (char_array[it] == '{') {
                int start = it + 1;
                int end = my_string.indexOf("}");
                if (end != -1) {
                    String enclosed_string = my_string.substring(start, end);
                    System.out.println("Enclosed String: " + enclosed_string);
                    System.out.println("Opening { Position: " + it);
                    System.out.println("Closing } Position: " + end);
                } else {
                    System.out.println("Closing } is not found");
                }
            } else if (char_array[it] == '[') {
                int start = it + 1;
                int end = my_string.indexOf("]");
                if (end != -1) {
                    String enclosed_string = my_string.substring(start, end);
                    System.out.println("Enclosed String: " + enclosed_string);
                    System.out.println("Opening [ Position: " + it);
                    System.out.println("Closing ] Position: " + end);
                } else {
                    System.out.println("Closing ] is not found");
                }
            }
        }
        System.out.print("Press any key to continue...");
        _scan.nextLine();
    }
}
