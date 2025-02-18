class Bubblesort {
    static void bubblesort(int array[]) {
        int size = array.length;
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];        
                    array[j] = array[j + 1];     
                    array[j + 1] = temp;         
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]data = {64,34, 25, 12, 22, 11,90}; 
        bubblesort(array);
        System.out.println("Sorted array:"+Arrays.toString(array));
    }
}


