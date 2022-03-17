public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String license, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(license, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric? " + isElectric() + "\nDiscount applied? " + isDiscountApplied() + "\nTotal fare collected: " + fareCollected);
    }

    public double getFareCollected()
    {
        return fareCollected;
    }


}
