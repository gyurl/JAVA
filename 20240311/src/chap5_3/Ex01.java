package chap5_3;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		double avg = 0;
		
//		System.out.println(score);
//		System.out.println(Arrays.toString(score));
//		score[0]=10;
//		score[1]=50;
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100) + 1;
		}
		
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i];
		}
		
		avg = sum / (double)score.length;
		
		System.out.printf("ÃÑÁ¡ : %d%nÆò±Õ : %f",sum, avg);
		//ÃÑÁ¡°ú Æò±ÕÀ» ±¸ÇÏ±â
		
		//Ãâ·Â
		//ÃÑÁ¡ : xxx
		//Æò±Õ : xxx.xxxx
	}
}
