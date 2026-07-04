import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q14_LearnArrayListCf {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(40);
        System.out.println(list);
        list.remove(0);


        List<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(20);


        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        // i want to traverse list using iterator


        Iterator<Integer> iterator= list.iterator();

        while(iterator.hasNext()){
            System.out.println("element is"+ iterator.next());



            List<Integer>list3=new ArrayList<>();
            list3.add(10);
            list3.add(20);
            list3.add(30);
            System.out.println(list3.get(2));

            System.out.println("before set "+ list3);
            list3.set(0, 100 );

            System.out.println("after set"+ list3);


            // to arraylist

            Object[]arr= list3.toArray();
            for(Object obj:arr){
                System.out.println(obj);
            }


            // contain gives only true false



           System.out.println( list3.contains(100));

           list.add(9);
           list.add(2);

           System.out.println("printing entire list"+ list);

           Collections.sort(list);
           System.out.println(list);


}




    }
    

    
}
