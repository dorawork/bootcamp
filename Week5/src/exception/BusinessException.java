package exception;

public class BusinessException extends Exception {

  private int code;

  private BusinessException(Syscode syscode) { //封裝 ENUM
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }

  public static BusinessException of(Syscode syscode) {//封裝 constructor
    if (syscode == null)
      throw new IllegalArgumentException();
    return new BusinessException(syscode);
  }

  public static void main(String[] args) throws BusinessException {
    Exception e = new Exception("Login Fail!");

    // Objective: 1000 -> Login Fail
    // 1001 -> Password Wrong
    // 1002 -> user id not found
    BusinessException be = new BusinessException(null);  //只可以這class

    // be is a throwable
    throw be;

  }
}
