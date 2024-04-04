package t7_Comparable_Comparator;

class Student1VO {
	int age; 		 // 나이
	
	public Student1VO(int age) {
		this.age = age;
	}
}

public class T1_객체비교1 {
	public static void main(String[] args) {
		Student1VO s1 = new Student1VO(17); // 17살
		Student1VO s2 = new Student1VO(18); // 18살
		
		// 객체 비교 (객체끼리의 비교는 안됨)
//		if(s1 > s2) {
//			System.out.println("s1객체가 더 크다.");
//		}
//		else {
//			System.out.println("s2객체가 더 크다.");
//		}
		
		// 객체의 값 비교지 객체의 비교는 아님
		if(s1.age > s2.age) {
			System.out.println("s1객체가 더 크다.");
		}
		else {
			System.out.println("s2객체가 더 크다.");
		}
	}
}
