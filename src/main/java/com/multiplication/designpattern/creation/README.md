# 생성 패턴

> 객체를 생성 또는 합성하는 방법이나 객체의 표현 방법과 시스템을 분리한다.

생성 패턴을 이용하면

1. *무엇*이 생성되고,
2. *누가* 이것을 생성하며,
3. 이것이 *어떻게* 생성되는지,
4. *언제* 생성할 것인지

에 대한 유연성을 확보할 수 있다.

## 추상 팩토리 (Abstract Factory)

> 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공한다.

## 빌더 (Builder)

> 복잡한 객체를 생성하는 방법과 표현하는 방법을 정의하는 클래스를 별도로 분리하여, 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공한다.

## 팩토리 메소드 (Factory Method)

> 객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할 지에 대한 결정은 서브클래스에게 내리도록 한다.

## 프로토타입 (Prototype)

> 생성할 객체들의 타입이 프로토타입인 인스턴스로부터 결정되도록 하며, 인스턴스는 새 객체를 만들기 위해 자신을 복제(clone)하게 된다.

## 싱글톤 (Singleton)

> 오직 한 개의 클래스 인스턴스만을 갖도록 보장하고, 이에 대한 전역적인 접근점을 제공한다.

### 팩토리 메소드와 추상 팩토리의 차이점

*추상 팩토리는 팩토리 메소드를 이용하여 구현할 수 있다.*

#### 공통점

1. `Factory(Creator)` 클래스를 사용하여 `Product` 객체를 생성. 

#### 차이점

객체의 생성

- 팩토리 메소드는 하나의 `Factory` 를 통해 한 종류의 `Product` 객체 1 개가 생성.
- 추상 팩토리는 하나(상위)의 `Factory` 를 통해 연관된 여러 종류의 `Factory` 로 연관된 `Product` 객체들이 생성. 

객체의 생성 인자

- 팩토리 메소드는 `Factory` 는 구현 방법에 따라 `Product` 생성.
   - `Factory` 가 추상 클래스인 경우 상속받은 구현 클래스가 `Product` 를 결정한다.
   - `Factory` 가 구현 클래스인 경우 인자 값으로 `Product` 를 결정한다.
- 추상 팩토리는 상위 `Factory` 는 `ConcreteFactory` 인자로 받아 연관된 `ConcreteProduct` 가 생성.

결합도

- 팩토리 메소드는 클라이언트와 `ConcreteProduct` 와의 결합도를 낮추어준다.
- 추상 팩토리는 클라이언트와 `ConcreteFactory` 와의 결합도를 낮추어준다.
