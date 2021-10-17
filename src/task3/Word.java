package task3;

public class Word implements Comparable<Word>{

    private String word;
    private int vowelsNumber;

    Word (String s) {

        this.word = firstVowelToUpperCase(s);
        this.vowelsNumber = sum(s);
    }

    public int getVowelsNumber() {
        return vowelsNumber;
    }

    public String getWord() {
        return word;
    }

    private String firstVowelToUpperCase (String s) {

        String newString = "";
        boolean flag = true;

        for (int i = 0; i<s.length(); i++){


            if (sr(s.charAt(i))&&flag) {
                flag = false;
                if (s.charAt(i)=='ё'){
                    newString +="Ё";
                } else {
                    newString +=(char)(s.charAt(i)-32);
                }


            } else {

                newString +=s.charAt(i);

            }


        }

        return newString;
    }

    private int sum(String s) {

        int sum = 0;
        String s2 = s.toLowerCase();

        for (int i = 0; i < s.length(); i++)
            if (sr(s2.charAt(i))) {
                sum++;
            }

        return sum;
    }


    public static boolean sr(char ch) {

        boolean flag = false;

        switch (ch) {
            case 'а':  flag = true;
                break;

            case 'е':  flag = true;
                break;

            case 'ё':  flag = true;
                break;

            case 'и':  flag = true;
                break;

            case 'о':  flag = true;
                break;

            case 'у':  flag = true;
                break;

            case 'ы':  flag = true;
                break;

            case 'ю':  flag = true;
                break;

            case 'я':  flag = true;
                break;
        }

        return flag;

    }


    public void print(){

        System.out.println("word: "+word + " vowelsNUmber is: " + vowelsNumber);

    }

    @Override
    public int compareTo(Word o) {

        return o.getVowelsNumber()-vowelsNumber ;
    }
}
