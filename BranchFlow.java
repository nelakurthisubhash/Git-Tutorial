import java.util.*;
class A{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
			System.out.println("Enter Number greater than 1");
			return;
		}
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
			else{}
		}
		if(count==2){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a prime Number");
		}
	}
}
