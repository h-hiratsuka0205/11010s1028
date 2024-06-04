/**
プログラミング基礎Java
制御構文
練習問題5
「break文」のソースコードを以下に変更してください。
    5 ~ 9

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_05_Q5.java
Starting audit...
Audit done.
>>> javac SO202_05_Q5.java
================

実行例
================
>>> java SO202_05_Q5
5
================

*/


// ここより下に解答を記載する。
public class SO202_05_Q5 {
  public static void main(String[] args) {

    for (int i = 5; i < 10; i++) {
      if (i % 2 == 0) {
        break;
      }
      System.out.printf("%d\n", i);
    }
  }
}
