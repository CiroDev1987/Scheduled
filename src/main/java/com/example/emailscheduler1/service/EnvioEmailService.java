package com.example.emailscheduler1.service;

import lombok.RequiredArgsConstructor;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class EnvioEmailService {

    private Object EmailUtil;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("tarde" + new EnvioEmailService());
    }

}
