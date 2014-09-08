import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the long of array");
		Scanner scan = new Scanner(System.in);
        int arrayLong = scan.nextInt();
        int [] array = new int [arrayLong];
	        for(int i=0;i<arrayLong;i++){
	        	array[i] = (int)(Math.random()*100);
	        }
	    System.out.println("Original array");
        for(int value : array){
        	System.out.format("%d ",value);
        }
        System.out.format("%nSelect type of sorting:%n1: Bubble sort%n2: Quick sort%n");
        int typeSort = scan.nextInt();
        scan.close();
        switch(typeSort){
	        case 1:
	        	bubbleSort(array);
	        	break;
	        case 2:
	        	quickSort(array, 0, array.length-1);
	        	for(int value : array){
	    			System.out.format("%d ",value);
	    		}
	        	break;
        }
	}
	public static void bubbleSort(int[]sortArray){
		boolean flag = true;
		int temp,i=0;
		do{
			flag = false;
			for(i=0;i<sortArray.length-1;i++){
				if(sortArray[i]>sortArray[i+1]){
					temp = sortArray[i];
					sortArray[i] = sortArray[i+1];
					sortArray[i+1] = temp;
					i=0;
					flag = true;
				}
			}
		}
		while(flag);
		for(int value : sortArray){
			System.out.format("%d ",value);
		}
	}
	private static void quickSort(int[]sortArray, int start, int end){
		if (start >= end)
            return;
		int i = start;
		int j = end;
		int currentElement = i-(i-j)/2;
		while(i < j){
			while (i < currentElement && (sortArray[i] <= sortArray[currentElement])) {
                i++;
            }
            while (j > currentElement && (sortArray[currentElement] <= sortArray[j])) {
                j--;
            }
            if (i < j) {
                int temp = sortArray[i];
                sortArray[i] = sortArray[j];
                sortArray[j] = temp;
                if (i == currentElement)
                	currentElement = j;
                else if (j == currentElement)
                	currentElement = i;
            }
		}
		quickSort(sortArray, start, currentElement);
		quickSort(sortArray, currentElement+1, end);
	}
}