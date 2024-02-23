
public class InterfaceInheritance {
    static interface VehicleCategory {
        void getType();
    }

    static interface Engine extends VehicleCategory {
        void getEngine();
    }

    static interface EngineOilType extends Engine {
        void getOilType();
    }

    public static class Vehicle implements EngineOilType {
        String VehicleType = new String();
        double EngineCC;
        String OilType = new String();

        public void getType() {
            System.out.println("The Vehicle is of type: " + VehicleType);
        }

        public void setVehicleType(String vehicleType) {
            VehicleType = vehicleType;
        }

        public void getEngine() {
            System.out.println("Has an Engine Capacity of: " + EngineCC);
        }

        public void setEngineCC(double engineCC) {
            EngineCC = engineCC;
        }

        public void getOilType() {
            System.out.println("Has Oil Type: " + OilType);
        }

        public void setOilType(String oilType) {
            OilType = oilType;
        }

        public void display() {
            getType();
            getEngine();
            getOilType();
        }

    }

    public static void main(String[] args) {
        Vehicle Car = new Vehicle();
        Car.setVehicleType("Sports Sedan");
        Car.setEngineCC(693.33);
        Car.setOilType("Synthetic Oil");
        Car.display();
    }

}
