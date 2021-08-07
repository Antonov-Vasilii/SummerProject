package preparation.tusk4_2;

public class Cat extends Animal {
    protected int amountOfFood;
    protected int satiety = 0;
    protected int satiety2;
    protected String record;

    public Cat(){
        this.run = 200;
        this.swim = 0;
        this.jump = 2;
        amountOfFood = 100;
    }
    public Cat(int _run, int _swim, double _jump, int _amountOfFood){
        this.run = _run;
        this.swim = _swim;
        this.jump = _jump;
        amountOfFood = _amountOfFood;
    }
    public void eating(int a){
        satiety = satiety + a;
      //  System.out.println(satiety);
        }

    public boolean fedCat(int a){
        satiety2 = satiety2 + a;
        if (satiety2 < amountOfFood) return false;
        else return true;
    }


}
