package task1;

public class StringComposition {

    private static char[] someCharArray;

    public static char [] ret (String s) {

        someCharArray = new char [s.length()];
        someCharArray =s.toCharArray();

        return someCharArray;
    }

    public static int sum (String s) {

        char [] arr = s.toCharArray();

        int sum = 0;

        for (int i = 0; i < arr.length; ++i) {

            if (Character.isDigit(arr[i])) {

                sum+=Integer.parseInt(String.valueOf(arr[i]));

            }
        }

        return sum;
    }

    public static int sum2 (String s) {



        int sum = 0;

        for (int i = 0; i < s.length(); ++i) {

            if (Character.isDigit(s.charAt(i))) {

                sum+=Integer.parseInt(Character.toString(s.charAt(i)));

            }
        }

        return sum;
    }
}
