

public class BusinessException extends Exception {

  private int code;

  private BusinessException(Syscode syscode) { //封裝 ENUM Code Desc complie time 限制左人地放既type
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }

  public static BusinessException of(Syscode syscode) {//封裝 constructor#7 , 用static method
    if (syscode == null) //防守會唔會出現NULL
      throw new IllegalArgumentException();
    return new BusinessException(syscode);
  }

  public static void main(String[] args) throws BusinessException {
    Exception e = new Exception("Login Fail!");

    // Objective: 1000 -> Login Fail
    // 1001 -> Password Wrong
    // 1002 -> user id not found
    BusinessException be = new BusinessException(null);  //只可以這class #7 private左

    // be is a throwable
    throw be;

  }
}
