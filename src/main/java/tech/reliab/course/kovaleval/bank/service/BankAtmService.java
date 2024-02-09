package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankAtm;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.entity.Employee;

public interface BankAtmService {
    BankAtm createBankAtm(long id, String name, String address, String status, Bank belongBank,
                          BankOffice belongOffice, Employee serviceEmployee, boolean getMoney,
                          boolean giveMoney, double money, double serviceMoney);

    BankAtm getBankAtm(long id);
    void updateBankAtm(long id);
    void deleteBankAtm(long id);
}
