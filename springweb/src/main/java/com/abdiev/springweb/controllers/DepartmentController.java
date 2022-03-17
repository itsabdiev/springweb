package com.abdiev.springweb.controllers;


import com.abdiev.springweb.entity.Department;
import com.abdiev.springweb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchAllDepartments(){
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentByID(@PathVariable("id") Long id) {
        return departmentService.fetchDepartmentByID(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id) {
        departmentService.deleteDepartmentById(id);
        return "Department deleted successfully!";
    }

    @PutMapping("/departments/{id}")
    public Department updateById(@PathVariable("id") Long id,@RequestBody Department department) {
        return departmentService.updateById(id,department);
    }

    @GetMapping("/departments/getByName/{name}")
    public Department getByName(@PathVariable("name") String name){
        return departmentService.getByName(name);
    }


}
