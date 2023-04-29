package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,7,6,8};
		for (int i=0; i<arr.length;i++) {
			Arrays.sort(arr);
			if(arr[i]+1!=arr[i+1]) {
				System.out.println(arr[i]+1);
				break;
			}
		}
	}

}
