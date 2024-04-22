package animal;

/**
 * ライオンクラス
 */

// Cat クラスからその機能や特徴を継承する時には extends Cat と書きます。
// extends に続きに書けるのは 一つのクラスだけです。
public class Lion extends Cat {
  
  private boolean tategami = true; // たてがみの情報

  /**
   * コンストラクタ
   * @param name
   */
  public Lion(String name) {
    // Lion クラスのコンストラクタから Cat クラスのコンストラクタを呼び出して名前変数の設定をする必要があります。
    super(name);
  }
  
  /**
   * 発話
   */
  @Override // 親クラスのメソッドを継承していることを示す「アノテーション」飛ばれるコードです。
  public void speak() {
    // Eclipseではオーバーライドされたメソッドを宣言している行に、緑色の△マーカーが付きます。
    System.out.println("ガオー");
  }
  
  /**
   * 立派なたてがみがあるかどうかを設定
   * @param value
   */
  public void setExistTategami(boolean value) {
    this.tategami = value;
  }
  
  /**
   * 立派なたてがみがあるかないかを取得
   * @return
   */
  public boolean isExistTategami() {
    return tategami;
  }
  
//  /**
//   * こんな書き方もできます。
//   */
//  @Override
//  public void hunting() {
//    groupHunting();
//  }
//  
//  /**
//   * 
//   */
//  private void groupHunting() {
//    // グループで狩りをする場合の処理
//  }
  
  /**
   * 子クラスで継承して、その動物にあった値を返します。
   * @return
   */
  protected boolean isLikeWater() {
    return false;
  }
  
  // ***********************************************************************
  // これより下はテスト用のコードです。
  // private protected [アクセス修飾子なし] public の動作はメソッドにつけた時も、変数につけた時も同じです。 
  // *********************************************************************** 
  
  /**
   * 子クラスには秘密の処理
   * 親クラスと同じ名前のメソッドですが、全くの別物です。
   */
  private void secretToChild() {
    System.out.println("Lion : secretToChild が呼び出された");
  }
  
  /**
   * 同じパッケージであれば公開してあげる、オーバーライド・継承も可能
   */
  @Override
  void openToOtherPackages() {
    System.out.println("Lion : openToOtherPackages が呼び出された");
  }

  /**
   * 同じパッケージであれば公開してあげる、なお他のパッケージでも継承している子クラスはアクセス可能
   */
  @Override
  protected void secretToOtherPackagesButInheritance() {
    System.out.println("Lion : secretToOtherPackagesButInheritance が呼び出された");
  }

  /**
   * すべての人に公開し、子クラスからもオーバーライド・継承可能
   */
  @Override
  public int openToOthers(int value, String str) {
    // 引数、戻り値のあるメソッドも継承可能です。
    // 継承するときは、引数、メソッド名、戻り値を変えずにメソッドを宣言します、
    
    System.out.println("Lion : openToOthers が呼び出された");    
    return 0;
  }

  ///**
  // * すべての人に公開されますが、子クラスは継承できません。
  // * コメント化を外すとエラーになります。
  // */
  //public final void openToOthersButNotInheritable() {
  //  System.out.println("Lion : openToOthersButNotInheritable");
  //}
  
  /**
   * スーパークラスのメソッドを呼び出すテストです。
   */
  public void superCallingTest() {
    //super.secretToChild(); // 親クラスで private 宣言されているため呼び出せません。
    super.openToOtherPackages();
    super.secretToOtherPackagesButInheritance();
    super.openToOthers(100, "Test");
    super.openToOthersButNotInheritable();
  }
  
  /**
   * このクラスのメソッドを呼び出すテストです。
   */
  public void thisCallingTest() {
    this.secretToChild(); // このクラスに private 宣言されたメソッドは呼び出せます。
    this.openToOtherPackages();
    this.secretToOtherPackagesButInheritance();
    this.openToOthers(100, "Test");
    this.openToOthersButNotInheritable();
  }
}
