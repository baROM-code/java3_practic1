import java.util.Arrays;

public class testArray<T> {
    private T[] arr;

    public testArray(T... arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "testArray" + Arrays.toString(arr);
    }
}
