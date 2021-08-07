package preparation.tusk4_2;

public class Main {
    public static void main(String[] args) {
        int amountDish; //количество насыпаемой еды в миске

        int size = 3;

        Cat[] cats = new Cat[size];
        cats[0] = new Cat(100, 1, 1, 50);
        cats[1] = new Cat(150, 2, 2, 75);
        cats[2] = new Cat(200, 3, 3, 100);
        Dish dish1 = new Dish(200);
        amountDish = dish1.filling(200);
        int balanceDish = 0; //остаток еды в миске

        for (int i = 0; i < size; i++) {
            int catFedCat = cats[i].amountOfFood; //количество съеденного котом корма
            balanceDish = amountDish - catFedCat;
            System.out.println("В миске осталось " + balanceDish + " грамм корма");

            if (balanceDish < 0) {
                System.out.println("Миска опусташена, подсыпь корма");
                amountDish = dish1.filling(200);
            }
            cats[i].showResult("Кот наелся -> ", cats[i].fedCat(catFedCat));
        }

    }
}
     /*   Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.showResult("cat1.run(600) -> ", cat1.run(600));
        cat1.showResult("cat1.swim(50) -> ", cat1.swim(50));
        cat1.showResult("cat1.jump(0.5) -> ", cat1.jump(0.5));
        dog1.showResult("dog1.run(100) -> ", dog1.run(100));
        dog1.showResult("dog1.swim(5) -> ", dog1.swim(5));
        dog1.showResult("dog1.jump(0.3) -> ", dog1.jump(0.3));

        Dog dog2 = new Dog(1000, 50, 2);
        Dog dog3 = new Dog(400, 100, 1);

        dog2.showResult("dog2.run(800) -> ", dog2.run(800));
        dog2.showResult("dog2.swim(100) -> ", dog2.swim(100));
        Cat cat0 = new Cat(150,3,3,150);
        Cat cat2 = new Cat(100, 2, 2, 100);
        Cat cat3 = new Cat(200, 1, 2, 50);*/

        //  cat3.showResult("cat3.fedCat(50) -> ", cat3.fedCat(50));


       /* cat2.eating(2);
        cat3.eating(101);

        cat3.showResult("Кот наелся -> ", cat3.fedCat(50));
cats[i].showResult("Кот наелся -> ", cats[i].fedCat(50));
        }*/






