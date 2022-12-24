import java.sql.SQLOutput;
import java.time.LocalDate;

public class Car<T extends DriverCategoryB> extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {

    DriverCategoryB driver;

    public Car(String model, String subModel, double engineSize, T driver) {

        super(model, subModel, engineSize);
        this.driver = driver;
    }

    public DriverCategoryB getDriver() {
        return driver;
    }



    @Override
    public void pitStop() {

        System.out.println(model + " " + subModel + " ушёл на питстоп.");
        System.out.println();

    }

    @Override
    public void bestTime() {

        System.out.println("Лучшее время круга " + model + " " + subModel + " :" + ((Math.random()*((90-60)+1))+60));

    }

    @Override
    public void maxSpeedOnLap() {

        System.out.println("Наибольшая скорость " + model + " " + subModel + " на круге: " + ((Math.random()*((220-150)+1))+150));
    }


    @Override
    public void requestDriverAndCarInformation() {

        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " + model + " " + subModel + " и будет участвовать в заезде. " );

    }
}