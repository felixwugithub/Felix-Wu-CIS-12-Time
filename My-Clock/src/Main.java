public class Main {

    public static void main(String[] args) {

        Clock myClock = new Clock(0,0,0);

        //tests running the clock a whole day
        for (int i = 0; i < 86400; i++) {
            myClock.nextSecond();
            System.out.println(myClock);
        }

//        //tests running the clock backwards a whole day
//        for (int i = 0; i < 86400; i++) {
//            myClock.previousSecond();
//            System.out.println(myClock);
//
//        }

    }
}
