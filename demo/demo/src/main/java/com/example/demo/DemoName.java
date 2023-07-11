package com.example.demo;

 import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoName{

    @GetMapping("/resource")
    public String getResource() {
        // Logic to handle GET request for /api/resource
        return "GET Request";
    }

    @PostMapping("/resource")
    public String createResource() {
        // Logic to handle POST request for /api/resource
        return "POST Request";
    }

    @PutMapping("/resource/{id}")
    public String updateResource(@PathVariable Long id) {
        // Logic to handle PUT request for /api/resource/{id}
        return "PUT Request for ID: " + id;
    }

    @DeleteMapping("/resource/{id}")
        public String deleteResource(@PathVariable Long id) {
            // Logic to handle DELETE request for /api/resource/{id}
            return "DELETE Request for ID: " + id;
        }
    }