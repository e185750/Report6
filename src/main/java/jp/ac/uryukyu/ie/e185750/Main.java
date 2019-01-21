package jp.ac.uryukyu.ie.e185750;

public class Main {
    public static void main(String[] args){
        Field field = new Field(8,8);
        field.prepare();
        field.putKoma(3,3,"W");
        field.putKoma(3,4,"B");
        field.putKoma(4,3,"B");
        field.putKoma(4,4,"W");
        field.feature();
    }

}
