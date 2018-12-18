import java.util.Arrays;

public class Array {
	public static void main(String args[]) {

//		int[] arr = new int[]{1,2,3,4,5};
		int[] arr = new int[5];
		arr[0]=15;
		arr[1]=17;
		arr[2]=19;
		arr[3]=33;
		arr[4]=39;

		//for each
		for (int element: arr) {
            System.out.println(element);
        }
		System.out.println("");
		
		//for natural
		for(int arr1=1; arr1<6; arr1++) {
			System.out.println(arr1);
		}
		System.out.println("");
		
		//while
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("");
	
		System.out.println(Arrays.toString(arr));	
	}
	
}
