public class StringOps {
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
        public static String capVowelsLowRest (String string) {
        String isSolution = "";

        for (int j = 0; j < string.length(); j++) {
            char currentChar = string.charAt(j);

            if(currentChar=='a' || currentChar=='i' || currentChar=='e' ||
             currentChar=='o' || currentChar=='u'){
                isSolution += (char)(currentChar - 32);
            } else if(currentChar=='A' || currentChar=='I' || currentChar=='E' ||
             currentChar=='O' || currentChar=='U')  {
                isSolution += currentChar;


            } else if (currentChar >= 'A' && currentChar <= 'Z') {
            isSolution +=  (char)(currentChar + 32);  
 
        } else {
            isSolution += currentChar; 

       }

   }
        return isSolution;

 }

    public class CamelCaseConverter {

    public static void main(String[] args) {
        //System.out.println(camelcase("Hello World")); // Output: helloWorld
        //System.out.println(camelcase("HELLO world")); // Output: helloWorld
        //System.out.println(camelcase(" tWo wordS")); // Output: twoWords
        //System.out.println(camelcase("world")); // Output: world
        //System.out.println(camelcase(" Intro to coMPUter sCIEncE ")); // Output: introToComputerScience
    }

    // Rule 1: Convert the first word to lowercase
    private static String convertFirstWordToLowercase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.trim().toLowerCase();
    }

    // Rule 2: Convert every word to camel case
    private static String convertToCamelCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase())
                      .append(word.substring(1).toLowerCase());
            }
        }

        return result.toString();
    }

    // Rule 3: Remove all spaces
    private static String removeSpaces(String input) {
        if (input == null) {
            return input;
        }
        return input.replaceAll("\\s", "");
    }

    // Main function implementing all three rules
    private static String camelcase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String firstWordLowercase = convertFirstWordToLowercase(input);
        String camelCaseWords = convertToCamelCase(firstWordLowercase);
        String result = removeSpaces(camelCaseWords);

        return result;
    }
}
   

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == chr) {
                count ++;
                }
            }
                int[] result = new int[count];
                int index =0;
                for (int i=0; i< string.length(); i++) {
                    if (string.charAt(i) == chr){
                        result [index] =i;
                        index++;
                    }
                }
        
        return result;
        }
     }