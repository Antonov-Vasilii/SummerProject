package preparation.tusk4_2;

public class Animal {
    protected int run;
    protected int swim;
    protected double jump;
    protected String record;

    public boolean run(int a){
        if (a <= run) return true;
        else return false;
    }
    public boolean swim(int a){
        if (a <= swim) return true;
        else return false;
    }
    public boolean jump(double a){
        if (a <= jump) return true;
        else return false;
    }
    public void showResult(String record, boolean b){
        System.out.println(record + b);
    }
}


