package de.neuefische;



public class Main {
    public static void main(String[] args) {
       Service service = new Service();

        System.out.println(service.getStringById("1"));
        System.out.println(service.getStringById2("1"));


    }
}