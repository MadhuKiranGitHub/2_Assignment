import java.util.Scanner;

public class printOddNumbersFromArray {

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
		for(int j=0;j<size;j++){
		
			if(array[j]%2==1){
				System.out.println(array[j]+ " is odd");
			}	
		}
		
	}

}
