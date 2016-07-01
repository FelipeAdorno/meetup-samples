package br.com.meetup.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class LanguagesRestController {

    @RequestMapping("/languages")
    @ResponseStatus(HttpStatus.OK)
    public List<String> languages() {
        return asList("Portuguese", "English", "Spanish", "Cluster1");
    }

}