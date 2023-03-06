public class Main {

    public static void main(String[] args) {
           Student basicStudent = new Student();

           basicStudent.setFirstCharacteristic("poor");
           basicStudent.setSecondCharacteristic("Study Course");
           basicStudent.setThirdCharacteristic("age");

           System.out.println(basicStudent.getFirstCharacteristic());
           System.out.println(basicStudent.getSecondCharacteristic());
           System.out.println(basicStudent.getThirdCharacteristic());
    }
}
