public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Electric? " + isElectric());
    System.out.println("Discount applied? " + discountApplied);
  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut)
  {
    int current = getPassengers();
    if (numOut < current)
    {
      setPassengers(current - numOut);
      return true;
    }
    else
    {
      return false;
    }
  }

  public void applyDiscount()
  {
    if (discountApplied == false)
    {
      if (electric)
      {
        double toll = getTollFee();
        setTollFee(toll * .5);
      }
    }
  }

  @Override
  public double calculateTollPrice()
  {
    if (getPassengers() >= 4)
    {
      return getTollFee() * 4;
    }
    else
    {
      return super.calculateTollPrice();
    }
  }
}