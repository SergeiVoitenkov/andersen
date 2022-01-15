package task03.dashkov.creational.abstractFactoryBuilderPrototype;

import task03.dashkov.creational.abstractFactoryBuilderPrototype.brandType.*;
import task03.dashkov.creational.abstractFactoryBuilderPrototype.transmissionType.*;

public class CarDesign implements Cloneable {

    String name;
    int yearOfProduction;
    int price;
    Production production;
    Transmission transmission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "CarDesign{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", production=" + production +
                ", transmission=" + transmission +
                '}';
    }

    public Production getCarBrand(CarBrand type) {
        Production carType = null;
        switch (type) {
            case Volvo:
                carType = new Volvo();
                break;
            case Volkswagen:
                carType = new Volkswagen();
                break;
            default:
                throw new IllegalArgumentException("Wrong brand type:" + type);
        }
        return carType;
    }

    public Transmission getCarTransmission(CarTransmission type) {
        Transmission transmissionType = null;
        switch (type) {
            case FourWheelDrive:
                transmissionType = new FourWheelDrive();
                break;
            case FrontWheelDrive:
                transmissionType = new FrontWheelDrive();
                break;
            case RearDrive:
                transmissionType = new RearDrive();
                break;
            default:
                throw new IllegalArgumentException("Wrong transmission type:" + type);
        }
        return transmissionType;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }

}
