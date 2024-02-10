package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.User;
import tech.reliab.course.kovaleval.bank.service.UserService;
//кредитный рейтинг
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(long id, String name, String lastName, String middleName,
                           LocalDate dateOfBirth, String placeOfWork,
                           List<Bank> banks) {
        User user = User.builder()
                .id(id)
                .name(name)
                .lastName(lastName)
                .middleName(middleName)
                .dateOfBirth(dateOfBirth)
                .placeOfWork(placeOfWork)
                .profit(new Random().nextDouble(9951) + 50)
                .banks(banks)
                .CreditAccounts(null)
                .PaymentAccounts(null)
                .build();
        user.setRating(new Random().nextDouble(user.getProfit()/10));
        banks.forEach(bank -> bank.setCountUser(bank.getCountUser() + 1));
        return null;
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public void updateUser(long id) {

    }

    @Override
    public void deleteUser(long id) {

    }
}
