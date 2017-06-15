package org.satheesh.map.equalsandhashcode.test;

import org.satheesh.map.equalsandhashcode.model.Student;
import org.satheesh.map.equalsandhashcode.resources.Marks;

import java.util.*;

/**
 * Created by Satheesh Reddy on 6/14/2017.
 */
public class Test {

    public   static  Map<Student, Marks> sortingMap(Map<Student, Marks> marksMap){
        //Storing Map key values into List

        List<Map.Entry<Student,Marks>> list= new LinkedList<>(marksMap.entrySet());

        // sorting map on values
       /* Comparator<Map.Entry<Student,Marks>> comparator =(o1,o2)->{
            if(o1.getValue().getMarks()>o2.getValue().getMarks()) {
                return -1;
            }
            else if(o1.getValue().getMarks()<o2.getValue().getMarks()) {
                return 1;
            }
            return 0;
        };*/


        //Sorting based on Keys

        Comparator<Map.Entry<Student,Marks>> comparator =(o1,o2)->o1.getKey().getRegNum().compareTo(o2.getKey().getRegNum());
        //Comparator<Map.Entry<Student,Marks>> comparator =Comparator.comparing(Marks::getMarks);
        Collections.sort(list,comparator );
        //System.out.print(list);

        Map<Student,Marks> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Student,Marks> entry: list) {

            sortedMap.put(entry.getKey(), entry.getValue());

        }

       return sortedMap;

    }
    public  static void main(String... args){

        Map<Student, Marks> marksMap = new HashMap<Student, Marks>();
        System.out.println("========================");

        for(int i=0; i<100; i++){
            marksMap.put(new Student("H"+i), new Marks());
        }
        System.out.println(marksMap.size());
        System.out.println("**************************");
        System.out.println("After Sorting");



        for (Map.Entry<Student,Marks> entry: sortingMap(marksMap).entrySet()
                ) {
            System.out.println("Student: "+entry.getKey().getRegNum()+" "+"Marks :"+entry.getValue().getMarks());

        }








    }
}
