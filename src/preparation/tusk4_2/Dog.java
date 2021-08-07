package preparation.tusk4_2;

public class Dog extends Animal {
    public Dog(){
        this.run = 500;
        this.swim = 10;
        this.jump = 0.5;
    }
    public Dog(int a, int b, double c){
        this.run = a;
        this.swim = b;
        this.jump = c;
    }
}
