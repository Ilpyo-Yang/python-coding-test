package Implement;
// 문자?�� 
/*
-- 그룹 ?��?�� 체커 1316
그룹 ?��?��?? ?��?��?�� 존재?��?�� 모든 문자?�� ???��?��, �? 문자�? ?��?��?��?�� ?��???��?�� 경우만을 말한?��. 
?���? ?���?, ccazzzzbb?�� c, a, z, b�? 모두 ?��?��?��?�� ?��???���?, kin?�� k, i, n?�� ?��?��?��?�� ?��???���? ?��문에 그룹 ?��?��?���?�?, 
aabbbccb?�� b�? ?��?��?��?�� ?��???���? ?��문에 그룹 ?��?���? ?��?��?��.
?��?�� N개�?? ?��?��?���? 받아 그룹 ?��?��?�� 개수�? 출력?��?�� ?��로그?��?�� ?��?��?��?��?��.

bbbbbbbbcccccccc
*/


import java.util.Scanner;

public class string_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = n;
		
		for (int i=0; i<n; i++) {
			String str = sc.nextLine();

			out:
			for (int j=0; j<str.length(); j++) {
				for (int k=j+2; k<str.length(); k++) {
					if(str.charAt(j)!=str.charAt(j+1) && str.charAt(j)==str.charAt(k)) {
						cnt--;
						break out;
					}
				}
			}
		}
		
		
		System.out.println(cnt);
	}
}