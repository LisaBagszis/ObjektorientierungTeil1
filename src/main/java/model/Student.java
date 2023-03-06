package model;

public class Student {

    protected String firstCharacteristic;

    private String secondCharacteristic;

    private String thirdCharacteristic;


    public Student () {

    }


    public Student (String secondCharacteristic, String firstCharacteristic, String thirdCharacteristic) {
        this.secondCharacteristic = secondCharacteristic;
        this.firstCharacteristic = firstCharacteristic;
        this.thirdCharacteristic = thirdCharacteristic;

    }

    public String getFirstCharacteristic() {
        return firstCharacteristic;
    }

    public String getSecondCharacteristic() {
        return secondCharacteristic;
    }

    public String getThirdCharacteristic() {
        return thirdCharacteristic;
    }

    /*public void setFirstCharacteristic(String firstCharacteristic) {
        this.firstCharacteristic = firstCharacteristic;
    }

    public void setSecondCharacteristic(String secondCharacteristic) {
        this.secondCharacteristic = secondCharacteristic;
    }

    public void setThirdCharacteristic(String thirdCharacteristic) {
        this.thirdCharacteristic = thirdCharacteristic;
        } --> wird durch Konstruktor ersetzt. Nur nötig wenn man eine Methode seperat setten will*/



    public String toString() {
        return firstCharacteristic + " " + secondCharacteristic + " " + thirdCharacteristic;
    }

    //set ermöglicht es die Eigenschaft zu setzen und get sie abzufragen
}
