package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + "s starting engine.";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof ElectricCar) {
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric. Per charge: " + avgKmPerCharge + ", battery size: " + batterySize);
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLiter() + ", battery size: " + hybridCar.getBatterySize());
        } else if(carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("The car engine is starting with gas. Per charge: " +gasPoweredCar.getAverageKmPerLiter());
        } else {
            System.out.println("Invalid car name!");
        }
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving...";
    }




    //runEngine metodu drive metodunun içerisinden çağırılmalı.
    //CarSkeleton sınıfının 3 tane de subclass değeri tanımlanmalı. GasPoweredCar, ElectricCar,
    // HybridCar
    //GasPoweredCar iki sınıf değişkeni içerir. avgKmPerLitre: double ve cylinders: int bu iki
    // değişkeni de set edebileceği bir constructorı olmalıdır.
    //ElectricCar iki sınıf değişkeni içerir. avgKmPerCharge: double ve batterySize: int bu iki
    // değişkeni de set edebileceği bir constructorı olmalıdır.
    //HybridCar üç sınıf değişkeni içerir. avgKmPerLitre: double, batterySize: int, cylinders:
    // int bu üç değişkeni de set edebileceği bir constructorı olmalıdır.


    //Bu üç farklı sınıfta startEngine ve drive metodlarını engine(motor) tiplerine göre farklı
    // şekillerde çağırırlar.
    //Tüm dizaynı yapmak senin görevin. Alt sınıflar CarSkeleton içerisindeki bazı metodları ya da
    // hepsini Override etmeli mi ?
    //Bir adet Main sınıfı tanımlayınız ve tüm sınıfların objelerinden polymorphism kurallarına uyacak
    // şekilde birer instance oluşturunuz.
    //Her instance ile sınıfın davranışını test edin. Bir tane metodunuz sınıfın tipini ekrana basmalı.
}
