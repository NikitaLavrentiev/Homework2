
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }


    public static void task1 () {
        System.out.println("\nЗадача 1");

        var dog =8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


    }
    public static void task2 () {
        System.out.println("\nЗадача 2" );
        var dog =8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("\nЗадача 3");

        var dog =8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("\nЗадача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);


    }
    public static void task5() {
        System.out.println("\nЗадача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("\nЗадача 6");

        var box1 = 78.2;
        var box2 = 82.7;

        var boxersWeight  = box1 + box2;
        System.out.println("Вес обоих бойцов " + boxersWeight + " кг");

        var overload = (box1 - box2) % boxersWeight;
        System.out.print("Разница в весе боксёров " + Math.abs(overload) + " кг");

        if (Math.abs(overload) < 1) {
            System.out.println("\nБой состоится");
        } else {

            System.out.println("\nБоя не будет, расходимся на обед");
        }

    }

    public static void task7() {
        System.out.println("\nЗадача 7");

        var box1 = 78.2;
        var box2 = 82.7;

        double module;
        module = Math.abs(box1 - box2);
        System.out.println(module);

        var sumOfWeight = box1 + box2;
        int AnotherWeight = (int) (module % sumOfWeight);
        System.out.println(AnotherWeight);

        }

    public static void task8() {
        System.out.println("\nЗадача 8");

        var allTime = 640;
        var workingTime = 8;
        var workers =  (allTime / workingTime);
        System.out.println(workers + " человек работает в компании");

        workers = workers + 94;
        workingTime = (allTime / workers);
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workingTime + " часов работы может быть поделено между сотрудниками");


    }
}



