import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        System.out.print("Введите ваш возраст: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age >= 18){
            System.out.println("Вы совершеннолетний человек!");
        } else {
            System.out.println("Вы не достигли совершеннолетия, Вам нужно немножко подождать...");
        }

    }
    public static void task2 () {
        System.out.println("Задача 2");
        System.out.print("Введите сколько градусов на улице: ");
        Scanner in = new Scanner(System.in);
        int degrees = in.nextInt();

        if(degrees <= -5){
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        System.out.print("Введите скорость автомобиля: ");
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();

        if(speed > 60){
            System.out.println("Если скорость " + speed + " , то придеться заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        System.out.print("Введите ваш возраст: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age >= 2 && age <= 6){
            System.out.println("Если Ваш возраст " + age + " , то Вы должны ходить в садик");
        } else if (age >= 7 && age <= 18){
            System.out.println("Если Ваш возраст " + age + " , то Вы должны ходить в школу");
        } else if (age > 18 && age < 24){
            System.out.println("Если Ваш возраст " + age + " , то Вы должны ходить в университет");
        } else if (age > 24){
            System.out.println("Если Ваш возраст " + age + " , то Вы должны ходить на работу");
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        System.out.print("Введите возраст ребенка: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age < 5) {
            System.out.println("Если возраст ребенка " + age + " , то он не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка " + age + " , то он может кататься без сопровождения взрослого.");
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер вашего билета: ");
        int numberTicket = in.nextInt();

        if (numberTicket>= 1 && numberTicket <= 60){
            System.out.print("В вагоне есть сидячие места");
        } else if (numberTicket > 60 && numberTicket <= 102){
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float one = in.nextFloat();
        System.out.println("Введите второе число: ");
        float two = in.nextFloat();
        System.out.println("Введите третье число: ");
        float three = in.nextFloat();

        if (one > two && one> three){
            System.out.println("Самое большое число: " + one);
        } else if (two > one && two > three){
            System.out.println("Самое большое число: " + two);
        } else if (three > one && three > two){
            System.out.println("Самое большое число: " + three);
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }
}