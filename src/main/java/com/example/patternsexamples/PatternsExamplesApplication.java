package com.example.patternsexamples;

import com.example.patternsexamples.abstractFactory.AppleCreatorFactory;
import com.example.patternsexamples.abstractFactory.Phone;
import com.example.patternsexamples.abstractFactory.TechniqueCreatorFactory;
import com.example.patternsexamples.abstractFactory.WindowsCreatorFactory;
import com.example.patternsexamples.adaptor.*;
import com.example.patternsexamples.builder.Person;
import com.example.patternsexamples.command.CloseDoorsCommand;
import com.example.patternsexamples.command.Elevator;
import com.example.patternsexamples.command.OpenDoorsCommand;
import com.example.patternsexamples.command.Passenger;
import com.example.patternsexamples.decorator.Cook;
import com.example.patternsexamples.decorator.Driver;
import com.example.patternsexamples.decorator.Teacher;
import com.example.patternsexamples.factoryMethod.*;
import com.example.patternsexamples.prototype.Student;
import com.example.patternsexamples.proxy.Project;
import com.example.patternsexamples.proxy.ProxyProject;
import com.example.patternsexamples.proxy.RealProject;
import com.example.patternsexamples.singleton.User;
import com.example.patternsexamples.strategy.DBRepository;
import com.example.patternsexamples.strategy.JavaRepository;
import com.example.patternsexamples.strategy.Repository;
import com.example.patternsexamples.strategy.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ScopeMetadata;

import java.net.UnknownServiceException;

@SpringBootApplication
public class PatternsExamplesApplication {

    public static void main(String[] args) {
//        SpringApplication.run(PatternsExamplesApplication.class, args);
        PatternsExamplesApplication app = new PatternsExamplesApplication();
//        builderTest();
//        singletonTest();
//        app.factoryMethodTest("Phone"); // or TV or Laptop
//        prototypeTest();
//        app.abstractFactoryTest("Windows");// or Apple
//        adapterTest();
//        decoratorTest();
//        strategyTest();
//        proxyTest();
        commandTest();
    }

    private static void commandTest() {
        Elevator elevator = new Elevator();
        OpenDoorsCommand openDoorsCommand = new OpenDoorsCommand(elevator);
        CloseDoorsCommand closeDoorsCommand = new CloseDoorsCommand(elevator);
        Passenger passenger = new Passenger(openDoorsCommand, closeDoorsCommand);
        passenger.pressOpenDoorsButton();
        passenger.pressCloseDoorsButton();
    }

    private static void proxyTest() {
        Project realProject = new RealProject();
        Project proxyProject = new ProxyProject();
        realProject.start();
        System.out.println("==================================");
        proxyProject.start();
    }

    private static void strategyTest() {
        Repository repository = new JavaRepository();
        Service service = new Service(repository);
        service.read();
        service.setRepository(new DBRepository());
        service.read();
    }

    private static void decoratorTest() {
        Teacher teacher = new Teacher();
        teacher.doJob();
        Driver driver = new Driver(new Teacher());
        Cook cook = new Cook(new Driver(new Teacher()));
        driver.doJob();
        cook.doJob();
    }

    private static void adapterTest() {
        StringReader reader = new MyReader();
        InputStreamReaderAdaptor adaptor = new InputStreamReaderAdaptor(new MyInputStream());
        CommandLine commandLine = new CommandLine();
        commandLine.read(reader);
        commandLine.read(adaptor); //завдяки адаптору ми можем передати в цей метод об'єкт MyInputStream
    }

    private void abstractFactoryTest(String company) {
        TechniqueCreatorFactory creator = switch (company) {
            case "Apple" -> new AppleCreatorFactory();
            case "Windows" -> new WindowsCreatorFactory();
            default -> throw new RuntimeException("Unknown technique name");
        };
        com.example.patternsexamples.abstractFactory.Laptop laptop = creator.createLaptop();
        com.example.patternsexamples.abstractFactory.Phone phone = creator.createPhone();
        laptop.printLaptop();
        phone.printPhone();
    }

    private static void prototypeTest() {
        Student s1 = new Student("John", "Doe", 30);
        Student s2 = (Student) s1.copy();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    private void factoryMethodTest(String techniqueName) {
        TechniqueCreator creator = switch (techniqueName) {
            case "TV" -> new TVCreator();
            case "Phone" -> new PhoneCreator();
            case "Laptop" -> new LaptopCreator();
            default -> throw new RuntimeException("Unknown technique name");
        };
        Technique technique = creator.createTechnique();
        technique.turnOn();
    }

    private static void singletonTest() {
        User u1 = User.getInstance();
        User u2 = User.getInstance();
        System.out.println(u1 == u2);
    }

    private static void builderTest() {
        Person p = new Person.PersonBuilder()
                .name("John")
                .surname("Doe")
                .age(30)
                .address("Some address")
                .phone("123456789")
                .build();
        System.out.println(p);
    }

}
