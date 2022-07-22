package com.example.cdintegration;

import com.example.cdintegration.config.CustomConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

import java.util.Collection;
import java.util.Map;

@SpringBootTest
class CdIntegrationApplicationTests {

    @Autowired
    Map<String, CustomConfiguration.SearchService> map;




    @Test
    void contextLoads() {
        Collection<CustomConfiguration.SearchService> values = map.values();

        Runnable task_running = new Runnable() {

            @Override
            public void run() {
                System.out.println("task running");
            }
        };

        TaskScheduler scheduler = new DefaultManagedTaskScheduler();

        scheduler.schedule(task_running,new CronTrigger("0 15 9-17 * * MON-FRI"));


        System.out.println("end");
    }
}
