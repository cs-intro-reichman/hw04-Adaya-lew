public class Main {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }
    public static String capVowelsLowRest(String string) {
        String vowels = "aioue";
        String res = "";
        int size = string.length();

        for (int i = 0; i < size; i++) {
            char ch = string.charAt(i);
            if (ch == ' ') {
                res = res + ch;
            } else if (vowels.indexOf(ch) != -1) {
                if (ch >= 'A' && ch <= 'Z') {
                    res = res + (char) (ch + ('a' - 'z'));
                } else {
                    res = res + ch;
                }
            } else {
                if (ch >= 'a' && ch <= 'z') {
                    res = res + (char) (ch + ('A' - 'Z'));
                } else {
                    res = res + ch;
                }
            }
        }
        return res;
    }



    public static String camelCase(String string) {
        boolean isCapitalLetter = false;
        boolean isFirst = false;
        String res = "";

        for (int i = 0; i < string.length(); i++) {
            if (!isFirst && string.charAt(i) != ' ') {
                res += lowerCase(string.charAt(i));
                isFirst = true;
                isCapitalLetter = false;
                continue;
            }
            if (isCapitalLetter && string.charAt(i) != ' ') {
                res += upperCase(string.charAt(i));
                isCapitalLetter = false;
            } else if (string.charAt(i) != ' ' && !isCapitalLetter) {

                res += lowerCase(string.charAt(i));

            }
            if (string.charAt(i) == ' ') {

                isCapitalLetter = true;
            }


        }
        return res;


    }


    private static String capitalizeFirstLetter(String word) {
        if (word.isEmpty()) {
            return "";
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }


    public static int[] allIndexOf(String input, char character) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }

        int[] arr = new int[count];
        int idx=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[idx] = i;
                idx++;
            }

        return res;
    }

        //private static void printArray(int[] arr) {
          //  System.out.print("output: {");
           // for (int i = 0; i < arr.length; i++) {
           //     System.out.print(arr[i]);
                if (i < arr.length - 1) {
            //        System.out.print(", ");
            //    }
           // }
          //  System.out.println("}");
       // }
    //}