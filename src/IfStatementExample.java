
public class IfStatementExample {
	
	public static void main(String[] args) {
		int jumsu = (int)(Math.random()*51 + 50);
		char grade = 'F';
		
//		if (90<=jumsu && jumsu<=100)
//			grade = 'A';
//		else if (80<=jumsu && jumsu<90)
//			grade = 'B';
//		else if (70<=jumsu && jumsu<80)
//			grade = 'C';
//		else if (60<=jumsu && jumsu<70)
//			grade = 'D';
//		else
//			grade = 'F';
		
		if (90<=jumsu)
			grade = 'A';
		else if (80<=jumsu)
			grade = 'B';
		else if (70<=jumsu)
			grade = 'C';
		else if (60<=jumsu)
			grade = 'D';
		else
			grade = 'F';
		
		
		
		
		System.out.printf("[%d, %c]\n", jumsu, grade);
	}
	
	public static void main5(String[] args) {
		int num = (int)(Math.random()*4 - 2);
		
		if (num>0)
			System.out.println("양수");
		else if (num==0)
			System.out.println("영");
		else
			System.out.println("음수");
		
		if (num>0) {
			System.out.println("양수");
		} else if (num==0) {
			System.out.println("영");
		} else {
			System.out.println("음수");
		}

		
		
		
		System.out.println("num = " + num);
	}
	
	public static void main3(String[] args) {
		int num = 95;
		
		if (num%2==0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		
	}
	
	public static void main4(String[] args) {
		int num = 100;
		
		if (num%2==0) {
			System.out.println("#############");
			System.out.println("짝수 입니다 num=" + num);
			System.out.println("#############");
		} else {
			System.out.println("@@@@@@@@@@@@@@");
			System.out.println("홀수 입니다. num=" + num);
			System.out.println("@@@@@@@@@@@@@@");
		}
		
		
	}

	public static void main2(String[] args) {
		System.out.println("Hello");
		
		int num = 100;
		
		if (num%3==0) {
			System.out.println("if문 수행됨");
		}
		
		if (num%3==0)
			System.out.println("if문 수행됨");
		
		System.out.println("Program End..");
	}

}
