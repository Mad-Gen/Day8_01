package animal;

/**
 * ネコ
 * 基本クラス
 */
public class Cat {

  public enum SEX{
    MALE, FEMALE, UNDEFINED
  }

  //
  private String name = null;
  private SEX sex = SEX.UNDEFINED;
  
  /**
   * コンストラクタ
   * @param _name
   */
  public Cat(String _name) {
    this.name = _name;
  }
  
  /**
   * 名前を取得
   * @return
   */
  public String getName() {
    return name;
  }
  
  /**
   * 性別をセット
   * @param _sex
   */
  public void setSex(SEX _sex) {
    this.sex = _sex;
  }
  
  /**
   * 性別を取得
   * @return
   */
  public SEX getSex() {
    return sex;
  }
  
  /**
   * 発話
   */
  public void speak() {
    System.out.println("うな～");
  }
  
  
  /**
   * 子クラスには秘密の処理
   */
  private void secretToChild() {
    System.out.println("Cat (private secretToChild) : 子クラスには秘密です。");
  }
  
  /**
   * 同一パッケージのクラスからは見える。
   */
  void openToOtherPackages() {
    System.out.println("Cat (openToOtherPackages) : 同一パッケージの他のクラスからは見えます。");
  }
  
  
  /**
   * 他のパッケージのクラスからは見えないが、継承したクラスであれば見える。
   */
  protected void secretToOtherPackagesButInheritance() {
    // 個人的には protected は子クラスで継承される可能性がある(継承してほしい)メソッドや変数に対してつけることが多いです。
    // 継承を使ってオーバーライドしたいメソッドや変数には protected を付けておけばまず大丈夫だと思います。。
    
    System.out.println("Cat (protected secretToOtherPackagesButInheritance) : 他のパッケージでも継承したクラスからであれば見えます。");
  }
  
  /**
   * すべての人に公開し、子クラスからもオーバーライド可能な処理
   */
  public int openToOthers(int value, String str) {
    System.out.println("Cat (public openToOthers): すべての人に公開し、子クラスからも継承できます。");
    
    return 0;
  }
  
  /**
   * すべての人に公開されますが、子クラスは継承できません。
   * final を付けることでメソッドの継承ができなくなります。
   */
  public final void openToOthersButNotInheritable() {
    System.out.println("Cat (public final openToOthersButNotInheritable): すべての人に公開しますが、子クラスは継承できません。");
  }
}
