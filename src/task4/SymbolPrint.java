package task4;

import java.util.Scanner;

public class SymbolPrint {

    private String stringNumbers = "0123456789";
    private String input = "001200";
    private int max = 0;



    private String[][] symbolList = {
            {"  ***  ", "   *   ", "  ***  ", "  **** ", "    *  ", "****** ", " ****  ", " ***** ", "  ****  ", "  ****  "},
            {" *   * ", " * *   ", " *   * ", "      *", "  * *  ", "*      ", "*    * ", "     * ", " *    * ", " *    * "},
            {"*     *", "   *   ", "     * ", "      *", "*   *  ", "*      ", "*      ", "    *  ", " *    * ", " *    * "},
            {"*     *", "   *   ", "    *  ", "   *** ", "*   *  ", " ****  ", "*****  ", "   *   ", "  ****  ", "  ***** "},
            {"*     *", "   *   ", "  *    ", "      *", "****** ", "     * ", "*    * ", "   *   ", " *    * ", "      * "},
            {" *   * ", "   *   ", " *     ", "      *", "    *  ", "*    * ", "*    * ", "   *   ", " *    * ", " *    * "},
            {"  ***  ", " ***** ", " ***** ", "  **** ", "    *  ", " ****  ", " ****  ", "   *   ", "  ****  ", "  ****  "},
    };

    private String[][] numberList = {
            {"  000  ", "   1   ", "  222  ", "  3333 ", "    4  ", "555555 ", " 6666  ", " 77777 ", "  8888  ", "  9999  "},
            {" 0   0 ", " 1 1   ", " 2   2 ", "      3", "  4 4  ", "5      ", "6    6 ", "     7 ", " 8    8 ", " 9    9 "},
            {"0     0", "   1   ", "     2 ", "      3", "4   4  ", "5      ", "6      ", "    7  ", " 8    8 ", " 9    9 "},
            {"0     0", "   1   ", "    2  ", "   333 ", "4   4  ", " 5555  ", "66666 ", "   7   ", "  8888  ", "  99999 "},
            {"0     0", "   1   ", "  2    ", "      3", "444444 ", "     5 ", "6    6 ", "   7   ", " 8    8 ", "      9 "},
            {" 0   0 ", "   1   ", " 2     ", "      3", "    4  ", "5    5 ", "6    6 ", "   7   ", " 8    8 ", " 9    9 "},
            {"  000  ", " 11111 ", " 22222 ", "  3333 ", "    4  ", " 5555  ", " 6666  ", "   7   ", "  8888  ", "  9999  "},
    };

    public void enterNumber (){
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();

    }

    public void printSymbols(){

        enterNumber ();

        for (int i = 0; i < input.length(); i++) {
            this.max = Integer.max(this.max, Integer.parseInt(Character.toString(input.charAt(i))));

        }

        char number;
        int num = 0;


        for (int i = 0; i < symbolList.length; i++) {
            String outputNumbers = "";
            for (int k = 0; k < input.length(); k++) {
                number = input.charAt(k);
                num = stringNumbers.indexOf(number);
                if (Character.getNumericValue(number) == max) {

                    outputNumbers += numberList[i][num] + "  ";

                } else {
                    outputNumbers += symbolList[i][num] + "  ";
                }
            }
            System.out.print(outputNumbers + "\n");
        }
    }


}
