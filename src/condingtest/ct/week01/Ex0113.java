package condingtest.ct.week01;

public class Ex0113 {

	public static void main(String[] args) {

		// 행을 생각하고 열을 생각하기
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */

		// 직삼각형
//		for(int i = 1; i<=5; i++)	// 행
//		{
//			for(int j = 1; j<=i; j++)	// i 만큼
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/*
		 * * 행 1공백 4 별 1 
		 * ** 행 2공백 3 별2 
		 * *** 행 3공백 2 별 3 
		 * **** 행 4공백 1 별 4
		 * ***** 행 5
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				}
				System.out.println();
		}
		System.out.println("--------------------------");
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for(int i =5; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		/*
		 * *****	공백0-4
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		/*
		 *       *		1  공백 4개나오고 별 1개
		 *      ***		2  공백 3개나오고 별 3개
		 *     *****    3  공백 2개나오고 별 5개
		 *    *******	4  공백 1개나오고 별 7개
		 *   *********	5  공백 0개 나오고 별 9개
		 */
		
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j <= 5-i; j++)
			{
				System.out.print(" ");
			}
			for(int k =1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		/*
		 * ********* 1  공백 0 별 9
		 *  *******   2 공백 1 별 7
		 *   *****   3  공백 2 별 5
		 *    ***
		 *     *
		 */
		
		for(int i = 5; i >=1; i--)  //행
		{
			for(int j = 0; j <5-i; j++)		//공백찍기
			{
				System.out.print(" ");
			}
			for(int k =1; k <= i*2-1; k++)		// 별찍기
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}				
}
