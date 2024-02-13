package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.service.BankService;

import java.util.Random;

public class BankServiceImpl implements BankService {
    /**
     *
     * @param id        id of the bank
     * @param name      id of the name <br>
     *
     *                  number of offices at the bank (it is filled in and counted automatically when
     *                  <br> a new office is added, by default 0) <br>
     *
     *                  number of ATMs at the bank (it is filled in and counted automatically when
     *                  <br> a new ATM is added, by default 0) <br>
     *
     *                  number of employees at the bank (it is filled in and counted automatically when
     *                  <br> a new employee is added, by default 0) <br>
     *
     *                  number of users at the bank (it is filled in and counted automatically when
     *                  <br> a new user is added, by default 0) <br>
     *
     *                  rating of the bank (generated randomly, from 0 to 100, where 100 is the highest
     *                  <br> score, the higher the bank's rating, the lower the interest rate should be) <br>
     *
     *                  the money in the bank (generated randomly, but no more than 1,000,000) <br>
     *
     *                  the bank's interest rate (it is generated randomly, but no more than 20%, however,
     *                  <br> you need to take into account the bank's rating, the higher it is, the lower <br>
     *                  <br> the rate should be generated) <br>
     * @return          {@link Bank}
     */
    @Override
    public Bank createBank(long id, String name) {
        Bank bank = Bank.builder()
                .id(id)
                .name(name)
                .countOffice(0)
                .countAtm(0)
                .countEmployee(0)
                .countUser(0)
                .rating(new Random().nextInt(101))
                .money(new Random().nextDouble(1000000))
                .build();
        bank.setInterestRate(Math.max(0,Math.min(20,new Random().nextDouble(20)+(double) bank.getRating()/10)));
        return null;
    }

    @Override
    public Bank getBank(long id) {
        return null;
    }

    @Override
    public void updateBank(long id) {

    }

    @Override
    public void deleteBank(long id) {

    }
}
