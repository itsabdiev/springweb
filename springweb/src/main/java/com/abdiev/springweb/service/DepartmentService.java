package com.abdiev.springweb.service;

import com.abdiev.springweb.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchAllDepartments();

    Department fetchDepartmentByID(Long id);

    void deleteDepartmentById(Long id);

    Department updateById(Long id, Department department);

    Department getByName(String name);
}
