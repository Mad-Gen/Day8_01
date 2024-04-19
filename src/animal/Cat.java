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
}
