package condingtest.ct.week01;

public class Ex0114 {
	public static void main(String[] args) {
		String str = "Good Moring";

		System.out.println("charAt : " + str.charAt(7));
		System.out.println("startsWith : " + str.startsWith("good"));
		System.out.println("endsWith : " + str.endsWith("ng"));
		System.out.println("equals : " + str.equals("good morning"));
		System.out.println("indexOf : " + str.indexOf("Mor"));
		System.out.println("lastindexOf : " + str.lastIndexOf("n"));
		System.out.println("length : " + str.length());
		
		System.out.println("replcae : " + str.replace("Good","a"));
		System.out.println("replace : " + str.replace("o" , "a"));
		System.out.println("replcaeAll : " + str.replaceAll("[Good]","a")); //G이거나 o이거나 o이거나 d이면 a로 바꿔라
	}
}
