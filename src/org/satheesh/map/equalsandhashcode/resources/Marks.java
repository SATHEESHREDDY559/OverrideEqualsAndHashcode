package org.satheesh.map.equalsandhashcode.resources;

/**
 * Created by Satheesh Reddy on 6/14/2017.
 */
public class Marks {

    public int marks;
    public  Marks(){
        this.marks =(int)(Math.random()*101)+1;

    }

    public  int getMarks(){
        return marks;
    }

}
