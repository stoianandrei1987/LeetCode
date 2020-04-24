package mainpackage;

public class MyAtoi {

    public static int myAtoi(String str) {
        str = str.trim();
        if(str.matches("[^-+\\d].*")) return 0;
        double sign = (str.startsWith("-")) ? -1 : 1;
        str = str.replaceAll("\\D", "");
        double result = 0d;
        if(str.equals("") || str.equals("0")) return 0;
        else {
            for(int i = 0 ; i<str.length(); i++) {
                 result = result * 10 + ((str.charAt(i) - 48));
            }
        }
        double end = sign*result;
        if(end < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else if (end > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) end;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-9999999999999999999999999"));
    }
}
