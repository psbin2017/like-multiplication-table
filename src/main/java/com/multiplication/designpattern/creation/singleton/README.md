# 싱글톤

> 오직 한 개의 클래스 인스턴스만을 갖도록 보장하고, 이에 대한 전역적인 접근점을 제공한다.

## 의도

오직 한 개의 클래스 인스턴스만을 갖도록 보장하고, 이에 대한 전역적인 접근점을 제공한다.

## 활용

- 클래스의 인스턴스가 오직 하나여야 함을 보장하고, 잘 정의된 접근점(access point)으로 모든 사용자가 접근할 수 있도록 해야 할 경우
- 유일한 인스턴스가 서브클래싱으로 확장되어야 하고, 사용자는 코드의 수정 없이 확장된 서브클래스의 인스턴스를 사용할 수 있어야 할 경우

## 참여자

- `Singleton`: Instance() 연산을 정의하여 유일한 인스턴스로 접근 할 수 있도록 한다.

## 결과

1. 유일한 인스턴스로의 접근을 통제한다.
2. 이름 공간(name space)을 좁힌다.
3. 연산 및 표현의 정제를 사용한다.
4. 인스턴스의 개수를 변경하기 자유롭다.
    - 인스턴스에 접근할 수 있는 허용 범위를 결정하는 연산만 변경해주면 된다.
    - 여러 개의 인스턴스를 생성해 각각의 인스턴스로 접근 할 수 있도록 연산의 구현을 바꾸면 된다.
5. 클래스 연산을 사용하는 것보다 유연하다.

## 구현

1. **인스턴스가 유일함을 보장해야한다.**
2. 싱글톤 클래스를 서브클래싱한다.
    - 서브 클래스를 만드는 것이 중요한 게 아니다. 새로운 서브클래스의 유일한 인스턴스를 만들어 사용자가 이를 사용할 수 있도록 하는 것이다.

## 연관 패턴

많은 패턴이 싱글톤 패턴이 될 수 있다. 추상 팩토리, 빌더, 프로토타입이 대상의 예이다.
