  背 確認兩個一唔一樣

  @Override // 
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof MacbookAir))
      return false;
    MacbookAir ma = (MacbookAir) obj;

     return Objects.equals(this.inch, ma.getInch())
        && Objects.equals(this.cpu, ma.getCPU())
        && Objects.equals(this.ram, ma.getRam())
        && Objects.equals(this.disk, ma.getDisk())
        && Objects.equals(this.color, ma.getColor());
  }


  @Override
  public int hashCode() { 
    return Objects.hash(this.inch, this.cpu, this.ram, this.disk, this.color);
  }
--------------------------------------------------------------
    @Override //
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof *College*))
      return false;
    *College* c = (College) obj;
    return Objects.equals(this.area, c.getArea());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.area);
  }
  @Override
  public String toString(){
    return "College("
    +"area= " + area //
    + ")"; 
  }

