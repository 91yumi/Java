package com.example.modifier;

//1) 멤버변수를 static으로 선언하면 여러 객체가 공유하는 변수입니다.
// 객체 생성하지 않고 클래스 이름.static 변수이름으로 사용 가능합니다.
class Count {
    int a = 0;
    static int b = 0;
}

public class StaticMain {

    public static void main(String[] args) {
        Count c1 = new Count();
        c1.a++; //1
        c1.b++; //1

        System.out.println("c1.a=" + c1.a);
        System.out.println("c1.b=" + c1.b);

        Count c2 = new Count();
        c2.a++; //1
        c2.b++; //2
        Count.b++; //클래스 이름. static 변수명  //b=3

        System.out.println("c2.a=" + c2.a);
        System.out.println("c2.b=" + c2.b);


    //method()가 static으로 선언된 경우, math.random()
    //빈번하게 호출될 때 객체 생성 없이 사용 가능합니다.
        Math.random(); //random()은 매개변수가 없는 경우

        //String을 int type으로 변환
        int c = Integer.parseInt("123"); //매개변수가 있는 경우
        System.out.println(c+100);

        //Util클래스에 있는 static method() : getCurrentDate()
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}