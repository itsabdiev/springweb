package com.abdiev.springweb.service;

import com.abdiev.springweb.entity.Department;
import com.abdiev.springweb.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentByID(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateById(Long id, Department department) {
        Department departmentToBeUpdated = departmentRepository.findById(id).get();
        if(Objects.nonNull(department) && !"".equalsIgnoreCase(department.getDepartmentName())){
            departmentToBeUpdated.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            departmentToBeUpdated.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            departmentToBeUpdated.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(departmentToBeUpdated);
    }

    @Override
    public Department getByName(String name) {
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }
}
