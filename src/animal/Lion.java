package animal;

/**
 * ライオンクラス
 */
public class Lion extends Cat {

  /**
   * コンストラクタ
   * @param name
   */
  public Lion(String name) {
    super(name);
  }
  
  /**
   * 発話
   */
  @Override
  public void speak() {
    System.out.println("ガオー");
  }
}
