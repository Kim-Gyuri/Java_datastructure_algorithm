# :pushpin: 자바로 푸는 자료구조 알고리즘 풀이
### 1. [LinkedList]() 

+ Linked List 개념정리<br/>
  + (https://thumper.tistory.com/18) 참고 <br/>


+ 단방향 LinkedList를 node라는 클래스로 구현해보자.<br/>
  + [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/master/src/setup/Main.java) 참고 <br/>

+ 'Node' 클래스를 감싸는 'LinkedList'클래스를 구현해보자.<br/>
  + [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/master/src/setup2/Main.java) 참고 <br/>

+ 정렬되지 않은 LinkedList의 중복값을 제거하기 (조건, 별도의 버퍼 사용없이).<br/>
  + [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/master/src/setup3/Main.java) 참고 <br/>

+ 단방향 LinkedLst의 끝에서 k번째 노드를 찾는 알고리즘
  + 첫 번째 방법: 처음 노트부터 한 개씩 이동하면서 전체노드 개수가 몇 개인지 센다.
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/master/src/setup4/Main.java) <br/> 
  + 두 번째 방법: 재귀호출(끝까지 들어갔다가 나올 때, k값과 비교하면서 몇 번째 노드인지 알아본다.)
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/master/src/setup5/Main.java) <br/>
  + 세 번째 방법: 2번째 풀이를 수정한다, (--> 2번째 풀이의 한계: 노드 반환을 못함)
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/ab4bae8824/src/setup6/Main.java) <br/>
  + 네 번째 방법: 공간을 전혀 사용 안하고, 포인터 2개를 선언하여 해결한다. (--> 정석적인 방법은 아님)
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/997948f1fa2134d5a2ab0d63f0103c43bca5aa0f/src/setup7/Main.java) <br/>
+ 단방향 LinkedList 중간노드 삭제하기 <br> (조건: 첫 번째 노드가 어딨는지 모르고, 오직 삭제할 노드만 갖고 있다.)
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/997948f1fa/src/setup8/Main.java) <br/>
+ LinkedList 알고리즘의 디지털합산, (재귀호출, carry)
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/997948f1fa/src/setup9/Main.java) <br/>
+  LinkedList에 있는 노드들은 x값을 기준으로 값이 작은 것들은 왼쪽, 큰 것을 오른쪽으로 나눈다. (조건: 단 x는 오른쪽 파트 어디에 놔도 상관없다.)
--> 첫 번째 풀이방법 : 두 줄로 세우기(포인터가 4개인 경우)
     [코드](https://github.com/Kim-Gyuri/Java_datastructure_algorithm/blob/997948f1fa/src/setup10/Main.java) <br/>
  
  


