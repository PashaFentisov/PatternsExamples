package com.example.patternsexamples.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JobDecorator implements Job{
    private Job job;
    @Override
    public void doJob() {
        job.doJob();
    }
}
