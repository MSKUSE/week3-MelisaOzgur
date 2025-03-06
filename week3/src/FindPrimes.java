public class FindPrimes {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("enter a number");
            return;
        }
        int number = Integer.parseInt(args[0]);

        if (number<2){
            System.out.println("There is no prime number less than 2");
            return;
        }

        for(int i = 2; i <= number; i++){
            boolean isPrime = true;
            for (int j = 2; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
