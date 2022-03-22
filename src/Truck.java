public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Number of axles: " + axles);
    System.out.println("Has trailer? " + hasTrailer);
  }

  public boolean validateLicensePlate()
  {
    boolean valid = false;
    String endTwo = getLicensePlate().substring(4);
    if ((endTwo.equals("MX") && axles > 4) || (endTwo.equals("LX") && axles <= 4))
    {
      valid = true;
    }
    if (hasTrailer == false)
    {
      valid = true;
    }
    return valid;
  }

  public double calculateTollPrice()
  {
    if (hasTrailer)
    {
      return (getTollFee() * axles) * 2;
    }
    else
    {
      return getTollFee() * axles;
    }
  }
}