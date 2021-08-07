package preparation.tusk4_2;

public class Dish {
    protected int volume; // объём миски
    protected int balance = 0; // количество еды, ед
    public int eat;

    public Dish(int _volume) {
        volume = _volume;
    }

    /*метод наполнения миски*/
    public int filling(int howMuch) {
        balance = balance + howMuch;

        if (balance > volume) {
            System.out.println("Многовато корма для этой миски");
            balance = balance - howMuch;
        } else {
            System.out.println("В миске находится " + balance + " грамм корма");
        }
        return balance;
    }
}
    /*вывод информации об остатке корма в миске*/
  /*  public void infoAboutFood() {
        if (balance <= volume && balance >= 0) {
            System.out.println("В миске " + balance + " грамм корма");
        }
        else {System.out.println("Миска не резиновая и не черная дыра");}*/



