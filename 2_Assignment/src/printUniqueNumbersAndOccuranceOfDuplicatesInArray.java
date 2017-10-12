import java.util.Scanner;

public class printUniqueNumbersAndOccuranceOfDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of your array");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("please enter the values");
		for(int i=0;i<size;i++){
			array[i]=input.nextInt();
		}
		//a new array with size 10, all values initialized to 0 by default
		int[] occured=new int[10];
		
		//increment the value of the occured number
		for(int i=0;i<array.length;i++){
			occured[array[i]]++;
		}
		
		/*if occured value=1 number is unique, 
		 * otherwise if value>1 it is duplicated (value times) for those many times.
		 * 
		 */
		for(int j=0;j<occured.length;j++){
			if(occured[j]>1){
				System.out.println(j+ " occured "+occured[j]+ " times" );
			}
			else if(occured[j]==1){
				System.out.println(j + " is unique and occured "+occured[j]+ " time" );
			}
		}
		
		
	}

}
