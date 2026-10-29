class Lab_8_3
 {
   public static void main(String args[]) {

    // void palindrom()
       int r, sum = 0, temp;
       int n = 11;
       temp = n;
       while (n!=0) {
           r = n % 10;
           sum = (sum * 10) + r;
           n = n / 10;
       }
       if (temp == sum)
           System.out.println("palindrome arrber");
       else
           System.out.println("not palindrome");
   }
}