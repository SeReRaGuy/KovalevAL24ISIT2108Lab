package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.service.BankService;

import java.util.Random;

public class BankServiceImpl implements BankService {
    @Override
    public Bank createBank(long id, String name) {
        Bank bank = Bank.builder()
                .id(id)
                .name(name)
                .countOffice(0)
                .countAtm(0)
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
