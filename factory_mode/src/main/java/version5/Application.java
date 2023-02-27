package version5;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class Application {

    public static void main(String[] args) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);//核心线程大小
        executor.setMaxPoolSize(10);//最大线程大小
        executor.setQueueCapacity(100);//队列最大容量
        executor.setKeepAliveSeconds(3000);//存活时间
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());//拒绝执行时如何处理;
        executor.initialize();

        Dinner dinner = new Dinner();
        dinner.setTaskExecutor(executor);
        dinner.addListener(new A());
        dinner.addListener(new B());

        Thread thread = new Thread(dinner);
        thread.start();
    }
}
