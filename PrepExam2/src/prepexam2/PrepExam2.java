
package prepexam2;

class Factory{
    Car[] car;
    
    Factory(Car[] cars){
    this.car=cars;
    }
    
    public void printAllCarsInfo(){
        for(Car cars : car){
            System.out.println(cars.print());
        }
    }
}

class Car{
    private String brand;
    private int maxSpeed;
    private int year;
    
    public Car(String brand, int maxSpeed,int year){
    setBrand(brand);
    setMaxSpeed(maxSpeed);
    setYear(year);
    
    }
    
    public Car(String brand,int year){
        this(brand,180,2022);
    }
    
    public Car(int year){
        this("BMW",180,year);
    }
    
    
    private void setBrand(String brand){
        this.brand=brand;
    }  
    private  void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    } 
    private void setYear(int year){
        if(year>2023)
            throw new IllegalArgumentException("Year can't be bigger than 2023");
        this.year=year;
    }
    
    public String print(){
        return String.format("BRAND: %s  Year: %d  SPEED: %d",
                this.brand,this.year,this.maxSpeed);
    }
}

public class PrepExam2 {

    
    public static void main(String[] args) {
    try{
        Car[] cars=new Car[]{
        new Car(2022),
        new Car("Tesla",2026),
        new Car("Mercedes",299,2012)
        };
        Factory factory = new Factory(cars);
        factory.printAllCarsInfo();
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
