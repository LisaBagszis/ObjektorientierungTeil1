package model;

import model.Student;

public class Main {

    public static void main(String[] args) {
           Student basicStudent = new Student("girl", "boy", "genius");

           /*basicStudent.setFirstCharacteristic("poor");
           basicStudent.setSecondCharacteristic("Study Courses");
           basicStudent.setThirdCharacteristic("age");*/

           Student basicStudent2 = new Student("foolish", "cool", "boring");

           /*System.out.println(basicStudent.getFirstCharacteristic());
           System.out.println(basicStudent.getSecondCharacteristic());
           System.out.println(basicStudent.getThirdCharacteristic());
           System.out.println(basicStudent2.getSecondCharacteristic());*/
           System.out.println(basicStudent.toString());
           System.out.println(basicStudent2.toString());

    }
}
