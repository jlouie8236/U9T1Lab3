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

  public void printCar()
  {
    System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric? " + electric + "\nDiscount applied? " + discountApplied);
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
}