import java.util.Arrays;

class Test{
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(Arrays.toString(dynamicArray.data));
        dynamicArray.add(90, 4);
        System.out.println(Arrays.toString(dynamicArray.data));
    }
}

public class DynamicArray {
    int[] data = {0,1,2,3,4,5,6,7};

    void add(int element, int index) {
        int[] temp = new int[data.length + 1];
        System.arraycopy(data, 0, temp, 0, index);
        System.arraycopy(data, index, temp, index+1, data.length-index);
        temp[index] = element;
        this.data = temp;

    }
}
