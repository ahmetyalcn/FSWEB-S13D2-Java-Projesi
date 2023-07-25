public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(787));
        System.out.println(isPalindrome(11212));
        System.out.println("----------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("----------------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }

    public static boolean isPalindrome(int num){
        char[] stringNumArray = String.valueOf(Math.abs(num)).toCharArray();
        String reversedStr = "";
        for (int  i=stringNumArray.length-1; i>=0; i-- ){
            reversedStr += stringNumArray[i];
        }
        return reversedStr.equals(String.valueOf(Math.abs(num)));
    }

    public static boolean isPerfectNumber(int num){
        if (num<=0){
            return false;
        }
        int sum = 0;
        for (int  i=1; i<=num/2; i++ ){
            if (num%i==0) {
                sum =sum+ i;
            }
        }
        return sum==num;
    }

    public static String numberToWords(int num){
        if (num<=0){
            return "Invalid Value";
        }
        String[] numbersStrArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        char[] numbersArray = String.valueOf(num).toCharArray();
        String text ="";
        for (int i=0; i<numbersArray.length; i++){
            text += numbersStrArray[Integer.parseInt(String.valueOf(numbersArray[i]))] + " ";
        }
        return text.trim();
    }
}