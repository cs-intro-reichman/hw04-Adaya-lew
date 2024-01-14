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
            StringBuilder res = new StringBuilder();
            int size = string.length();

            for (int i = 0; i < size; i++) {
                char ch = string.charAt(i);
                if (ch == ' ') {
                    res.append(ch);
                } else if (vowels.indexOf(ch) != -1) {
                    if (ch >= 'A' && ch <= 'Z') {
                        res.append((char) (ch + ('a' - 'A')));
                    } else {
                        res.append(ch);
                    }
                } else {
                    if (ch >= 'a' && ch <= 'z') {
                        res.append((char) (ch + ('A' - 'a')));
                    } else {
                        res.append(ch);
                    }
                }
            }
            return res.toString();
        }

        public static String camelCase(String string) {
            StringBuilder res = new StringBuilder();
            boolean isFirst = true;

            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);

                if (ch == ' ') {
                    isFirst = true;
                } else {
                    if (isFirst) {
                        res.append(Character.toLowerCase(ch));
                        isFirst = false;
                    } else {
                        res.append(Character.toUpperCase(ch));
                    }
                }
            }

            return res.toString();
        }

        public static int[] allIndexOf(String input, char character) {
            List<Integer> indexes = new ArrayList<>();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == character) {
                    indexes.add(i);
                }
            }

            int[] arr = new int[indexes.size()];
            for (int i = 0; i < indexes.size(); i++) {
                arr[i] = indexes.get(i);
            }

            return arr;
        }
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