package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    User createUser(long id, String name, String lastName, String middleName, LocalDate dateOfBirth,
                    String placeOfWork, List<Bank> banks);
    User getUser(long id);
    void updateUser(long id);
    void deleteUser(long id);
}
