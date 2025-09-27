public class ActualCall {

    public ActualCall() {
        System.out.println("Class ActualCall");

    }

    static class Check {

        public Check() {

            System.out.println("Class Check");
        }

        public static void main(String[] args) {
            System.out.println("CLASS CHECK MAIN METHOD");

        }

    }

    public static void main(String[] args) {

        ActualCall.Check c1 = new ActualCall.Check();
        String a[]={"A1","S2"};
        c1.main(a);

    }

}
