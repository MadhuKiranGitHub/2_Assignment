import java.util.Scanner;

public class compare2ArraysAndDispalyRepeatingNumbers {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("enter your array size");
		int size=input.nextInt();
		int[] array1=new int[size];
		int[] array2=new int[size];
		System.out.println("please enter "+size+" values for first array");
		for(int i=0;i<array1.length;i++){
			array1[i]=input.nextInt();
		}
		System.out.println("please enter "+size+" values for second array");
		for(int i=0;i<array2.length;i++){
			array2[i]=input.nextInt();
		}
		
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if(array1[i]==array2[j]){
					
					System.out.println(array1[i]+ " is repeated in second array");
				}
			}
		}
		
	}

}

