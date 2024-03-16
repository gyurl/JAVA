package chap5_2;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;
		
		System.out.println(Arrays.toString(score));
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];
		System.out.println(Arrays.toString(score));
		
		System.out.println(tmp);
		
		System.out.println(score[4]);
		
		}
	}


