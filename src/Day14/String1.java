package Day14;

public class String1 {
public static void main(String[] args) {
	 int n = 2;
     System.out.println("Input n = " + n + ", output n = " + cambiler(n));
     n = 3;
     System.out.println("Input n = " + n + ", output n = " + cambiler(n));
 }

 public static int cambiler(int n) {
     if (n == 1) {
         return 1;
     } else {
         return n * cambiler(n - 1);
     }
}
		  
}
