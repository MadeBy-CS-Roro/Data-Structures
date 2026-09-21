class DynamicArray {
    public int [] dynamicArray;
    public int capacity;
    public int size;

    public DynamicArray(int capacity) { 
        if(capacity>0){
            this.capacity =capacity;
            this.size =0;
            this.dynamicArray = new int[capacity];
           
        }
    }

    public int get(int i) {
        return  dynamicArray[i];
    }

    public void set(int i, int n) {
        dynamicArray[i]=n;

    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        dynamicArray[size] = n;
        size++;

    }

    public int popback() {

     if(size > 0){
            size--;
        }
        return  dynamicArray[size];
    }
    

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = dynamicArray[i];
        }
        dynamicArray = newArr;
    }

    
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;

    }
}
