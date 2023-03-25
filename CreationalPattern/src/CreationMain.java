import factory.*;
public class CreationMain {

    public static void main(String[] args){
        VehicleFactory instance = VehicleFactory.getInstance();

        Factory car = instance.getFactory( new CarFactoryMaker("Tesla"));
        Factory car2 = instance.getFactory(new CarFactoryMaker("Honda"));
        Factory car3 = instance.getFactory(new CarFactoryMaker("Porsche"));

        Factory airplane = instance.getFactory(new CarFactoryMaker("Airbus"));
        Factory airplane2 = instance.getFactory(new CarFactoryMaker("Boeing"));
        Factory airplane3 = instance.getFactory(new CarFactoryMaker("Embraer"));

        Factory boat = instance.getFactory(new BoatFactoryMaker("SeaRay"));
        Factory boat2 = instance.getFactory(new BoatFactoryMaker("Mastercraft"));
        Factory boat3 = instance.getFactory(new BoatFactoryMaker("Bertram"));

        Factory car4 = instance.getFactory( new CarFactoryMaker("Tesla"));
        Factory airplane4 = instance.getFactory(new CarFactoryMaker("Airbus"));

        System.out.println(car.build());
        System.out.println(car.restore());
        System.out.println(car.repair());
        System.out.println(car2.build());
        System.out.println(car2.restore());
        System.out.println(car2.repair());
        System.out.println(car3.build());
        System.out.println(car3.restore());
        System.out.println(car3.repair());

        System.out.println(airplane.build());
        System.out.println(airplane.restore());
        System.out.println(airplane.repair());
        System.out.println(airplane2.build());
        System.out.println(airplane2.restore());
        System.out.println(airplane2.repair());
        System.out.println(airplane3.build());
        System.out.println(airplane3.restore());
        System.out.println(airplane3.repair());

        System.out.println(boat.build());
        System.out.println(boat.restore());
        System.out.println(boat.repair());
        System.out.println(boat2.build());
        System.out.println(boat2.restore());
        System.out.println(boat2.repair());
        System.out.println(boat3.build());
        System.out.println(boat3.restore());
        System.out.println(boat3.repair());



    }
}
