# 알고리즘 풀기
자바로 푸는 대회 알고리즘 풀이정리 아카이브입니다.

# &#128203; 목차
[1. 완전탐색](#1-완전탐색)<br>


## 1. 완전탐색
### 일곱 난쟁이 [백준 2309번]
    - 2중 for문으로 모든 경우를 탐색한다.
-------------------
### 분해합 [백준 2231번]
    - N의 최댓값인 백만 이하의 모든 수를 다 시도해보고 가장 최초로 분해합이 N이 등장했을 때 멈춘다.
-------------------
### 사탕 게임 [백준 3085번]
    - 지도가 최대 50x50칸
    - 인접한 칸끼리 바꿀 수 있다.
    -  모든 경우를 시도해보고, 그때마다 2중 for문으로 최대 사탕개수를 구한다.
-------------------    
### 유레카 이론 [10448번]
    - 1000 이하의 값을 가지는 삼각수를 모두 구한다.
    - 3중 for문을 돌려서 하나라도 합이 K가 되는 경우가 있는지 다 찾아본다.
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int countarr[];
    static int result[];
    public static void main(String[] args) throws IOException {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int count = Integer.parseInt(st.nextToken());

        countarr = new int[count];
        result = new int[count];

        for (int i=0; i<count; i++) {
            st = new StringTokenizer(in.readLine());
            countarr[i] = Integer.parseInt(st.nextToken());

        }

        int math[] = new int[44];

        for (int i=1; i<44; i++) {
            math[i] = (i*(i+1))/2;
        }

        for (int i=1; i<44; i++) {
            for (int j=1; j<44; j++) {
                for (int k=1; k<44; k++) {
                    int sum = 0;
                    sum += math[i] + math[j] + math[k];
                    matching(sum);
                }
            }
        }
        for (int i=0; i<countarr.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void matching(int sum) {
        for (int i=0; i<countarr.length; i++) {
            if (result[i] != 1) {
                if (countarr[i] == sum) {
                    result[i] = 1;
                } else  {
                    result[i] = 0;
                }
            }
        }
    }
}
```

#### 조건: K (3 ≤ K ≤ 1,000) <br>
자연수 합이 1000을 넘지 않으므로 n*(n+1)/2 = 1000이 되는 만큼의 삼각수를 구하면 된다. <br> n = 45 
<br> 삼각수를 구해서 배열에 넣어둔 다음 for문을 이용해서 입력한 값이 합이 되는 삼각수를 만나면 1을 리턴하고 아니면 0을 리턴하면 된다. <br><br>

#### 또 다른 방법
직관적인 사고로 푸는 풀이느낌, 짧은 코드길이가 특징이다.
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] triNum = new int[45];
        for (int i=1; i<45; i++) {
            triNum[i] = i * (i+1)/2;
        }
        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());
            int result =  eureka(n, triNum);
            System.out.println(result);
        }
    }

    public static int eureka(int N, int[] triNum) {
        for (int j=1; j<45; j++) {
            for (int k=1; k<45; k++) {
                for (int z=1; z<45; z++) {
                    int sum = triNum[j] + triNum[k] + triNum[z];
                    if (sum == N) {
                        return 1;
                    }
                }
            }
        }
        return  0;
    }
}
```
-------------------
### 숫자 야구 [백준 2503번]
    - 111~999까지의 모든 값에 대응하는 배열을 만듭니다.
    - 질문 하나하나마다, 이 질문과 답으로는 절대 나올 수 없는 수들을 지워 나간다.
-------------------    
### 체스판 다시 칠하기 [백준 1018번]
    - 주어지는 판의 크기가 커봐야 50x50이고, 체스판 크기는 8x8
    - 모든 위치를 다 잘라내 보고 그 중 등장하는 최소 수정 횟수를 취하면 된다.
    - 이때 주의점, 체스판을 90도 회전시키면 흑백이 반전될 수 있다.
    - 따라서 수정 횟수 X를 구했을 때 X와 64-X 중 최솟값이 답이 될 수 있습니다.
-------------------    
### 부분집합의 합 [백준 1182번]
    - N이 최대 20이므로 2^20 = 약 백만 번의 경우의 수를 다 시도한다.
    - 지금까지의 문제와는 달리 각 원소를 포함시킬지 말지를 다 시도해 봐야 하는데 이때는 DFS, 재귀 호출 등으로 짜는 것이 효율적이다.
    
------    
1463 풀이
2×n 타일링 https://odysseyj.tistory.com/20

2193

11726, 11727
https://velog.io/@kimmjieun/%EB%B0%B1%EC%A4%80-11726%EB%B2%88-2xn-%ED%83%80%EC%9D%BC%EB%A7%81-Java-%EC%9E%90%EB%B0%94

    
