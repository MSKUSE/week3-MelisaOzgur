/*
public class FindMinimum {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("enter three integer arguments!");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
            return;
        }

        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
*/

public class FindMinimum {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("enter three integer arguments!");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean min_num1 = num1 < num2 && num1 < num3;
        boolean min_num2 = num2 < num1 && num2 < num3;
        int minimum = min_num1 ? num1 : min_num2 ? num2 : num3;

        System.out.println(minimum);
    }
}


