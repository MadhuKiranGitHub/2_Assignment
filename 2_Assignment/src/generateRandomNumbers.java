import java.util.Random;
import java.util.Scanner;

public class generateRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber=0;
		//Random rand= new Random();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the max number to be generated");
		int max=scan.nextInt();
		for(int i=1;i<=10;i++){
			//randomNumber=rand.nextInt(10);
			randomNumber=(int)(Math.random()*max+1);
			System.out.println("number "+i+" : " +randomNumber);
		}
		

	}

}
