//4.
//        定义一个 Employee 类，该类包含： private 成员变量 name,number,birthday，
//        其中 birthday 为 MyDate 类的对象； abstract方法 earnings()； toString() 方法输出对象的 name,number 和 birthday。
package 第三作业.第四题;

public class main {

    public static void main(String[] args) {
          Employee employee = new Employee("hhh",12) {
              @Override
              public void earnings() {
                  System.out.println("2k");
              }
          };

          employee.toString();
          employee.earnings();

    }
}


abstract class Employee {
    private String name;
    private int number;
    private MyDate myDate;

    Employee(String name, int number){
        this.name = name;
        this.number= number;
        this.myDate= new MyDate();
    }
    public abstract void earnings();

    public String toString(){
       System.out.println(name);
        System.out.println(number);
        System.out.println(myDate);

        return null;
    }
}



class MyDate {

}