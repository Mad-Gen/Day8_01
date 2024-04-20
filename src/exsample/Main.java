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
    
    // これまでに色々な動物のクラスを使ってきました。
    // 例えば...
    // Lion.java, Tiger.java,　Cheetah.java etc...
    
    // このようなネコ科の動物の動物クラスをいくつも手軽に作りたいとき、最初に思いつくのは「コピー&ペースト」です。
    // コピペを使えば100でも200でも動物クラスを作れます。
    //
    // ただしコピー & ペースト でコーディングすると問題があります。例えば...
    //
    //    1. コピー元にバグがあった時、コピーしたすべてのクラスの修正をしなければいけなくなる
    //    2. 動物クラスに、同じ機能を新しく追加したいとき、すべてのクラスにコードを追加しなければいけない。
    //
    // などです。
    //
    // 「継承」の機能を使えば、このような問題を解決できる場合があります。
    // コピー元を親クラス、コピーしたクラスを子クラスに置き換えると...
    // 
    //    1. 親クラスに問題があっても親クラスだけを修正すればよい。
    //    2. 親クラスに新しい機能を追加すれば、すべての子クラスでその機能が使えるようになる。
    //
    // などメリットが生まれます。
    
    // では早速Javaでどのように書けばよいかを確認しましょう。
    
    
    // ■ Javaで「継承」を行うための具体的な方法
    // まず最もシンプルなクラスで基本を確認しましょう。
    
    // 親クラス (基本クラス、スーパークラス)
    Cat cat = new Cat("スーパー☆猫ひろし"); // お名前お借りします。
    cat.setSex(Cat.SEX.MALE); // 性別はネコ科の動物（ネコを抽象化した概念）が持っているものなので、基本クラスに定義しました。
    
    // 子クラス (派生クラス、サブクラス)
    Lion lion = new Lion("サブ☆森本レオ"); // お名前お借りします。
    
    
    
    // ■■■■　絶対に覚えておく : 「継承すると子クラスに定義されていないメソッドが使える」 ■■■■
    // Lion クラスには setSex(), getSex()が定義されていませんが、親クラスである Cat クラスに定義されているので
    // そのデータ(変数)や機能(メソッド)を呼び出すことができます。
    lion.setSex(Cat.SEX.FEMALE);
    System.out.println("Lion クラスの " + cat.getName() + " は　" + (cat.getSex() == Cat.SEX.MALE ? "オス" : "メス") + " です");
    
    
    
    // ■■■■　絶対に覚えておく : 「親クラスのメソッドをオーバーライドして、動作をカスタマイズできます」 ■■■■
    // 親クラスである Cat はこのように表示されます。
    cat.speak();
    //
    // 子クラスである Lion で同じメソッドを呼び出すと...
    // オーバーライドによって、Cat.speak() の内容が書き換えられ、Lion クラス用に再定義(カスタマイズ)されています。
    lion.speak();  
    
    //
    System.out.println();
    
    
    
    // private protected public ... などのメソッドの動作を確認します。
    System.out.println("Lion クラスから super を使ってメソッドを呼び出します(super は親クラスの変数やメソッドを呼び出すのに使います。)。");
    lion.superCallingTest();
    System.out.println();
    //
    System.out.println("Lion クラスから this を使ってメソッドを呼び出します。");
    lion.thisCallingTest();
    System.out.println();
    
    // *****************************************
    // ★演習
    // Mini  : Cat.java が Animal.java を継承するように変更してみましょう。
    // Full1 : Cat.java から　Animal.java に移したほうがよい変数とメソッドは何か、それはなぜかを考えましょう。グループごとにアイデアをSlackへポストしてください。
    //       : 変数と実際にAnimal.javaに移動させてみましょう。
    // Full2 : 他にも Animal.java にメソッド定義があって、その継承クラスでそのメソッドをオーバーライドしてカスタマイズするとよさそうなふるまいがあるでしょうか。
    //       : グループごとにアイデアを上げたら実際にコーディングしてみましょう。コーディングの際はコンソールにそのふるまい文章で出力するだけでよいです。
    //       : そのメソッドをCat.javaでオーバーライドして、Animal.java　と Cat.java をSlackへポストしてください。
    //       : グループディスカッション後に、わかりやすいサンプルになりそうなコードをいくつかみんなでレビューしてみましょう。
    //       : Hint >> ほとんどすべての動物は「動く」という機能や「食べる」などの機能を持っていますね。でもその動き方や、食べ方はみんな違います。
    // *****************************************
    
    
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
