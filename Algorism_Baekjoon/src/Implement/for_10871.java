package Implement;

//forλ¬?
/*
- xλ³΄λ€ ??? ? 10871
μ²«μ§Έ μ€μ Nκ³? Xκ°? μ£Όμ΄μ§λ€. (1 ?€ N, X ?€ 10,000)
?μ§? μ€μ ??΄ Aλ₯? ?΄λ£¨λ ? ? Nκ°κ? μ£Όμ΄μ§λ€. μ£Όμ΄μ§?? ? ?? λͺ¨λ 1λ³΄λ€ ?¬κ±°λ κ°κ³ , 10,000λ³΄λ€ ?κ±°λ κ°μ? ? ??΄?€.
Xλ³΄λ€ ??? ?λ₯? ?? ₯λ°μ? ????λ‘? κ³΅λ°±?Όλ‘? κ΅¬λΆ?΄ μΆλ ₯??€. Xλ³΄λ€ ??? ?? ? ?΄? ?? μ‘΄μ¬??€.
*/

import java.util.Scanner;

public class for_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a<x) System.out.print(a+" ");
		}
		
	    sc.close();
	}

}
