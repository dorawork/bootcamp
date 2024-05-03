
public class Customer {
  public static void main(String[] args) throws Exception{

    FurnitureFactory factory = FurnitureFactory.create(Style.MODERN);

    Chair chair = factory.createChair();
    System.out.println(chair.hasLeg());

    Sofa sofa = factory.createSofa();
    System.out.println(sofa.isSingleSeat());
    
  }
}
