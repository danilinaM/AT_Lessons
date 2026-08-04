package alfa.lesson14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class OptionalTask {

    private String name;
    protected int age;

    public static void main(String[] args) {
        OptionalTask optionalTask = new OptionalTask("Name1", 33);
        System.out.println();
        OptionalTask.getObjectInfowithoutDeclared(optionalTask);
        System.out.println();
        OptionalTask.getObjectInfowithDeclared(optionalTask);
    }

    public OptionalTask(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public OptionalTask() {
    }

    void addSecondName(String secondName) {
        this.name = name + " " + secondName;
    }

    private String checkIfAgeIsInPartyRange() {
        if (this.age > 21 && this.age < 50) {
            return "You can visit this party";
        }
        return "You should sleep at night";
    }


    @Override
    public String toString() {
        return "OptionalTask object info" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void getObjectInfowithoutDeclared(Object obj) {
        Class<?> clas = obj.getClass();
        StringBuilder str = new StringBuilder();
        str.append("Инфа об объекте (without declared) :").append("\n");
        for (Field f : clas.getFields()) {
            str.append("Field: ").append(f).append("\n");
        }
        for (Method m : clas.getMethods()) {
            str.append("Method: ").append(m).append("\n");
        }
        for (Constructor<?> c : clas.getConstructors()) {
            str.append("Constructor: ").append(c).append("\n");
        }
        Scanner scanner = new Scanner(str.toString());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void getObjectInfowithDeclared(Object obj) {
        Class<?> clas = obj.getClass();
        StringBuilder str = new StringBuilder();
        str.append("Инфа об объекте (with declared) :").append("\n");
        for (Field f : clas.getDeclaredFields()) {
            str.append("Field: ").append(f).append("\n");
        }
        for (Method m : clas.getDeclaredMethods()) {
            str.append("Method: ").append(m).append("\n");
        }
        for (Constructor<?> c : clas.getDeclaredConstructors()) {
            str.append("Constructor: ").append(c).append("\n");
        }
        Scanner scanner = new Scanner(str.toString());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
