package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.Main;
import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.entity.User;
import tech.reliab.course.kovaleval.bank.service.UserService;
//кредитный рейтинг
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class UserServiceImpl implements UserService {
    /**
     *
     * @param id            id of the user
     * @param name          name of the user
     * @param lastName      last name of the user
     * @param middleName    middle name of the user
     * @param dateOfBirth   user's date of birth
     * @param placeOfWork   user's place of work <br>
     *
     *                      user's monthly income (generated randomly, but no more than 10,000) <br>
     *
     * @param banks         banks that a user uses <br>
     *
     *                      user's credit accounts (empty by default) <br>
     *
     *                      Credit rating for the bank (randomly generated based on monthly income,
     *                      <br> from less than 1,000 – 100, from 1,000 to 2,000 – 200, etc. up to 10,000) <br>
     * @return              {@link User}
     */
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
                .profit((double) Math.round((new Random().nextDouble(9951) + 50) * 100) /100)
                .banks(banks)
                .CreditAccounts(null)
                .PaymentAccounts(null)
                .build();
        user.setRating((double) Math.round((new Random().nextDouble(user.getProfit() / 10)) * 100) /100);
        banks.forEach(bank -> bank.setCountUser(bank.getCountUser() + 1));
        return user;
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
