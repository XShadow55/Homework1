// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
        zd4();
        zd5();
        zd6();
        zd7();
        zd8();
    }
    public static void zd1() {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void zd2 () {
        System.out.println("Задание 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat+ 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void zd3() {
        System.out.println("Задание 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog  - 3.5;
        cat = cat - 1.6;
        paper = paper  - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void zd4(){
        System.out.println("Задание 4");
        var friend = 19;
        friend = (19 + 2)/7;
        System.out.println(friend);
    }
    public static void zd5() {
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void zd6() {
        System.out.println("Задание 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var generalWeight = weightBoxer1 + weightBoxer2;
        var differenceWeight = weightBoxer2 - weightBoxer1;

        System.out.println(generalWeight);
        System.out.println(differenceWeight);
    }
    public static void zd7() {
        System.out.println("Задание 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        var differenceWeight1 = weightBoxer2 - weightBoxer1;
        var differenceWeight2 = weightBoxer2 % weightBoxer1 ;

        System.out.println(differenceWeight1);
        System.out.println(differenceWeight2);
    }
    public static void zd8() {
        System.out.println("Задание 8");
        var generalTime = 640;
        var workTime = 8;
        var workPeople = generalTime / workTime;


        System.out.println("Всего работников в компании - " + workPeople + " человек");
        var people = workPeople + 94;
        var generalTime1 = people * workTime;
        System.out.println("Если в компании работает " + people + " человек, то всего " + generalTime1 + " часа работы может быть поделено между сотрудниками");
    }
}