package t4_Set;

import java.util.TreeSet;

/*
 * TreeSet: Set계열자료구조, 집합자료구조
 * HashSet과의 차이점은 순서가 없이 들어가있는 자료를 꺼낼때는 오름차순 정렬되어 꺼내준다
 */
public class T2_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
//		for(int i=0; i<10; i++) {
//			treeSet.add((int)(Math.random()*100)+1);
//		}
//		treeSet.add(5);
//		treeSet.add(5);
		
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		System.out.println("1. 크기: "+treeSet.size());
		System.out.println("1. treeSet: "+treeSet);
		System.out.println();
		
		System.out.println("2. first(): "+treeSet.first());
		System.out.println("3. last(): "+treeSet.last());
		System.out.println("4. lower(): "+treeSet.lower(26)); // 입력한 숫자보다 한칸 작은 수
		System.out.println("5. higher(): "+treeSet.higher(26)); // 입력한 숫자보다 한칸 큰 수
		System.out.println("6. floor(): "+treeSet.floor(26)); // 입력한 숫자보다 같거나 한칸 작은 수
		System.out.println("7. ceiling(): "+treeSet.ceiling(25)); // 입력한 숫자보다 같거나 한칸 큰 수
		System.out.println();
		
		// pollFirst(): 원소들 중에서 작은 원소값순으로 꺼내어준다.
		System.out.println("8. size(): "+treeSet.size());
		System.out.print("8. pollFirst(): "); 
		for(int i=0; i<25; i++) {
			System.out.print(treeSet.pollFirst()+" "); 
		}
		System.out.println();
		
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		
		// pollLast(): 원소들 중에서 큰 원소값순으로 꺼내어준다.
		System.out.println("8. size(): "+treeSet.size());
		System.out.print("9. pollLast(): "); 
		for(int i=0; i<25; i++) {
			System.out.print(treeSet.pollLast()+" "); 
		}
		System.out.println();
		
	}
}
