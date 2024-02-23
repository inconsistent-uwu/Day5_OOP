
public class MultipleInterfaces {
    static interface TripCost {
        double DistanceRate();
    }

    static interface Taxi {

        void setTaxi(String TaxiModel, String TaxiLicense);

        void getTaxi();

    }

    public static class Cab implements TripCost, Taxi {
        double distance;
        double rate;
        String TaxiModel = new String();
        String TaxiLicense = new String();

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public double DistanceRate() {
            return distance * rate;
        }

        public void setTaxi(String TaxiModel, String TaxiLicense) {
            this.TaxiModel = TaxiModel;
            this.TaxiLicense = TaxiLicense;
        }

        public void getTaxi() {
            System.out.println("Taxi Model: " + TaxiModel);
            System.out.println("Taxi License: " + TaxiLicense);
            System.out.println("Taxi for Distance: " + distance);
            System.out.println("Total Cost " + DistanceRate());

        }
    }

    public static void main(String[] args) {
        Cab NewCab = new Cab();
        NewCab.setTaxi("Dzire", "MH 04 A 5062");
        NewCab.setDistance(20);
        NewCab.setRate(8.5);
        NewCab.getTaxi();

    }

}
