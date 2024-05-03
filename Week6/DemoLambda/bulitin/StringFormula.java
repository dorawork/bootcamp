package Week6.DemoLambda.bulitin;

  @FunctionalInterface
  public interface StringFormula {
    String uppercaseNreplace(String str, String from, String to);
  }