package com.example.emailscheduler1.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

import static com.example.emailscheduler1.quartz.job.EmailUtil.*;

public class EmailJob implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Job --->>> Time is " + new Date());
        EmailUtil.sendEmail("cirodev.junior@gmail.com", "Email testing subject1", "Deu certo carai!");
    }
}
