package t9_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 그린중학교 1반에서 3반의 명단이 다음과 같다.
 * 이때 ArrayList 에 각 반별로 저장시켜놓고, ArrayList에 저장된 각 반의 자료를 출력시켜보자
 * 또, 반을 입력하면 그 반의 학생들을 출력시켜보시오.
 * 1반: 홍길동, 김말숙, 이기자
 * 2반: 소나무, 대나무, 감나무, 밤나무
 * 3반: 오사랑, 하나로, 행복해
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> vos = new ArrayList<>();
		
		String[] Class1 = {"홍길동","김말숙","이기자"};
		String[] Class2 = {"소나무","대나무","감나무","밤나무"};
		String[] Class3 = {"오사랑","하나로","행복해"};
		vos.add(Class1);
		vos.add(Class2);
		vos.add(Class3);
		
		while(true) {
			System.out.println("===========================================");
			System.out.println("1. 전체 학생 목록 | 2. 선택한 반의 학생 목록 | 0. 종료");
			System.out.println("===========================================");
			System.out.print("번호를 입력하세요> ");
			int ans = sc.nextInt();
			
			switch(ans) {
				case 1:
					for(int i=0; i<vos.size(); i++) {
						System.out.print((i+1)+"반 학생 목록: ");
						for(int j=0; j<vos.get(i).length; j++) {
							System.out.print(vos.get(i)[j]+" ");
						}
						System.out.println();
					}
					break;
					
				case 2:
					while(true) {
						System.out.print("알고 싶은 반을 입력하세요> ");
						ans = sc.nextInt();
						System.out.println("----------------------------");
						System.out.println("\t"+(ans)+"반 학생 목록");
						System.out.println("----------------------------");
						for(int i=0; i<vos.get(ans-1).length; i++) {
							System.out.println(vos.get(ans-1)[i]);						
						}
						System.out.println("----------------------------");
						System.out.print("더 알아보시겠습니까?(Y/N)> ");
						String answer = sc.next().toLowerCase();
						if(answer.equals("y")) continue;
						else break;
					}
					break;
					
				case 0: 
					System.out.println("종료합니다.");
					return;
			}
		}
		
	}
}
