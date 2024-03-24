public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!11");
        int a = 0;
        if (a == 0) {
            System.out.println("a = 0!");
        }
        //fix conflic
        int origin_main_chenbin_dev = 1;
        if (origin_main_chenbin_dev == 1) {
            System.out.println("origin_main_chenbin_dev = 1");
        }

        //merge test
        //fix conflic
        int origin_chenbin = 1;
        if (origin_chenbin == 1) {
            System.out.println("origin_chenbin = 1");
        }
        //feat main
        int featMain = 1;
        if (featMain == 1) {
            System.out.println("featMain = 1");
        }
    }
}
