import java.util.Arrays;

public class Car {
    private int fuelLevel;
    private String make;
    private String model;
    private int year;
    private int price;
    private String[] parts;


    /**
     * Constructor with full parameter
     * @param fuelLevel
     */
    public Car(int fuelLevel, String make, String model, int year, int price, String[] parts){
        this.fuelLevel = fuelLevel;
        this.make = make;
        this.model=model;
        this.price=price;
        this.year= year;
        this.parts=Arrays.copyOf(parts, parts.length);
    }

    /**
     * Constructor for copy constructor;
     * @param sourceCar
     */
    public Car(Car sourceCar){
        this.fuelLevel = sourceCar.fuelLevel;
        this.make=sourceCar.make;
        this.model=sourceCar.model;
        this.price=sourceCar.price;
        this.year=sourceCar.year;
        this.parts=Arrays.copyOf(sourceCar.parts, sourceCar.parts.length);

    }

    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    /**
     * Getter method for fuel level
     * @return
     */
    public int getFuelLevel(){
        return this.fuelLevel;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getPrice(){
        return price;
    }

    /**
     * setter method for fuel level
     * @param fuelLevel
     */
    public void setFuelLevel(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    public void setParts( String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPrice(int price){
        this.price = price;
    }


    public void drive(){
        System.out.println("\n You brought the car in the year: "+ year+ " for the price of : " + price+" and the model is : "+  model+" "+ make);
    }
}


