

public class ArrayAdd {
	public static void main(String args[]) {

		//int[] arr = new int[]{1,2,3,4,5};
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;

		//for each add
		for(int	i=0; i<=2; i++) {
			arr[i]=arr[i]+6;
			System.out.println("Element at 1 = "+arr[i]);
		}
		
		for(int	i=3; i<=4; i++) {
			arr[i]=arr[i]+10;
			System.out.println("Element at 4 = "+arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
	}
}
