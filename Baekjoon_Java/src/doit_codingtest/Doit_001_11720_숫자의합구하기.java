package doit_codingtest;

import java.util.Scanner;

/**
 *  문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *  입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 *  출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
 */

public class Doit_001_11720_숫자의합구하기 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String sNum = scanner.next(); // N개의 숫자가 공백 없이 쓰인다.
        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 저장하기
        char[] cNum = sNum.toCharArray(); // String의 숫자를 한 개씩 꺼낼 때 toCharArray를 사용하낟.
        int sum = 0;
        for(int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }
        System.out.println(sum);
    }
}
