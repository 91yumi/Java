# 예외 처리
- Error는 프로그램 실행에 치명적인 영향을 주는 상황을 나타내므로 Error발생 시 프로그램 종료
- Exception은 적절한 처리를 하여 <b color="red">프로그램을 계속 실행</b>시킬 수 있다.
## 예외 처리 방법 2가지
- try ~ catch ~ finally
  - 예외의 원인이 현재 실행되는 블록에 있는 경우, 직접 예외를 처리하는 구문
~~~java
    try{
    //예외가 발생할 가능성이 있는 코드
    }catch(Exception){
    //예외가 발생했을 때 실행할 코드
    }finally{
    //반드시 실행해야할 코드(예시 : 자원 반납)
    }
~~~

- throws
    - 예외의 원인이 그 메서드를 호출하는 호출자에게 있을 경우
    - 예외 발생 시 예외가 발생했음을 메서드 호출자에게 통지(던지다) 해줌
    - 메서드 선언부에 throws 절 사용
## 예외의 종류
  - runtime exception (실행 예외) : 예외 처리 하지 않아도 컴파일 수행함.<br>
    예시) 올바르게 설계되지 않고 구현된 프로그램
    - ArithmeticException, ClassCastException, IndexOutOfException,<br> 
      NullPointerException (null값을 참조하는 경우, 발생하는 예외)
- complie exception : 반드시 예외 처리 해주어야 컴파일이 수행됨. <br>
예시) 사용자가 잘못된 값을 입력하면 예외 발생
- IOException(파일 입출력 오류), SQLException, InterruptedException