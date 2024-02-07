package com.johnbryce.targilkita.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RemoveExpiredCoupons {

    //@Scheduled(fixedRate = 1000*60*60*24) => will work every 24 hours
    //cron task......
    @Scheduled(cron = "0 2 * * *") // => will work at 2 am exactly, every day of the week, every month every day in month
    //https://crontab.guru/
    public void yallaDelete(){
        System.out.println("Deleting old coupons");
    }
}
