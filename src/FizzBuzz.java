/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    public static void main(String[] args) {
        int i = -100;
        while (i < 100) {
            i = doFizzBuzz(i);
        }

    }

    private static int doFizzBuzz(int i) {
        boolean x3 = i % 3 == 0;
        boolean x5 = i % 5 == 0;

        if (x3 & x5) {
            System.out.println("Fizz Buzz");
        }
        else if (x3) {
            System.out.println("Fizz");
        }
        else if (x5) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}