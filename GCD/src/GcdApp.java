import java.util.*;
public class GcdApp {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a =s.nextInt();
	int b =s.nextInt();
	GcdOfNum z = new GcdOfNum();
	int n = z.gcdOfTwoNum(a,b);
	System.out.println(n);
			
	}
}
