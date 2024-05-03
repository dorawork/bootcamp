
public interface FurnitureFactory {

Chair createChair();

Sofa createSofa();

public static FurnitureFactory create(Style style)throws Exception{
switch (style) {
  case MODERN:
    return new ModernFactory();
  case VICTORIAN:
    return new VictorianFactory();
}
throw new Exception ("unknown");
}
}

