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
        public static String capVowelsLowRest(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(upCase(c));
            } else {
                result.append(lowerCase(c) ? c : lowerCase(c));
            }
        }

        return result.toString();
    }
    
    
    //help camelCase

    
    
    public static char upCase(char s) {
    if (s >= 'a' && s <= 'z') {
        return (char) (s - 'a' + 'A');
    } else {
        return s;
    }
    }

    public static char lowcase(char s) {
    if (s >= 'A' && s <= 'Z') {
        return (char) (s - 'A' + 'a');
    } else {
        return s;
    }
    }

    public static boolean Capital(char c) {
    return c >= 'A' && c <= 'Z';
    }

    public static String camelCase(String string) {
    boolean Capital = false;
    boolean isFirst = false;
    StringBuilder res = new StringBuilder();

    for (int i = 0; i < string.length(); i++) {
            if (!isFirst && string.charAt(i) != ' ') {
                res += lowcase(string.charAt(i));
                isFirst = true;
                Capital = false;
                continue;
            }
            if (Capital && string.charAt(i) != ' ') {
                res += upCase(string.charAt(i));
                Capital = false;
            } else if (string.charAt(i) != ' ' && !Capital) {

                res += lowcase(string.charAt(i));

            }
            if (string.charAt(i) == ' ') {

                Capital = true;
            }
        }
        return res;
    }
    
   

    public static int[] allIndexOf (String string, char chr) {
        
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