package t9_exam;

import java.util.TreeSet;

// Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오. (단, Set 계열 객체 사용)
public class Ex3 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) lotto.add((int)(Math.random()*45)+1);
		System.out.println("이번주 로또 번호는: "+lotto);
	}
}
