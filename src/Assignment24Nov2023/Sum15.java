package Assignment24Nov2023;

public class Sum15 {
	
	/*You are given a array of integer. You need to find all numbers whose sum is 15
	array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
	Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20*/
void sumOfNumbers() {
	int[] numbers = {-40,-5,1,3,6,7,8,20};
	int flag=0;
	
	for(int i=0;i<numbers.length;i++) {
		
		for(int j=0;j<numbers.length;j++) {
			if(numbers[i]+numbers[j]==15) {
				System.out.println("Pair of numbers whose sum is 15 are"+numbers[i]+" and "+numbers[j]);
				flag++;
				
			}
			if(flag==2) {
				break;
			}
		}
	}
}
}
