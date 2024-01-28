package condingtest.ct.week01;

import java.nio.file.spi.FileSystemProvider;

public class Ex0115 {
	public static void main(String[] args) {
		String str1 = "jaron";
		String str2 = "abcd";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		System.out.println(str3 == str4);
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.substring(4,5)); //길이에서 -1 하고 길이
	}
}
