package day02;

public class Average {

	public static void main(String[] args) {
		int compgrade, proggrade, mathgrade, archgrade;
		short average;
		
		compgrade = 88;
		proggrade = 92;
		mathgrade = 79;
		archgrade = 80;
		
		average = (short) ((compgrade + proggrade + mathgrade + archgrade) / 4);
		
        System.out.println("영작문 과목의 점수 : " + compgrade);
        System.out.println("프로그래밍 과목의 점수 :" + proggrade);
        System.out.println("이산수학 과목의 점수 : " + mathgrade);
        System.out.println("컴퓨터 구조 과목의 점수 : " + archgrade);
        System.out.println("-----------------------");
        System.out.println("평균 점수 : " + average);
	}

}
