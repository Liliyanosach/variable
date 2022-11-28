public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }
    private static void Task1() {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    private static void Task2() {
        System.out.println("Задача 2");
        var dog = 8 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    private static void Task3() {
        System.out.println("Задание 3");
        var dog = 8 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    private static void Task4() {
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    private static void Task5() {
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    private static void Task6() {
        System.out.println("Задание 6");
        var weightSportsmanFirst = 78.2;
        var weightSportsmanTwo = 82.7;
        var totalWeight = weightSportsmanFirst + weightSportsmanTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");

        var differenceWeight = weightSportsmanTwo - weightSportsmanFirst;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");
    }
    private static void Task7() {
        System.out.println("Задание 7");
        var weightSportsmanFirst = 78.2;
        var weightSportsmanTwo = 82.7;
        var differenceWeight = weightSportsmanTwo - weightSportsmanFirst;
        System.out.println("Разница весов спортсменов " + differenceWeight);
        var differenceWeight2 = weightSportsmanTwo % weightSportsmanFirst;
        System.out.println("Разница в весе " + differenceWeight2 + " кг");
    }
    private static void Task8() {
        System.out.println("Задание 8");
        var hours = 640;
        var workingHours = 8;
        var totalEmployees = hours / workingHours;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        var newTotalEmployees = totalEmployees + 94;
        var newHours = workingHours * newTotalEmployees;
        System.out.println("Если в компании работает " + newTotalEmployees + " человека, то всего " + newHours + " часов работы может быть поделено между сотрудниками");


    }


    }

