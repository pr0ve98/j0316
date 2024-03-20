package t9_exam;

import java.util.ArrayList;
import java.util.List;

// max,min / sort / search / merge / 통계(누적)

/* 정렬 sort
 * 10개의 난수(10~100)를 발생시켜서 ArrayList 객체에 저장한 후
 * 원본/오름차순정렬/내림차순정렬 자료를 출력하시오.(ArrayList 객체를 이용하시오)
*/
public class Ex1 {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<>();
		int temp;
		
		for(int i=0; i<10; i++) vos.add((int)((Math.random()*(100+1-10)+10)));
		System.out.println("원본 숫자: "+vos);

		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<vos.size(); j++) {
				if(vos.get(i) < vos.get(j)) {
					temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
		System.out.println("오름차순 정렬: "+vos);
		
		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<vos.size(); j++) {
				if(vos.get(i) > vos.get(j)) {
					temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
		System.out.println("내림차순 정렬: "+vos);
	}
}
