package swapnumbers;

public class swapnumbers {


		public static void main(String[] args) {
			int num1 = 3; 
			int num2 = 8;
				
				System.out.println("Before Swapping");
				System.out.println("Value of num1 is:" + num1);
				System.out.println("Value of num2 is:" + num2);
				
			swap(num1 ,num2);
					
		}
		private static void swap(int num1, int num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
			
			System.out.println("After Swapping");
			System.out.println("Value of num1 is:" + num1);
			System.out.println("Value of num2 is:" + num2);
		}

	}

