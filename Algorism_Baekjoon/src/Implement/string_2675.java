package Implement;

// λ¬Έμ?΄ 2675
/*
--
λ¬Έμ?΄ Sλ₯? ?? ₯λ°μ? ??, κ°? λ¬Έμλ₯? Rλ²? λ°λ³΅?΄ ? λ¬Έμ?΄ Pλ₯? λ§λ  ? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±???€. 
μ¦?, μ²? λ²μ§Έ λ¬Έμλ₯? Rλ²? λ°λ³΅?κ³?, ? λ²μ§Έ λ¬Έμλ₯? Rλ²? λ°λ³΅?? ??Όλ‘? Pλ₯? λ§λ€λ©? ??€. S?? QR Code "alphanumeric" λ¬Έμλ§? ?€?΄??€.
QR Code "alphanumeric" λ¬Έμ? 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: ?΄?€.
*/

import java.util.Scanner;

public class string_2675 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String s = sc.nextLine();

		char[] chArr = s.toCharArray();
	
		for (int i = 1; i < chArr.length; i++) {
			for (int j = 0; j < cnt; j++) {
				System.out.print(chArr[i]);			
			}
		}
		
		
		sc.close();
	}
	
}
