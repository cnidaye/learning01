package concurrency;

import java.util.concurrent.*;

public class DemoFutureTask {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new CountTask());
        System.out.println(future.isDone());
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(future.get());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CountTask implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return  1000;
    }
}
