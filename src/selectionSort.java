
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int m =-1;
		int arr1[] = {9,7,8,2,3,4,6};
		for(int i=0;i<arr1.length-1;i++){
			int m = i;
			for(int j=1+i;j<arr1.length;j++) {
				if(arr1[j]<arr1[m]) {
					m = j;
				}
				
			}
			int temp = arr1[i];
			arr1[i] = arr1[m];
			arr1[m] = temp;
			
		}
		
		for(int  i= 0 ; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		

	}

}
