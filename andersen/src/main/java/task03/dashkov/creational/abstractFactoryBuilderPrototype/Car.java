package task03.dashkov.creational.abstractFactoryBuilderPrototype;

public class Car extends CarDesign {

    public static class Builder{
        private Car newCar;

        public Builder(){
            newCar = new Car();
        }

        public Builder withName(String name){
            newCar.name = name;
            return this;
        }
        public  Builder withYearOfProduction(int year){
            newCar.yearOfProduction = year;
            return this;
        }
        public  Builder withPrice(int price){
            newCar.price = price;
            return this;
        }

        public  Builder withProduction(Production product){
            newCar.production= product;
            return this;
        }
        public  Builder withTransmissionType(Transmission transmission){
            newCar.transmission = transmission;
            return this;
        }
        public Car build(){
            return newCar;
        }
    }


}
