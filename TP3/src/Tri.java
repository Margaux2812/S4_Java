import java.util.Arrays;

public class Tri {
	static void swap(int[] array,int index1,int index2) {
		if(index1 != index2) {
			int tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
		}
	}
	
	static int indexOfMin(int[] array, int minIndex, int maxIndex) {		
		if(minIndex < 0)
			minIndex = 0;
		if(maxIndex > array.length)
			maxIndex = array.length;
		
		int min = minIndex;
		
		for(int i=minIndex; i<maxIndex; i++) {
			if(array[i] < array[min])
				min = i;
		}
		
		return min;
	}
	
	static void sort(int[] array) {
		for(int i=0; i<array.length; i++) {
			swap(array, i, indexOfMin(array, i, array.length));
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 1, 2, 0};
	       
	       sort(array);
	       
	       System.out.println(Arrays.toString(array));
	}
}
