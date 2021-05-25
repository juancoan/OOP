package com.ucreativa.familia;

public class Papas {

    private int Age;
    private String Hobby;

    public void setAge(){
        this.Age = this.Age + 1;
    }

    public int getAge(){
        return this.Age;
    }

    public String getHobby(){
        return this.Hobby;
    }

    public Papas(String saludo){
        this.Age = 79;
        this.Hobby = "Coser";
        System.out.println(saludo);
    }
}
