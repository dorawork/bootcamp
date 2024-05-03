
public class ModernFactory implements FurnitureFactory{

  @Override
  public Chair createChair(){
    System.out.println("i have modern chair");
    return new ModernChair();
  }
  @Override
  public Sofa createSofa(){
    System.out.println("i have modren sofa");
    return new ModernSofa();
  }
}
