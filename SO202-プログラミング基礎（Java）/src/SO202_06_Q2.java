/**
プログラミング基礎Java
関数
練習問題2
練習問題1のソースコードに「引き算した結果を返す関数」を追加して、以下の結果を表示してください。
    7.8 - 3.4

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_06_Q2.java
Starting audit...
Audit done.
>>> javac SO202_06_Q2.java
================

実行例
================
>>> java SO202_06_Q2
4.400000
================

*/


// ここより下に解答を記載する。
public class SO202_06_Q2 {
  static double plus(double num1, double num2) {
    double x = num1 - num2;
    return x;
  }

  public static void main(String[] args) {
    double num = plus(7.8, 3.4);
    System.out.printf("%f\n", num);
  }
}
