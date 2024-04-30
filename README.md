# OO(Object-Oriented)의 핵심
- Inheritance(상속), Encapsulation(캡슐화), Polymorphism(다형성)
- 핵심이 아니라 OO(object-oriented)의 메커니즘
- IoC(Inversion of Control)를 통해 상위 레벨의 모듈을 하위레벨의 모듈로부터 보호하는 것
- OCP (Open – Close Principle : 개방 – 폐쇄 원칙)를 통해 새로운 요구사항을 반영할 수 있음
- OO design은 dependency management (의존성을 관리해주기 위한)

# SOLID 객체 지향 프로그래밍 원칙
1. 단일 책임 원칙(SRP : Single Responsibility Principle)
- 한 클래스는 하나의 책임만 가져야 한다.
- 예시 : 자전거 클래스는 주행 기능에만 집중해야 한다. (수리하는 기능을 넣을 수 없다.)
2. 개방-폐쇄 원칙(OCP : Open – Close Principle)
- 확장에는 열려 있고, 변경에는 닫혀 있어야 한다.
- 예시 : 새로운 동물을 추가할 때 동물원 시스템의 수정이 최소화되여야 한다.
3. 리스코프 치환 원칙 (LSP : Liskov Substitution Principle)
- 하위(자식) 클래스는 상위(부모) 클래스를 대체할 수 있어야 한다. 
- 예시 : 모든 동물은 Animal 클래스로 대체할 수 있어야 한다.
4. 인터페이스 분리 원칙 (ISP : Interface Segregation Principle) 
- 클라이언트가 사용하지 않는 메서드에 의존하지 않아야 한다.
- 범용의 인터페이스 하나 보다, 분리할 수 있는 여러 개의 인터페이스가 더 좋다.
- 예시 : 필요한 기능만 있는 인터페이스를 사용해야 한다.
5. 의존성 역전 원칙 (DIP : Dependency Inversion Principle)
- 추상화에 의존해야 하며, 구체화에 의존하지 않아야 한다.
- 예시 : 고수준의 모듈은 인터페이스에 의존하고, 저수준 모듈은 구체적인 구현에 의존해야 한다.
### 이러한 원칙들은 객체 지향 프로그래밍을 설계할 때 유용하며, 코드의 유지보수성과 확장성을 향상시킬 수 있다.
