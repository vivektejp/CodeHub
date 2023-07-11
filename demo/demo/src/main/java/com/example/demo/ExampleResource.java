package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExampleResource {

    private ExampleService exampleService;
   // Map<String, ExampleService> allUsers = new HashMap<>();
    @Autowired
    public ExampleResource(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/data")
    public List<String> getAllData() {
        return exampleService.getAllData();
    }

    @GetMapping("/data/{id}")
    public String getDataById(@PathVariable int id) {
        return exampleService.getDataById(id);
    }

    @PostMapping("/data")
    public void addData(@RequestBody String data) {
        exampleService.addData(data);
    }

    @PutMapping("/data/{id}")
    public void updateData(@PathVariable int id, @RequestBody String data) {
        exampleService.updateData(id, data);
    }

    @DeleteMapping("/data/{id}")
    public void deleteData(@PathVariable int id) {
        exampleService.deleteData(id);
    }
}