package chap5_3;

public class Ex08 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i=0; i<numArr.length; i++) {
			
			System.out.println(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i=0; i<numArr.length -1; i++) {
			boolean changed = false;    //자리바꿈이 발생했는지 체크
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {    //옆의 값이 작으면 서로 바뀜
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;             //자리바꿈이 발생했으니 changed를 true로
				}
			}
			if (!changed) break;                //자리바꿈이 없으면 반복문을 멈춤
			
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]);    //결과 출력
			System.out.println();
		}
	}

}
