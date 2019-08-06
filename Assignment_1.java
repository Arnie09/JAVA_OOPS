/*  Write a program to show thenumbers which are prime in a given range using command line
	WAJP to display a fibonacci series of n terms where n will be taken from command line argument
	WAJP to arrange a set of integer numbers in ascending order where input wil be taken through command line argument. */


class Assignment_1Q1{

	/*function to sort thenumbersin ascending order */
	public static void sort(int arr[],int n){
		for(int i = 0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int i = 0;i<n;i++){
			for (int j = 0;j<n-i-1;j++){
				if (arr[j]>arr[j+1]){
					int swap = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = swap;
				}
			}
		}
		for(int i = 0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/*function to find prime*/
	public static void prime(int lb,int ub){
		int count = 0;
		for(int i = lb;i<=ub;i++){
			for(int j = 1;j<=i;j++){
				if(i%j==0)
					count+=1;
			}
			if(count==2){
				System.out.println(i+" is a prime number!");
			}
			count = 0;
		}
	}

	/* function to fibonacci series */
	public static void fibonacci(int limit){
		int a = 0;
		int b = 1;
		int c = 1;
		if (limit == 1){
			System.out.println(a);
			return;
		}
		else if(limit == 2){
			System.out.println(a+"\n"+b);
			return;
		}
		System.out.println(a+"\n"+b);
		for(int i = 2;i<= limit;i++){
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	/* driver main */
	public static void main(String args[]){

		int choice = Integer.parseInt(args[0]);

		if(choice  == 1){
			int lb = Integer.parseInt(args[1]);
			int ub = Integer.parseInt(args[2]);
			prime(lb,ub);
		}
		else if( choice == 2){
			int limit = Integer.parseInt(args[1]);
			fibonacci(limit);
		}
		else if(choice == 3){
			int n = Integer.parseInt(args[1]);
			int array [] = new int[n];
			for (int i = 0;i<n;i++){
				array[i] = Integer.parseInt(args[i+2]);
			}
			sort(array,n);
		}

		
	}
}
