public class ArrayReverse {
	public static void main(String args[]) {

//		int[] arr = new int[]{1,2,3,4,5};
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;

		//for 
		for(int counter=arr.length - 1; counter >= 0; --counter){
            System.out.println(arr[counter]);
        }
		System.out.println("");
		
		//while
		int i = 4;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i--;
		}
		
		//System.out.println(Arrays.toString(arr));	
	}
	
}
