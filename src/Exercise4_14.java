import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100 + 1);
		int input = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1 과 100 사이의 값을 입력하세요 : ");
			input = scan.nextInt();
			
			if (input > answer)
				System.out.println("더 작은 값을 입력하세요.");
			else if (input < answer)
				System.out.println("더 큰 값을 입력하세요.");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "입니다.");
				break;
			}
			
		} while(true);
		
	}

}
