package com.ucreativa.familia;

public class Xinia {

    private int age;
    private String hobby;

    public Xinia(String saludo, int age, String hobby) {
        this.age = 55;
        this.hobby = "Gardening";
        System.out.println(saludo);
    }
    public void setAge(){
        this.age = this.age + 1;
        }
   public int getAge(){
        return this.age;
        }
   public String getHobby(){
        return hobby;
        }
}