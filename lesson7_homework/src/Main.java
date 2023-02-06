import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final int CARS_COUNT = 4;
    public static ExecutorService executorService=Executors.newFixedThreadPool(CARS_COUNT);
    public static final AtomicInteger finishCount= new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        CyclicBarrier cyclicBarrier=new CyclicBarrier( CARS_COUNT+1,
                ()-> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!"));

        CountDownLatch countDownLatch=new CountDownLatch(CARS_COUNT);
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10),cyclicBarrier,countDownLatch,finishCount);
        }
        for (int i = 0; i < cars.length; i++) {
          executorService.execute(cars[i]);
        }

        try {
            cyclicBarrier.await();
        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
        try {
            countDownLatch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            executorService.shutdown();
        }

    }
}