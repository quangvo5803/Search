package Common;

public class Algorithm {
    public void bubbleSort (int []a){
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
     public int partition(int[] array, int left, int right) {
        
        int i = left, j = right;
        
        int pivot = array[(left + right) / 2];
        
        int tmp;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }

    public void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

    public int linearSearch(int []a,int key){
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int a[],int value,int left,int right){
        if(left > right){
            return -1;
        }
        int middle = (left + right)/2;
        if(a[middle] == value){
            return middle;
        }else if(a[middle] > value){
            return binarySearch(a, value, left, middle -1);
        }else {
            return binarySearch(a, value, middle +1, right);
        }
    }
}
