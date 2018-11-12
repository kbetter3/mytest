package sum;

public class MySum {
	
	public static void main(String args[]) {
		new Sum1();
		new Sum2();
		new Sum3();
		new Sum4();
		new Sum5();
		
		System.out.println("new branch");
		
		System.out.println("this is master branch");
//		System.out.println("one more");
	}
}

class Sum1 {
	public Sum1() {
		int tot = 0;
		
		for (int i = 1; i <= 10; i++) {
			tot += i;
		}
		
		System.out.println("Sum 1 : " + tot);
	}
}

class Sum2 {
	public Sum2() {
		int n = 0, tot = 0;
		
		while (n < 10) {
			n++;
			tot += n;
		}
		
		System.out.println("Sum 2 : " + tot);
	}
}

class Sum3 {
	public Sum3() {
		System.out.println("Sum 3 : " + func(1));
	}
	
	public int func(int n) {
		if (n <= 10)
			return n + func(n + 1);
		return 0;
	}
}

class Sum4 {
	public Sum4() {
		int tot = 0;
		
		for (int i = 1; i <= 5; i++) {
			tot += i + (10 - (i - 1));
		}
		
		System.out.println("Sum 4 : " + tot);
	}
}

class Sum5 {
	public Sum5() {
		System.out.println("Sum 5 : " + (int)(10 * (10 + 1) / 2.0));
	}
}