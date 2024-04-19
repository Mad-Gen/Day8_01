package exsample;

import animal.Cat;
import animal.Lion;

/**
 * Main.java
 */
public class Main {

  /**
   * エントリーポイント
   * @param args
   */
  public static void main(String[] args) {
    
    // ■ Javaで「継承」をコーディングする方法
    //
    // まず最もシンプルなクラスで基本を確認しましょう。
    
    // 親クラス (基本クラス、スーパークラス)
    Cat cat = new Cat("スーパー☆猫ひろし"); // お名前お借りします。
    cat.setSex(Cat.SEX.MALE);
    
    // 子クラス (派生クラス、サブクラス)
    Lion lion = new Lion("サブ☆森本レオ"); // お名前お借りします。
    
    // ● 子クラスの特徴1 
    // 「子クラスに定義されていないメソッドが使える」
    // Lion クラスには setSex(), getSex()が定義されていませんが、親クラスである Cat クラスに定義されているので
    // そのデータや機能を呼び出すことができます。
    cat.setSex(Cat.SEX.FEMALE);
    System.out.println("Cat クラスの " + cat.getName() + " は　" + (cat.getSex() == Cat.SEX.MALE ? "オス" : "メス") + " です");
    
    // ● 子クラスの特徴2
    // 「親クラスのメソッドをオーバーライドして、動作をカスタマイズできます」
    // 親クラスである Cat はこのように表示されます。
    cat.speak();
    //
    // 子クラスである Lion で同じメソッドを呼び出すと...
    // オーバーライドによって、Cat.speak() の内容が書き換えられ、Lion クラス用に再定義(カスタマイズ)されています。
    lion.speak(); 
    
  }
}
