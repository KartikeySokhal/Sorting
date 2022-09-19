
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,0,2,8,1};
		for(int i= 0; i<arr.length-1;i++) {
			for(int j=1+i;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i =0; i<5;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
