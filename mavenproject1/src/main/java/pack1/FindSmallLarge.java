package pack1;

public class FindSmallLarge {
	
	public static void main(String[] args) {
		int[] numbers= {10,25,5,40,39,4};
		int large=numbers[0];
		int small=numbers[0];
		//print all elements
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		//find largest and smallest number
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>large) {
				large=numbers[i];
			}else if(numbers[i]<small) {
				small=numbers[i];
			}
		}
		//print 
		System.out.println("Smallest number= "+small);
		System.out.println("Largest number= "+large);
	}

}
