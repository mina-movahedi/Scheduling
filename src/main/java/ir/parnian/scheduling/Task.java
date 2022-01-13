package ir.parnian.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {


    @Scheduled(fixedRateString = "${delay}")
    public void doTask(){
        System.out.println("This is " + (System.currentTimeMillis() / 1000));
    }


    @Scheduled(fixedRate = 2000)
    public void doAnotherTask(){
        System.err.println("This is " + (System.currentTimeMillis() / 1000));
    }

    /** The following task will run at specific time every day with the server time.
     It is possible to set it with time zone.
     */
    @Scheduled(cron = "${cron.expression}")
    public void doTaskOnTime(){
        System.out.println("Exactly on a time");
    }

}
