package org.satheesh.map.equalsandhashcode.model;

/**
 * Created by Satheesh Reddy on 6/14/2017.
 */
public class Student {
    private String RegNum ;
    public Student(String RegNum){
        this.RegNum = RegNum;
    }


    public String getRegNum() {
        return RegNum;
    }

    public void setRegNum(String regNum) {
        RegNum = regNum;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return RegNum.equals(student.RegNum);


    }

    @Override
    public int hashCode() {

        return RegNum.hashCode();
    }
}
