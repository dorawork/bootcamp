package Week5.src.Demogentics;

public class SuperLong extends Number implements Swim {
  
  @Override
  public double doubleValue(){
    return (double)super.shortValue();
  }
  @Override
  public int intValue() {
    return super.shortValue();
  }

  @Override
  public float floatValue() {
    return super.shortValue();
  }

  @Override
  public long longValue() {
    return super.shortValue();
  }

  @Override
  public void siwm() {
    System.out.println("I'm swimming ...");
  }
}