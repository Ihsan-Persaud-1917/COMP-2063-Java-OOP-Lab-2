package tt.lab2;

public class Vehicle {
    private final double tankCapacity;
    private final String fuelType;

    public Vehicle(double tankCapacity, String fuelType) {
        this.tankCapacity = tankCapacity;
        this.fuelType = fuelType;
    }

    public double getTankCapacity()
    {
        return this.tankCapacity;
    }

    public String getFuelType()
    {
        return this.fuelType;
    }

    @Override
    public String toString()
    {
        return "Car[fuelType=" + this.getFuelType() + ", tankCapacity=" + this.getTankCapacity() + "]";
    }
}
