package doit_codingtest;

import java.util.Scanner;

public class Doit_002_1546_평균구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 과목의 갯수
        long sum = 0; // 각 점수의 합계
        long max = 0; // 점수의 최댓값
        for(int i = 0; i < N; i++) { // 과목의 갯수만큼 반복문 돌림
            int temp = scanner.nextInt(); // 반복문이 도는 동안 입력값(과목의 점수)을 받을 temp 임시 변수 생성
            if(temp > max) max = temp; // 최댓값을 max변수에 저장
            sum += temp; // 각 점수의 합을 sum 변수에 저장
        }
        System.out.println(sum*100.0/max/N); // 평균 구하는 공식 사용하여 문제 해결
    }
}
