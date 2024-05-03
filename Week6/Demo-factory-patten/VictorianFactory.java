
public class VictorianFactory implements FurnitureFactory{

  @Override
  public Chair createChair(){
    System.out.println("i have victor chair");
    return new VictorianChair();
  }
  @Override
  public Sofa createSofa(){
    System.out.println("i have victor sofa");
    return new VictorianSofa();
  }
}
