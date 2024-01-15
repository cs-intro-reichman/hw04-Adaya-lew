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

    public static String camelCase (String string) {
        // Write your code here:
         
        boolean Cap = false;
        boolean isFirst = false;
        String res = "";

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