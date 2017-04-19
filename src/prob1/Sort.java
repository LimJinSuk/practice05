package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//n-1*n!
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
				//내림차순
				if(array[i]<array[j]){
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}

		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}