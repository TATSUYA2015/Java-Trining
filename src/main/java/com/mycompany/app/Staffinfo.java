package com.mycompany.app;


class staff {
    String name;
    int staffid;
    String email;
}


public class Staffinfo {
    public static void main(String[] args) {
        staff yamada = new staff();
        yamada.name = "Taro Yamada";

        System.out.println(yamada.name);
    }
    
}
