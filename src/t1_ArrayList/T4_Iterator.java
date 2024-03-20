package t1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class T4_Iterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> vos = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*100)+1);
		}
		System.out.println("1. vos: "+vos);
		System.out.println();
		
		for(int vo:vos) {
			System.out.print(vo+" ");
		}
		System.out.println();
		System.out.println();
		
		// 수를 입력받아 vos에 들어있으면 '당첨' 그렇지 않으면 '다음기회에' 출력하시오
		int cnt = 0;
		System.out.print("수를 입력하세요.> ");
		int su = sc.nextInt();
		for(int i=0; i<vos.size(); i++) {
//			if(vos.get(i) == su) {
			if(vos.get(i).equals(su)) {
				System.out.println("당첨");
				break;
			}
			cnt++;
		}
		if(vos.size()==cnt) System.out.println("다음기회에!");
		System.out.println("작업끝...");
		System.out.println();
		
		// Iterator (반복지시자)로 vos 객체 꺼내기
		Iterator<Integer> it = vos.iterator();
		System.out.println("2. it: "+it);
		while(it.hasNext()) { //hasMoreElement() = it 에 값이 있냐?
			int item = it.next(); // = hasNext()
			System.out.print(item+" ");
		}
		System.out.println("\n");
		
		// 스트림(Stream)객체로 출력하기
		Stream<Integer> stream = vos.stream();
		stream.forEach(no -> System.out.print(no+" ")); // 함수적 코딩기법 람다식 '->'
		
		sc.close();
	}
}
