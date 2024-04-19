package exsample;

import animal.Cat;
import animal.Lion;
import animal.Tiger;

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
    
    //
    System.out.println();
    
    // private protected public ... などのメソッドの動作を確認します。
    System.out.println("Lion クラスから super を使ってメソッドを呼び出します。");
    lion.superCallingTest();
    System.out.println();
    //
    System.out.println("Lion クラスから this を使ってメソッドを呼び出します。");
    lion.thisCallingTest();
    System.out.println();
    
    
    
    // ■ すべてのクラスは暗黙の内に Object クラスを継承している!!
    //
    // Tiger クラスの中身は空っぽなのに... 
    Tiger tiger1 = new Tiger();
    Tiger tiger2 = new Tiger();
    
    // 次のようにできます。
    System.out.println("tiger1 = " + tiger1.toString());
    if(tiger1.equals(tiger2)) {
      System.out.println("tiger1 と tiger2 は同じです。");
    }else{
      System.out.println("tiger1 と tiger2 は違います。");
    }
    System.out.println();
    
    // 実はすべてのクラスは暗黙の内に Object クラスを継承しているのでこのようにできます。
    Object obj1 = new Object();
    Object obj2 = new Object();
    System.out.println("obj1 = " + obj1);
    if(obj1.equals(obj2)) {
      System.out.println("obj1 と obj2 は同じです。");
    }else{
      System.out.println("obj1 と obj2 は違います。");
    }
    System.out.println();
    
    // 意識しませんでしたが...
    // toString(), equals() は Object クラスのメソッドを使用したり、オーバーライドしていたことになります。
    
    
  }
}
