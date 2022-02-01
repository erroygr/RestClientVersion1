package org.example;

import org.example.configuration.ConfigurationRestKitchen;
import org.example.entity.application.ApplicationRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Rest Client
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Rest Client Kitchen/ ApplicationApi");

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConfigurationRestKitchen.class);

        CommunicationApplicationApi communicationApplicationApi =
                applicationContext.getBean("communicationApplicationApi",
                        CommunicationApplicationApi.class);
        List<ApplicationRequest> applicationRequestList = communicationApplicationApi.getAllApplication();


        System.out.println("Запрос на выборку всех заявок");
        for(ApplicationRequest applicationRequest :applicationRequestList) {
            System.out.println(applicationRequest.toString());
        }

        System.out.println("Запрос на выборку заявки с id=2");
        ApplicationRequest applicationRequest = communicationApplicationApi.getApplication(2);
        System.out.println(applicationRequest.toString());

    }
}
