package com.example.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CalculatorControllerTest {



    @Test
    void subtract() throws IOException, InterruptedException {
        Integer a = 10;
        Integer b = 9;

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:8084/subtract?a=%d&b=%d"
                        .formatted(a, b))).
                build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        int i = Integer.parseInt(body);
        Assertions.assertEquals(a - b, i);
    }

        @Test
    void add() throws IOException, InterruptedException {
        Integer a = 9;
        Integer b = 1;

        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest request = HttpRequest
                .newBuilder(URI.create("http://localhost:8084/subtract?a=%d&b=%d"
                        .formatted(a, b))).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        int i = Integer.parseInt(body);
        Assertions.assertEquals(a - b, i);


    }
}