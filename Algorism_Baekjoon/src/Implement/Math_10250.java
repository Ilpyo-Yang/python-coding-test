package Implement;

// κΈ°λ³Έ??
/*
-- ACM ?Έ? 10250
λ°? λ²νΈ? YXX ? YYXX ???Έ?° ?¬κΈ°μ Y ? YY ? μΈ? ?λ₯? ????΄κ³? XX ? ?λ¦¬λ² ?΄?°??λΆ??° ?Έ?? ?? λ²νΈλ₯? ????Έ?€. 
μ¦?, κ·Έλ¦Ό 1 ?? λΉκΈ?Όλ‘? ??? λ°©μ? 305 ?Έκ°? ??€.

???? ?λ¦¬λ² ?΄?°λ₯? ??κ³? ?΄??? κ±°λ¦¬? ? κ²? ?°μ§? ???€. 
?€λ§? κ±·λ κ±°λ¦¬κ°? κ°μ ??? ??μΈ΅μ λ°©μ ? ? ?Έ??€. ?λ₯? ?€λ©? 102 ?Έ λ°©λ³΄?€? 301 ?Έ λ°©μ ? ? ?Έ???°, 
102 ?Έ? κ±°λ¦¬ 2 λ§νΌ κ±Έμ΄?Ό ?μ§?λ§? 301 ?Έ? κ±°λ¦¬ 1 λ§νΌλ§? κ±ΈμΌλ©? ?κΈ? ?λ¬Έμ΄?€. 
κ°μ? ?΄? λ‘? 102 ?Έλ³΄λ€ 2101 ?Έλ₯? ? ? ?Έ??€.

?¬?¬λΆμ΄ ??±?  ?λ‘κ·Έ?¨?? μ΄κΈ°? λͺ¨λ  λ°©μ΄ λΉμ΄??€κ³? κ°?? ?? ?΄ ? μ±μ ?°?Ό N λ²μ§Έλ‘? ?μ°©ν ???κ²? λ°°μ ?  λ°? λ²νΈλ₯? κ³μ°?? ?λ‘κ·Έ?¨?΄?€. 
μ²? λ²μ§Έ ???? 101 ?Έ, ? λ²μ§Έ ???? 201 ?Έ ?±κ³? κ°μ΄ λ°°μ ??€. κ·Έλ¦Ό 1 ? κ²½μ°λ₯? ?λ‘? ?€λ©?, H = 6?΄λ―?λ‘? 10 λ²μ§Έ ???? 402 ?Έ? λ°°μ ?΄?Ό ??€.
*/

import java.util.*;

public class Math_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		
		int floor = 0, roomno = 0;
		String sfloor = "", sroomno = "";
		
		for(int i=0; i<cnt; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			
			floor = (n%h==0)? h : n%h;
			roomno = (n%h==0)? n/h : n/h+1;
			
			sfloor = String.valueOf(floor);
			sroomno = (roomno<10)? "0"+String.valueOf(roomno):String.valueOf(roomno);
			System.out.println(sfloor+sroomno);
		}
		
		sc.nextLine();
		sc.close();
	}		
}