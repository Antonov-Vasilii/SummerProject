package preparation.tusk4_1;

public class Employee {
    public String fio;
    public String post;
    public String email;
    public long telephone;
    public int salary;
    public int age;

    public Employee(String _fio, String _post, String _email, long _telephone, int _salary, int _age){
        fio = _fio;
        post = _post;
        email = _email;
        telephone = _telephone;
        salary = _salary;
        age = _age;
    }

   /* public void infoEmployee(){
        System.out.println("Фамилия и инициалы: " + fio);
        System.out.println("Должность: " + post);
        System.out.println("Электронный адрес: " + email);
        System.out.println("Номер телефона: " + telephone);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
    }*/

    public void infoEmployee(){
        System.out.println("Фамилия и инициалы: " + fio + " Должность: " + post +
                " Электронный адрес: " + email + " Номер телефона: " + telephone + " Заработная плата: " + salary +
                " Возраст: " + age);
    }



}
