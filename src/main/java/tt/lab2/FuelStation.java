package tt.lab2;

public class FuelStation {
    private final String fuelType;
    private double fuelVolume;
    private double fuelRate;
    private double fuelSales;


    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setFuelRate(double fuelRate){
        this.fuelRate = fuelRate;
    }

    public void setFuelSales(double fuelSales) {
        this.fuelSales = fuelSales;
    }

    public FuelStation(String fuelType, double fuelVolume, double fuelRate) {
        this.fuelType = fuelType;
        this.setFuelVolume(fuelVolume);
        this.setFuelRate(fuelRate);
        this.fuelSales = 0.0;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public double getFuelVolume() {
        return this.fuelVolume;
    }

    public double getFuelRate() {
        return this.fuelRate;
    }

    public double getFuelSales() {
        return this.fuelSales;
    }

    @Override
    public String toString() {
        return "FuelStation[fuelType=" + this.getFuelType() + ", fuelVolume=" + this.getFuelVolume() + ", fuelRate=" + this.getFuelRate() + ", fuelSales=" + this.getFuelSales() + "]";
    }

    public boolean canDispenseFuelType(Vehicle v) {
        return v.getFuelType().equals(this.getFuelType());
    }

    // Return 0 if the fuel types don't match
    // Calculate the amount to dispense (minimum of tankCapacity and fuelVolume)
    // Reduce fuelVolume by the amount dispensed
    // Add to fuelSales (amount * fuelRate)
    // Return the amount dispensed

    public double dispense(Vehicle v){
        if (!this.canDispenseFuelType(v))
                return 0.0;

        double amount_dispensed = Math.min(this.getFuelVolume(),v.getTankCapacity());

        this.setFuelVolume(this.getFuelVolume() - amount_dispensed);

        double Sales = this.getFuelRate() * amount_dispensed;
        this.setFuelSales(this.getFuelSales() + Sales);

        return amount_dispensed;
    }
}
