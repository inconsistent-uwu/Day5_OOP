
public class VehicleEngine {

    public interface Engine {
        void EngineDisplacement(double cc);

        void EngineHorsePower(double hp);

        void EngineTorque(double torq);
    }

    public static class Vehicle implements Engine {
        double Displacement;
        double HorsePower;
        double Torque;

        public double getDisplacement() {
            return Displacement;
        }

        public double getHorsePower() {
            return HorsePower;
        }

        public double getTorque() {
            return Torque;
        }

        public void EngineDisplacement(double cc) {
            this.Displacement = cc;
        }

        public void EngineHorsePower(double hp) {
            this.HorsePower = hp;
        }

        public void EngineTorque(double torq) {
            this.Torque = torq;
        }

        public void display() {
            System.out.println("Engine Displacement: " + getDisplacement());
            System.out.println("Engine Horse Power: " + getHorsePower());
            System.out.println("Engine Torque: " + getTorque());
        }

    }

    public static void main(String[] args) {
        Vehicle van = new Vehicle();
        van.EngineDisplacement(783.21);
        van.EngineHorsePower(566);
        van.EngineTorque(306);
        van.display();
    }

}
