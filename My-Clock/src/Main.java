public class Main {

    public static void main(String[] args) {

        Clock myClock = new Clock(1111,23123123,-13);

        //tests running the clock a whole day
        for (int i = 0; i < 86400; i++) {
            System.out.println(myClock.nextSecond().toString());
        }

        //tests running the clock backwards a whole day
//        for (int i = 0; i < 86400; i++) {
//            System.out.println(myClock.previousSecond().toString());
//        }

    }
}
