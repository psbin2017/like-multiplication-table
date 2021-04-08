# 스택 (Stack)

> Last In First Out (마지막에 들어온 값이 먼저 나간다.)

## 구현

주요 메소드

1. `push(T item)`: 아이템 추가
2. `T pop()`: 아이템 삭제
3. `T peek()`: 아이템 확인
4. `boolean isEmpty()`: 비어있는지 확인

## 포인트

- top 변수로 모든게 관리됨.

## 예시

```text
// 최초 큐
┌─ top ───┐
│  Node1  │
└─────────┘

// Node2 추가
┌─ top ───┐
│  Node1  │
│  Node2  │
└─────────┘
- Node1.next = Node2

// Node3 추가
┌─ top ───┐
│  Node1  │
│  Node2  │
│  Node3  │
└─────────┘
- Node2.next = Node3

// 꺼내기 remove()
┌─ top ───┐
│  Node2  │
│  Node3  │
└─────────┘

// 확인하기 peek()
┌─ top ───┐
│  Node2  │
│  Node3  │
└─────────┘ 
```
