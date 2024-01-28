package condingtest.ct.week01;

public class Ex0116 {

	
	public static void main(String[] args) {
		/*
		 * 1차원 배열 선언
		 * 
		 * 기본값
		 * byte ~ int = 0, long = 0L
		 * float = 0.0F, double = 0.0
		 * boolean = false
		 * 
		 * class, object = null
		 * 
		 */
		
		int[]a;
		int b[];

//		1차원 배열값 초기화
		char [] c = {'A', 'B', 'C'}; 
		int d[] = new int[3];
		
	// 배열은 수정은 가능하나 늘릴수는 없다.
		System.out.println(c[1]);
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		System.out.println(d[2]);
		
		float f[] = new float[] {1.2F, 2.3F,3.4F};
		f[2] = 4.3F;	//수정은 가능, 추가는 불가능
		
		int[] score  = new int[10];
		int sum = 0;
		for(int i = 0; i<score.length; i++)	//여기서의 length 는 메서드가 아니라서 괄호가 없다. 스트링에 length는 있음
		{
			score[i] = i+1;
			sum += score[i];
			System.out.print(score[i] +" ");
		}
		System.out.println();
		System.out.println(sum);
	}
}
