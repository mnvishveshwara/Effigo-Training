public class DealerShip {
    private NewCar[] cars;

   
    public DealerShip(NewCar[] cars) {
        this.cars= new NewCar[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i]= new NewCar(cars[i]);   
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }

    public NewCar getCar(int index){

        NewCar copyCar= new NewCar(this.cars[index]);
        return copyCar;
    }


    public void setCar(int index, NewCar newcar){
        NewCar copyCar= new NewCar(newcar);
        this.cars[index]= copyCar;
    }

    public void sell(int index){
        this.cars[index].drive();
    }

}
