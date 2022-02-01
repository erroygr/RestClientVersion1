package org.example;

import org.example.entity.application.ApplicationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Класс для создания http запросов к applicationApi
 */

@Component
public class CommunicationApplicationApi {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL_APPLICATION_API = "http://localhost:8080/applicationApi/application";

    public List<ApplicationRequest> getAllApplication() {

        ResponseEntity<List<ApplicationRequest>> responseEntity =
                restTemplate.exchange(URL_APPLICATION_API,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<ApplicationRequest>>() {
                        });

        List<ApplicationRequest> applicationRequestList = responseEntity.getBody();
        return applicationRequestList;
    }

    public ApplicationRequest getApplication(int id) {

        ApplicationRequest applicationRequest =
                restTemplate.getForObject(URL_APPLICATION_API + "/" + id,
                        ApplicationRequest.class);

        return applicationRequest;
    }

    public void saveApplication(ApplicationRequest applicationRequest) {
        if (applicationRequest.getIdApplication() == 0) {
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL_APPLICATION_API,
                            applicationRequest,
                            String.class);
            System.out.println("Добавлена новая заявка в систему");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL_APPLICATION_API,
                    applicationRequest);
            System.out.println("Заявка с номером id = " + applicationRequest.getIdApplication() + " изменена");
        }
    }

    public void deleteApplication(int id) {
        restTemplate.delete(URL_APPLICATION_API+ "/" + id);
        System.out.println("Заявка с номером id = " + id + " удалена");
    }
}
