package ru.sberbank.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.sberbank.exception.MyException;

import java.util.Map;

@Controller
@RequestMapping("/param")
public class ParamsController {

    @PostMapping("/request")
    public void param1(@RequestParam Map<String, String> param) {
        System.out.println(param);
    }

    @GetMapping(value = "/body")
    public void param1(@RequestBody String person) {
        System.out.println(person);
    }

    @GetMapping(value = "/user/{id}")
    public void param3(@PathVariable String id) {
        System.out.println(id);
    }

    @RequestMapping(method = RequestMethod.HEAD, value = "/header")
    public void param4(@RequestHeader Map<String, String> id) {
        System.out.println(id);
    }


}
