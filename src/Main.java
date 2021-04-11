
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public abstract class Main {

    public static void main(String[] args) {

        /*
        1. Написать метод, который меняет два элемента массива местами.
        (массив может быть любого ссылочного типа);
         */

        System.out.println("Задание 1");
        testArray<Integer> arr1 = new testArray<>(1, 2, 3, 4, 5);
        System.out.println(arr1.toString());
        swap2ArrayElements(arr1, 1, 4);
        System.out.println(arr1.toString());

        /*
        2. Написать метод, который преобразует массив в ArrayList;
         */
        System.out.println("Задание 2");
        testArray<String> arr2 = new testArray<>("qqqq", "wwww", "eeee");
        ArrayList<testArray> arrList2 = new ArrayList<>();
        arrList2 = ArraytoArrayList(arr2);
        System.out.println(arrList2.toString());
        arrList2 = ArraytoArrayList(arr1);
        System.out.println(arrList2.toString());

        /*
         3.
         */

        System.out.println("Задание 3");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box box1 = new Box();
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(orange1);

        Box box2 = new Box();
        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(orange3);

        System.out.println("Вес 1-й коробки: " + box1.getWeight());
        System.out.println("Вес 2-й коробки: " + box2.getWeight());
        System.out.println("box1 = box1 ? " + box1.compare(box1));
        System.out.println("box1 = box2 ? " + box2.compare(box1));

        Box box3 = new Box();
        // box3.addFruit(orange1);
        box3.addFruit(apple3);
        box1.putToBox(box3);
        System.out.println("Вес 1-й коробки: " + box1.getWeight());
        System.out.println("Вес 3-й коробки: " + box3.getWeight());
    }


    public static ArrayList ArraytoArrayList(testArray arr) {
        Object[] linkArr = arr.getArr();
        ArrayList<Object> res = new ArrayList<>();
        for (int i = 0; i < linkArr.length; i++) {
            res.add(i, linkArr[i]);
        }
        return res;
    }

//    public static <T>ArrayList ArraytoArrayList_v2(T[] arr) {
//        ArrayList<T> res = new ArrayList<>();
//        res.addAll(Arrays.asList(arr));
//        return res;
//    }

    public static void swap2ArrayElements(testArray arr, int idx1, int idx2){
        // метод меняет два элемента массива местами
        Object[] tempArr = arr.getArr();
        Object tempEl = tempArr[idx1];
        tempArr[idx1] = tempArr[idx2];
        tempArr[idx2] = tempEl;
        arr.setArr(tempArr);
    }

}
