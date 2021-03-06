# 이진 탐색

- 전제 조건: 배열은 정렬되어 있어야한다.

## 연산

1. 배열의 중간 인덱스에 있는 값과 대상 값을 비교한다.
2. 일치하는 경우 인덱스를 반환한다
    1. 대상 값이 더 큰 경우 왼쪽 색인 범위를 좁힌다. (first = mid + 1)
    2. 대상 값이 더 작은 경우 오른쪽 색인 범위를 좁힌다. (last = mid - 1)
3. 왼쪽 색인이 더 커질 때 까지 반복한다.

## 시간 복잡도

데이터 수가 8 개이고 1 이 대상이라고 가정

```java
int[] arr = new int[]{1,2,3,4,5,6,7,8};
int target = 1;
```

```text
1회차
[1][2][3][4][5][6][7][8]

2회차
[1][2][3][4]

3회차
[1][2]

4회차
[1]
```

총 4 회 비교연산을 수행한다.

- n 이 1이 되기 까지 2로 나눈 횟수 k 회, 비교 연산 k 회 진행
- 마지막으로 1개 남았을 때, 비교연산 1 회 진행

최악의 경우는 `T(n) = k + 1`

n 이 1 이 되기까지 2로 나눈 횟수 k 번 ...

<pre>n * (1/2)<sup>k</sup> = 1</pre>

2 로 나눈 것과 1/2 를 곱하는 것은 같으며, 수식을 대입하면 식이 성립한다.

- n * 2<sup>-k</sup> = 1
- n = 2<sup>k</sup>

양변에 밑이 2인 로그를 취한다.

- log<sub>2</sub>n = log<sub>2</sub>2<sup>k</sup>
- log<sub>2</sub>n = k log<sub>2</sub>2
- log<sub>2</sub>n = k

따라서 최악의 경우는 

<pre>T(n) = log<sub>2</sub>n</pre> 

이다. 근데 마지막 연산에서 1 회 추가로 진행하였으니 정확히는 +1 을 증가해야하지만 중요하지 않다.

## 빅오 표기법

<pre>T(n) = log<sub>2</sub>n</pre>
