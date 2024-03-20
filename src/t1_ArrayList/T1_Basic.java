package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1_Basic {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<String>();
//		ArrayList<String> arrayList = new ArrayList<>();
//		List<String> arrayList = new ArrayList<>(20); // 용량 capacity()을 주고 생성하기 안 주고 생성하면 기본 용량은 10
		List<String> arrayList = new ArrayList<>();
		
		System.out.println("1. arrayList 크기: "+arrayList.size());
		System.out.println("1. toString: "+arrayList.toString());
		System.out.println("1. toString: "+arrayList); // toString()은 생략가능
		// 원래 toString()은 주소가 나오는데 값을 출력하려면 오버라이드 해서 써야 한다, 하지만 Collection 객체는 이미 오버라이드가 되어 있어서 값이 나옴
		System.out.println();
		
		// 자료 추가(add)
		// arrayList.add(100); // String 타입으로 생성해서 String 타입으로만 사용 가능
		arrayList.add("100");
		arrayList.add("홍길동");
		arrayList.add("Hong Kil Dong");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		
		arrayList.add("홍길동"); // 인덱스로 관리하기 때문에 중복 허용
		System.out.println("2. arrayList 크기: "+arrayList.size());
		System.out.println("2. toString: "+arrayList); // toString()은 생략가능
		System.out.println();
		
		// 특정위치(인덱스)에 자료 추가 - .add(인덱스, 자료)
		arrayList.add(2,"소나무");
		System.out.println("2. arrayList 크기: "+arrayList.size());
		System.out.println("2. toString: "+arrayList);
		System.out.println();
		
		// 검색: .get(인덱스)
		String name = arrayList.get(2);
		System.out.println("4. name: "+name);
		System.out.println();
		
		// 변경: .set(인덱스, 자료)
		arrayList.set(2, "감나무");
		System.out.println("5. arrayList 크기: "+arrayList.size());
		System.out.println("5. toString: "+arrayList);
		System.out.println();
		
		// 삭제: .remove(인덱스) or remove("값")
		arrayList.remove(2);
		arrayList.remove("홍길동"); // 중복은 앞에서부터 검색해 앞의 하나만 지우고 끝, 중복 전부 삭제 X
		System.out.println("6. arrayList 크기: "+arrayList.size());
		System.out.println("6. toString: "+arrayList);
		System.out.println();
		
		List<Integer> arrList2 = new ArrayList<>();
		arrList2.add(0);
		for(int i=1; i<5; i++) arrList2.add(i, (i*100));
		System.out.println("7. arrList2 크기: "+arrList2.size());
		System.out.println("7. toString: "+arrList2);
		System.out.println();
		
		//arrList2.remove(200); // 200번째 인덱스로 봐서 error
		arrList2.remove(new Integer(200)); // 실제 값을 삭제하려면 객체형식으로 삭제처리한다
		System.out.println("8. arrList2 크기: "+arrList2.size());
		System.out.println("8. toString: "+arrList2);
		System.out.println();
		
		// 향상된 for 문을 이용한 ArrayList 객체의 활용
		String str = "";
		for(String s : arrayList) {
			str += s + "/";
		}
		str = str.substring(0, str.length()-1);
		System.out.println("9. str: "+str);
		System.out.println();
		
		// 일반 for 문
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(i+"번지: "+arrayList.get(i));
		}
		System.out.println();
		
		// 모든 자료 삭제(clear())
		arrayList.clear();
		System.out.println("10. arrayList 크기: "+arrayList.size());
		System.out.println("10. toString: "+arrayList);
		System.out.println();
		
		ArrayList<String> arrayList3 = new ArrayList<>(); 
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11. arrayList3 크기: "+arrayList3.size());
		System.out.println("11. toString: "+arrayList3);
		System.out.println();
		
		// ArrayList 객체의 내용을 모두 추가(합치기): addAll()
		arrayList.addAll(arrayList3);
		System.out.println("12. arrayList 크기: "+arrayList.size());
		System.out.println("12. toString: "+arrayList);
		System.out.println();
		
		arrayList.addAll(1, arrayList3);
		System.out.println("13. arrayList 크기: "+arrayList.size());
		System.out.println("13. toString: "+arrayList);
		System.out.println();
		
		arrayList.addAll(arrayList);
		System.out.println("14. arrayList 크기: "+arrayList.size());
		System.out.println("14. toString: "+arrayList);
		System.out.println();
	}
}
