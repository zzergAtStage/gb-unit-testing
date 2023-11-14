package seminars.third.hw;

public class Main {

    static class MathOperations{

        public static boolean evenOddNumber(int n){
            return (n%2 ==0);
        }


        public static boolean numberInInterval(int n){
            int bottomRange = 5;
            int aboveRange = 100;
            return ((n >= bottomRange) && (n <= aboveRange));
        }

    }

}
