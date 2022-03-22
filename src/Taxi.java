public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String license, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(license, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    @Override
    public void printInfo()
    {
       super.printInfo();
       System.out.println("Total fare collected: " + fareCollected);
    }

    public double getFareCollected()
    {
        return fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider)
    {
        fareCollected += farePerRider * (getPassengers() - 1);
        boolean droppedOff = dropOffPassengers(getPassengers() - 1);
        return droppedOff;
    }

}
