package t7_Comparable_Comparator;

class Student2VO implements Comparable<Student2VO>{
	int age; 		 // 나이
	int classNumber; // 학급
	
	public Student2VO(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compareTo(Student2VO o) {
		if(this.age > o.age) return 1;
		else if(this.age == o.age) return 0;
		else return -1;
		
		// 타입이 Integer라서 +-32억 숫자가 넘어가지 않는다고 할 시 사용 가능
		// return this.age - o.age;
	}
}

/* 객체 비교
	Comparable() - 인터페이스: 자기 자신과 매개변수를 비교한다.
	compareTo() 메소드를 반드시 구현해야 한다.
 */
public class T1_객체비교2 {
	public static void main(String[] args) {
		Student2VO a = new Student2VO(17, 2); // 17살 2반
		Student2VO b = new Student2VO(18, 1); // 18살 1반
		
		int res = a.compareTo(b);
		
		if(res > 0) System.out.println("a객체가 b객체보다 큽니다");
		else if(res == 0) System.out.println("a객체가 b객체랑 같습니다");
		else System.out.println("a객체가 b객체보다 작습니다");
		
	}
}
