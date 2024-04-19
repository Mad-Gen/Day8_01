package animal;

/**
 * ライオンクラス
 */

// Cat クラスからその機能や特徴を継承する時には extends Cat と書きます。
// extends に続きに書けるのは 一つのクラスだけです。
public class Lion extends Cat {

  /**
   * コンストラクタ
   * @param name
   */
  public Lion(String name) {
    // Lion クラスのコンストラクタから Cat クラスのコンストラクタを呼び出して名前変数の設定をすることができます。
    super(name);
  }
  
  /**
   * 発話
   */
  @Override
  public void speak() {
    System.out.println("ガオー");
  }
  
  
  /**
   * 子クラスには秘密の処理
   * 親クラスと同じ名前のメソッドですが、全くの別物です。
   */
  private void secretToChild() {
    System.out.println("Lion : secretToChild");
  }

  /**
   * 子クラスには見せてあげる、オーバーライドさせてあげる処理
   */
  protected void secretToOthers() {
    System.out.println("Lion : secretToOthers");
  }

  /**
   * すべての人に公開し、子クラスからもオーバーライド可能な処理
   */
  public void openToOthers() {
    System.out.println("Lion : openToOthers");
  }

  ///**
  // * すべての人に公開されますが、子クラスは継承できません。
  // * コメント化を外すとエラーになります。
  // */
  //public final void openToOthersButNotInheritable() {
  //  System.out.println("ライオンクラス : openToOthersButNotInheritable");
  //}
  
  /**
   * スーパークラスのメソッドを呼び出すテストです。
   */
  public void superCallingTest() {
    //super.secretToChild(); // 親クラスで private 宣言されているため呼び出せません。
    super.secretToOthers();
    super.openToOthers();
    super.openToOthersButNotInheritable();
  }
  
  /**
   * このクラスのメソッドを呼び出すテストです。
   */
  public void thisCallingTest() {
    this.secretToChild(); // このクラスに private 宣言されたメソッドは呼び出せます。
    this.secretToOthers();
    this.openToOthers();
    this.openToOthersButNotInheritable();
  }
}
