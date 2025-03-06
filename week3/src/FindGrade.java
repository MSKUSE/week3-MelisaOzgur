public class FindGrade{

    public static void main(String[] args) {
        int length_of_args = args.length;
        if (length_of_args == 0) {
            System.out.println("You should give a score!!!");
        } else {
            int grade = Integer.parseInt(args[0]);
            if (grade >= 90 && grade < 100) {
                System.out.println("Grade : A");
            } else if (grade >= 80 && grade < 89) {
                System.out.println("Grade : B");
            } else if (grade >= 70 && grade < 79) {
                System.out.println("Grade : C");
            } else if (grade >= 60 && grade < 69) {
                System.out.println("Grade : D");
            } else if (grade >= 0 && grade < 59) {
                System.out.println("Grade : F");
            } else {
                System.out.println("Invalid score");
            }
        }
    }
}