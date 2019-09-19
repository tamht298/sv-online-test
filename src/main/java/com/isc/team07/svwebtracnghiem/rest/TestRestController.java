package com.isc.team07.svwebtracnghiem.rest;

import com.isc.team07.svwebtracnghiem.entity.Classe;
import com.isc.team07.svwebtracnghiem.entity.Test;
import com.isc.team07.svwebtracnghiem.service.ClassService;
import com.isc.team07.svwebtracnghiem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TestRestController {

    private TestService testService;

    @Autowired
    public TestRestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/tests")
    public List<Test> getAllTest() {
        return testService.findAll();
    }

    @GetMapping("/{isDeleted}/tests")
    public List<Test> getAllTestByIsDeleted(@PathVariable boolean isDeleted) {
        return testService.findByDeleted(isDeleted);
    }

    @GetMapping("/tests/{testId}")
    public Test getTest(@PathVariable int testId) {
        if (testService.existsById(testId)) {
            return testService.findById(testId);
        } else {
            return null;
        }
    }

    @PostMapping("/tests")
    public Test addTest(@RequestBody Test test) {
        testService.save(test);
        return testService.findById(test.getId());
    }

    @PutMapping("/tests")
    public Test updateTest(@RequestBody Test test) {
        testService.save(test);
        return testService.findById(test.getId());
    }

    @DeleteMapping("/tests/{testId}")
    public String deleteTest(@PathVariable int testId) {
        if (testService.existsById(testId)) {
            testService.deleteById(testId);
            return "Deleted test id - " + testId;
        } else {
            throw new RuntimeException("Did not found test id - " + testId);
        }
    }
}
