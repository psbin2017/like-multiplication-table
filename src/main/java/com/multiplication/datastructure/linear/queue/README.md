# 큐 (Queue)

> First In First Out (먼저 들어온 값이 먼저 나간다.)

## 구현

주요 메소드

1. `add(T item)`: 아이템 추가
2. `T remove()`: 아이템 삭제
3. `T peek()`: 아이템 확인
4. `boolean isEmpty()`: 비어있는지 확인

## 포인트

- 추가 될 때 변경점은 last 이다.
- 제거 될 때 변경점은 first 이다.

## 예시

```text
// 최초 큐
┌─ first ─┐ ┌─ last ──┐
│  Node1  │ │  Node1  │
└─────────┘ └─────────┘

// Node2 추가
┌─ first ─┐ ┌─ last ──┐
│  Node1  │ │  Node2  │
└─────────┘ └─────────┘
- Node1.next = Node2

// Node3 추가
┌─ first ─┐ ┌─ last ──┐
│  Node1  │ │  Node3  │
└─────────┘ └─────────┘
- Node2.next = Node3

// 꺼내기 remove()
┌─ first ─┐ ┌─ last ──┐
│  Node2  │ │  Node3  │
└─────────┘ └─────────┘

// 확인하기 peek()
┌─ first ─┐ ┌─ last ──┐
│  Node2  │ │  Node3  │
└─────────┘ └─────────┘ 
```