package FP06;

public class FPWithJavaFI {

    private static int max = 100;

    public static void main(String[] args) {

         Runnable runnable3 = () ->{


        while(max > 0)
        {
            System.out.println(Thread.currentThread().getId() +" "+max);
            max--;
        }};

        Thread thread = new Thread(runnable3);
        thread.start();

        Thread thread1 = new Thread(runnable3);
        thread1.start();

        Thread thread2 = new Thread(runnable3);
        thread2.start();

        Thread thread3 = new Thread(runnable3);
        thread3.start();

        Thread thread4 = new Thread(runnable3);
        thread4.start();

        Thread thread5 = new Thread(runnable3);
        thread5.start();

        Thread thread6 = new Thread(runnable3);
        thread6.start();


    }
}
