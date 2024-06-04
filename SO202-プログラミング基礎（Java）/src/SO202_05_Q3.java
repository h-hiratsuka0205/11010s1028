/**
プログラミング基礎Java
制御構文
練習問題3
「for文」のソースコードを以下に変更してください。
    10～20を表示する

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_05_Q3.java
Starting audit...
Audit done.
>>> javac SO202_05_Q3.java
================

実行例
================
>>> java SO202_05_Q3
10
11
12
13
14
15
16
17
18
19
20
================

*/


// ここより下に解答を記載する。
public class SO202_05_Q3 {
  public static void main(String[] args) {

    for (int i = 10; i < 21; i++) {
      System.out.printf("%d\n", i);
    }
  }
}
