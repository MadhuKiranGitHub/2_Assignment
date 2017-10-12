import java.util.Scanner;

public class countThePairsInArrayThatSumToEven {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("enter your array size");
		int size=input.nextInt();
		int[] array=new int[size];
		
		System.out.println("please enter"+size+" values");
		for(int i=0;i<array.length;i++){
			array[i]=input.nextInt();
		}
		int pairCount=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if((array[i]+array[j])%2==0){
					System.out.println(array[i]+ "+" + array[j]+ " = "+ (array[i]+array[j]) );
					pairCount++;
				}
			}
		}
		System.out.println(pairCount+ " Pairs can sum to even");
			
	}

}
