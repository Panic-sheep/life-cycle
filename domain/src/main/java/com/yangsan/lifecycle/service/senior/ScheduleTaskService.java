package com.yangsan.lifecycle.service.senior;

import com.yangsan.lifecycle.entity.senior.LifeCycleTask;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Component
public class ScheduleTaskService {

    private final static int CORE_POOL_SIZE = 1;

    private final static int MAX_POOL_SIZE = 1;
    private final static long KEEP_ALIVE_TIME = 10L;

    private final static int QUEUE_MAX_SIZE = 1;

    private final static BlockingDeque QUEUE = new LinkedBlockingDeque(QUEUE_MAX_SIZE);



    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME,
            TimeUnit.MINUTES, QUEUE, new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("执行了拒绝策略，暂不执行" + r.toString());
        }
    });

    public static void main(String[] args) {
        List<LifeCycleTask> tasks = new ArrayList<>();
        LifeCycleTask lifeCycleTaskA = new LifeCycleTask("A","A");
        LifeCycleTask lifeCycleTaskB = new LifeCycleTask("B","B");
        LifeCycleTask lifeCycleTaskC = new LifeCycleTask("C","C");
        tasks.add(lifeCycleTaskA);
        tasks.add(lifeCycleTaskB);
        tasks.add(lifeCycleTaskC);

        for (LifeCycleTask task : tasks) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        process(task);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public String toString() {
                    return task == null ? "" :
                            task.toString();
                }
            });
        }
    }

    public static void process(LifeCycleTask task){
        System.out.println("process ==============> " + task);
    }
}
