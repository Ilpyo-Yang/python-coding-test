package Implement;

// whileλ¬?
/*
- ??κΈ? ?¬?΄?΄ 1110
0λ³΄λ€ ?¬κ±°λ κ°κ³ , 99λ³΄λ€ ?κ±°λ κ°μ? ? ?κ°? μ£Όμ΄μ§? ? ?€?κ³? κ°μ? ?°?°? ?  ? ??€. 
λ¨Όμ? μ£Όμ΄μ§? ?κ°? 10λ³΄λ€ ??€λ©? ?? 0? λΆμ¬ ? ?λ¦? ?λ‘? λ§λ€κ³?, κ°? ?λ¦¬μ ?«?λ₯? ???€. 
κ·? ?€?, μ£Όμ΄μ§? ?? κ°??₯ ?€λ₯Έμͺ½ ?λ¦? ??? ??? κ΅¬ν ?©? κ°??₯ ?€λ₯Έμͺ½ ?λ¦? ?λ₯? ?΄?΄ λΆμ΄λ©? ?λ‘μ΄ ?λ₯? λ§λ€ ? ??€. ?€? ?λ₯? λ³΄μ.
26λΆ??° ????€. 2+6 = 8?΄?€. ?λ‘μ΄ ?? 68?΄?€. 
6+8 = 14?΄?€. ?λ‘μ΄ ?? 84?΄?€. 
8+4 = 12?΄?€. ?λ‘μ΄ ?? 42?΄?€. 
4+2 = 6?΄?€. ?λ‘μ΄ ?? 26?΄?€.
?? ?? 4λ²λ§? ?? ?λ‘? ???¬ ? ??€. 
?°?Ό? 26? ?¬?΄?΄? κΈΈμ΄? 4?΄?€.
N?΄ μ£Όμ΄μ‘μ ?, N? ?¬?΄?΄? κΈΈμ΄λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
*/

import java.util.Scanner;

public class while_1110 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int x = input;

		int cycle = 0;
		
	
			do {
				x = x%10*10 + (x/10+x%10)%10;
				cycle++;
			} while(input!=x);

		System.out.println(cycle);
	
	}
	
	public static int cnt(int x) {
		int t = 1;
		if(x/10!=0) {
			x=x/10;
			t++;
		}
	return t;
	}
}
