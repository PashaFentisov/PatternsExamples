package com.example.patternsexamples.proxy;

public class ProxyProject implements Project{
    private Project project;
    @Override
    public void start() {
        if(project == null){
            project = new RealProject();
        }
        System.out.println("In proxy project");
        project.start();
        System.out.println("code after real project completed");
    }
}
