package com.ucreativa.familia;

public class Papas {

    private int Age;
    private String Hobby;

    public void setAge(){ //metodo setter, no retorn nada void
        this.Age = this.Age + 1;
    }

    public int getAge(){ //metodo getter, retorna valor int
        return this.Age;
    }

    public String getHobby(){ //metodo getter, retorna valor String
        return this.Hobby;
    }

    public Papas(String saludo){ //constructor
        this.Age = 79;
        this.Hobby = "Coser";
        System.out.println(saludo);
    }
}
