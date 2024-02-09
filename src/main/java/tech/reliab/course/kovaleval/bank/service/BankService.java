package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.Bank;

public interface BankService {
    Bank createBank(long id, String name);
    Bank getBank(long id);
    void updateBank(long id);
    void deleteBank(long id);
}
