package com.example.modifier;

class Singleton {
    private static Singleton one; //싱글톤 타입을 한개만 만들어라. 선언함

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (one == null) { //싱글톤 객체가 생성되지 않았으면 하나를 생성해라. one참조변수에 값이 없다.
            one = new Singleton(); //참조변수의 값을 new Singleton에 대입해라.
        }
        return one; //
    }
}

public class SingletonMain {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton(); //컴파일 오류 생김 : 같은 클래스가 아니기 때문
        // private 접근 제어자를 설정하여 다른 클래스에서
        // singleton 클래스의 생성자로의 접근을 막았기 때문
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        //singleton 패턴에 위배되는 경우임
        System.out.println(s1 == s2);
    }
}
