
public class InterfaceVisibility {

    public static interface MyInterface {

        void display();
    }

    public static class MyImplementation implements MyInterface {

        public void display() {
            System.out.println("Public method Implements");
        }
    }

    public static void main(String[] args) {
        MyImplementation Mi = new MyImplementation();
        Mi.display();
    }

}
