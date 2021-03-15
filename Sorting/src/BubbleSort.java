
public class BubbleSort {
	public static void main(String[] args) {
		int[]  numbers= {7,9,3,6};
//		int counter=0;
		boolean swapped;
		for (int i = 0; i < numbers.length-1; i++) {
//			counter++;
			swapped=false;
			for (int j = 0; j < numbers.length-(i+1); j++) {
//				counter++;
				int temporary;
				if(numbers[j]>numbers[j+1]) {
					temporary=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temporary;
					swapped=true;
				}
			}	
			if(swapped==false)
				break;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
