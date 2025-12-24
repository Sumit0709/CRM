package com.sumit.crm.service;


import com.sumit.crm.dto.employee.EmployeeResponseDTO;
import com.sumit.crm.exception.customException.employee.InvalidEmployeeRequestBody;
import com.sumit.crm.exception.customException.user.UserNotFoundException;
import com.sumit.crm.model.Employee;
import com.sumit.crm.model.User;
import com.sumit.crm.repository.EmployeeRepository;
import com.sumit.crm.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;

    @Transactional
    public EmployeeResponseDTO createEmployee(Employee employee) {
        if(employee == null) {
            throw new InvalidEmployeeRequestBody("Please provide employee details");
        }
        Employee savedEmployee = new Employee();
        Long userId = employee.getUser().getId();

        User managedUser = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        employee.setUser(managedUser);
//        try {
            savedEmployee = employeeRepository.save(employee);
            return new EmployeeResponseDTO(savedEmployee);
//        }
//        catch (Exception ignored){
//            return null;
//        }

    }
}
