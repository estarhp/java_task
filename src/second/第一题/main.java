package second.第一题;

public class main {
    public static void main(String[] args) {
        Monkey  monkey = new Monkey("dashabi");
        People people =new People("laobeibi");

        monkey.speak();
        people.speak();
        people.think();
    }

}

class Monkey {
    String name;
    Monkey(String s){
     name=s;
    }
    public void speak(){
        System.out.println("咿咿呀呀");
    }

}

class People extends Monkey {

    People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样儿，不错嘛！会说话了！");
    }
    public void think() {
        System.out.println("别说话！认真思考！");
    }
}
