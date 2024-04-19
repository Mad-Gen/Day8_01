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
    System.out.println("Cat : 子クラスには秘密です。");
  }
  
  /**
   * 子クラスには見せてあげる、オーバーライドさせてあげる処理
   */
  protected void secretToOthers() {
    System.out.println("Cat : 子クラスからも見えるし、継承できます。");
  }
  
  /**
   * すべての人に公開し、子クラスからもオーバーライド可能な処理
   */
  public void openToOthers() {
    System.out.println("Cat : すべての人に公開し、子クラスからも継承できます。");
  }
  
  /**
   * すべての人に公開されますが、子クラスは継承できません。
   */
  public final void openToOthersButNotInheritable() {
    System.out.println("Cat : すべての人に公開しますが、子クラスは継承できません。");
  }
}
