package Day14;

public class NumberReverse {
  public static void main(String[] args) {
	int no = 1234;
	int r =0;
	while(no>0) {
		r=(r*10)+no%10;
		no=no/10;
	}
	System.out.println(r);
}
}
