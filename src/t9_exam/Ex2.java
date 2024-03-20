package t9_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오. (단, ArrayList 객체 사용)
public class Ex2 {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<>();
		int su;
		
		for(int i=0; i<6; i++) {
			su = (int)(Math.random()*45)+1;
			vos.add(su);
			for(int j=0; j<i; j++) {
				if(vos.get(i).equals(vos.get(j))) {
					i--;
					break;
				}
			}
		}
		Integer[] vosArray = vos.toArray(new Integer[0]);
		Arrays.sort(vosArray);
		System.out.print("이번 주 로또 번호는: ");
		for(int lotto:vosArray) System.out.print(lotto+" ");
	}
}
