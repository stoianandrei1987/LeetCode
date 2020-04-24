package mainpackage;

public class MyAtoi {

    public static int myAtoi(String str) {
        str = str.trim();
        int sign = (str.startsWith("-")) ? -1 : 1;
        str = str.replaceAll("\\D", "");
        int result = 0;
        if(str.equals("") || str.equals("0")) return 0;
        else {

            for(int i = 0 ; i<str.length(); i++) {
                 result = result * 10 + ((str.charAt(i) - 48));
            }
        }
        return sign*result;

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("    -23 with words"));
    }
}
