package Lesson1;

public class Human extends Parents{
    int age;
    String name;


    public Human(int age, String national, String mother, String father, String name, String surname,String eyeColor) {
        this.age = age;
        this.national = national;
        this.name = name;
        super.mother = mother;
        super.father = father;
        super.surname = surname;
        super.eyeСolor = eyeColor;
    }
    public void Hi(){
        System.out.printf("Hi, my name is %s ", name);
    }
    public String biography(){
        return  "\n I am " + age +
                "\n My mother's name is " + mother +
                "\n My father's name is " + father +
                "\n Our last name " + surname +
                "\n Our national is " + national +
                "\n My eyes are " + eyeСolor;
    }
}
