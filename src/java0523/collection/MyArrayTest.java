package java0523.collection;

import java.util.ArrayList;

class MyArray<E>{
    private Object[] array = new Object[10];
    int i;
    public void add(E obj){
        array[i++]= obj;
    }
    public E get(int index){
        return (E) array[index];
    }
}
    public class MyArrayTest {
    public static void main(String[] args) {
        MyArray<String> myarray1= new MyArray();
        myarray1.add(new String("test1"));
        myarray1.add(new String("test2"));
        String str = myarray1.get(0);
        System.out.println(str);

        MyArray<Integer> myArray2= new MyArray<>();
        myArray2.add(new Integer(100));
        Integer num= myArray2.get(0);
        System.out.println(num);

        MyArray<ArrayList<String>> myArray3= new MyArray<>();
        ArrayList<String> strList= new ArrayList<>();
        strList.add("ArrayList");
        strList.add("ArrayList2");
        myArray3.add(strList);

        ArrayList<String> strList2= new ArrayList<>();
        strList2.add("ArrayList3");
        myArray3.add(strList2);

        ArrayList<String> strList3= new ArrayList<>();
        strList3.add("ArrayList4");
        strList3.add("ArrayList5");
        myArray3.add(strList3);

        System.out.println(myArray3.get(0));
        System.out.println(myArray3.get(0).get(0));
        System.out.println(myArray3.get(0).get(1));
        System.out.println(myArray3.get(1).get(0));
        System.out.println(myArray3.get(2).get(0));



    }
}
