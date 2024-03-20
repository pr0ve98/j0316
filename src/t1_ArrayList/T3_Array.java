package t1_ArrayList;

import java.util.ArrayList;

public class T3_Array {
	public static void main(String[] args) {
//		ArrayList<Integer[]> vos = new ArrayList<>();
		ArrayList<int[]> vos = new ArrayList<>(); // 에러는 안 남
		
		int[] jum1 = new int[4]; // 번호 국어 영어 수학
		jum1[0] = 1;
		jum1[1] = 100;
		jum1[2] = 90;
		jum1[3] = 80;
		vos.add(jum1);
		
		int[] jum2 = new int[4]; // 번호 국어 영어 수학
		jum2[0] = 2;
		jum2[1] = 90;
		jum2[2] = 80;
		jum2[3] = 70;
		vos.add(jum2);
		
		int[] jum3 = new int[4]; // 번호 국어 영어 수학
		jum3[0] = 3;
		jum3[1] = 70;
		jum3[2] = 60;
		jum3[3] = 50;
		vos.add(jum3);
		
		System.out.println("1. vos의 크기: "+vos.size());
		System.out.println("1. toString: "+vos);
		System.out.println();
		
		System.out.println("2. vos객체안의 배열값 출력");
		for(int[] voArray :vos) {
			for(int v : voArray) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3. vos객체안의 배열값 출력");
		int[] imsi = new int[jum1.length];
		for(int i=0; i<vos.size(); i++) {
			imsi = vos.get(i);
			for(int j=0; j<imsi.length; j++) {
				System.out.print(imsi[j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("4. vos객체안의 배열값 출력");
		System.out.print(vos.get(0)[0]+" ");
		System.out.print(vos.get(0)[1]+" ");
		System.out.print(vos.get(0)[2]+" ");
		System.out.print(vos.get(0)[3]+" ");
		System.out.println();
		System.out.print(vos.get(1)[0]+" ");
		System.out.print(vos.get(1)[1]+" ");
		System.out.print(vos.get(1)[2]+" ");
		System.out.print(vos.get(1)[3]+" ");
		System.out.println();
		System.out.print(vos.get(2)[0]+" ");
		System.out.print(vos.get(2)[1]+" ");
		System.out.print(vos.get(2)[2]+" ");
		System.out.print(vos.get(2)[3]+" ");
		System.out.println();
		System.out.println();
		
		System.out.println("5. vos객체안의 배열값 출력");
		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<vos.get(i).length; j++) {
				System.out.print(vos.get(i)[j]+" ");
			}
			System.out.println();
		}
	}
}
