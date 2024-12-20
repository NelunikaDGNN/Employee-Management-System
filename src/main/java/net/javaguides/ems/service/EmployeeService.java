package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee (EmployeeDto employeeDto);

    EmployeeDto getEmployeeByid(long employeeId);
    List<EmployeeDto> getAllEmployees();
}
