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
        System.out.println(capVowelsLowRest("One two tHRee world"));
    }

    public static String capVowelsLowRest (String string) {
        String  vowels = "aioueAIOUE";
        String res = "";
        int size = string.length();

        for (int i = 0; i < size; i++){
            char ch = string.charAt(i);
            if(ch == ' '){
                res = res + ch;
            }
            else if(vowels.indexOf(ch) != -1){
                if(ch >='A' && ch <='Z') {
                    res = res + ch;
                }
                else{
                    res = res +  (char) (ch - ('a' - 'A'));
                }
            }
            else{
                if(ch >='a' && ch <='z') {
                    res = res + ch;
                }
                else{
                    res = res +  (char) (ch + ('a' - 'A'));
                }
            }
        }
        return res;
    }

    public static String camelCase(String input) {
        String[] words = input.split("\\s+");
        
        if (words.length == 0) {
            return "";
        }

        // Rule 1: Convert the first word to lowercase
        words[0] = words[0].toLowerCase();

        // Rule 2: Capitalize the first letter of each word and make the rest lowercase
        for (int i = 0; i < words.length; i++) {
            words[i] = capitalizeFirstLetter(words[i].toLowerCase());
        }

        // Rule 3: Remove spaces and join the words
        return String.join("", words);
    }

    private static String capitalizeFirstLetter(String word) {
        if (word.isEmpty()) {
            return "";
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }


    public static int[] allIndexOf(String input, char character) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                indexes.add(i);
            }
        }

        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }

        return result;
    }

    private static void printArray(int[] arr) {
        System.out.print("output: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}