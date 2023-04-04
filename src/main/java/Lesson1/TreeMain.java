package Lesson1;

public class TreeMain {
    public static void main(String[] args) {
        Human man = new Human(14,"Russian", "Mariya", "Petr", "Vasiliy", "Fedorov", "Blue");
        man.Hi();
        System.out.println(man.biography());
        man.setFather("Anatoly");
        System.out.println("Now I have a new dad " + man.getFather());
    }

}
