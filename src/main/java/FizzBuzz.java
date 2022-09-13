public class FizzBuzz {
    /**
     * Basic org.UnkLegacy.FizzBuzz.FizzBuzz Solution
     * @param num Integer being evaluated
     * @return Return org.UnkLegacy.FizzBuzz.FizzBuzz if num is a multiple of 3 AND 5.  Fizz if only a multiple of 3. Buzz if only a multiple of 5.
     */
    public static String BadFizzBuzz(int num) {
        if ((num % 3 == 0) && (num % 5 == 0))
            return "FizzBuzz";
        else if (num % 3 == 0)
            return "Fizz";
        else if (num % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(num);
    }

    /**
     * Better Basic org.UnkLegacy.FizzBuzz.FizzBuzz Solution
     * @param num Integer being evaluated
     * @return Return org.UnkLegacy.FizzBuzz.FizzBuzz if num is a multiple of 3 AND 5.  Fizz if only a multiple of 3. Buzz if only a multiple of 5.
     */
    public static String BetterFizzBuzz(int num) {
        String output = "";

        if (num % 3 == 0)
            output += "Fizz";
        if (num % 5 == 0)
            output += "Buzz";
        if (!output.equals(""))
            return num + " " + output;
        else
            return String.valueOf(num);
    }

    /**
     * More Advanced org.UnkLegacy.FizzBuzz.FizzBuzz Solution.  A bit harder to read though.
     * @param num Integer being evaluated
     * @return Return org.UnkLegacy.FizzBuzz.FizzBuzz if num is a multiple of 3 AND 5.  Fizz if only a multiple of 3. Buzz if only a multiple of 5.
     */
    public static String EvenBetterFizzBuzz(int num) {
        return ((num % 3 == 0) ? (num % 5 == 0 ? "FizzBuzz" : "Fizz") : (num % 5 == 0 ? "Buzz" : String.valueOf(num)));
    }

    /**
     *
     * @param num Integer being evaluated
     * @param triggerA Integer used as the first multiple
     * @param triggerB Integer used as the second multiple
     * @param fizz String to be returned if a multiple of triggerA
     * @param buzz String to be returned if a multiple of triggerB
     * @return Return fizz + buzz if num is a multiple of triggerA AND triggerB.
     */
    public static String CustomFizzBuzz(int num, int triggerA, int triggerB, String fizz, String buzz) {
        return ((num % triggerA == 0) ? (num % triggerB == 0 ? fizz + buzz : fizz) : (num % triggerB == 0 ? buzz : String.valueOf(num)));
    }

    public static void main(String[] args) {
        int minLoops = 1;
        int maxLoops = 100;

        for(int i = 1; i < maxLoops; i++) {
            System.out.println(BadFizzBuzz(i));
        }
        for(int i = 1; i < maxLoops; i++) {
            System.out.println(BetterFizzBuzz(i));
        }
        for(int i = 1; i < maxLoops; i++) {
            System.out.println(EvenBetterFizzBuzz(i));
        }
        for(int i = minLoops; i < maxLoops; i++) {
            System.out.println(CustomFizzBuzz(i, 3, 5, "Whip", "Woogle"));
        }
    }
}