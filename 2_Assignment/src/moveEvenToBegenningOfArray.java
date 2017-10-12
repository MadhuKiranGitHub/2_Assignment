import java.util.Scanner;

public class moveEvenToBegenningOfArray {

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
		
		int i=0;
		int j=array.length-1;
		
		while(i<j){
			if(array[i]%2==0){
				i++;
			}
			else if(array[j]%2==1){
				j--;
			}
			else{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println("after moving even number to beginning of array");
		for(i=0;i<array.length;i++)
		System.out.print(array[i]+ " ");
	}

}
