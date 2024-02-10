package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankAtm;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.entity.Employee;
import tech.reliab.course.kovaleval.bank.service.BankAtmService;

public class BankAtmServiceImpl implements BankAtmService {
    @Override
    public BankAtm createBankAtm(long id, String name, String status,
                                 Bank belongBank, BankOffice belongOffice,
                                 Employee serviceEmployee, boolean getMoney,
                                 boolean giveMoney, double money, double serviceMoney) {
        BankAtm bankAtm = BankAtm.builder()
                .id(id)
                .name(name)
                .belongBank(belongBank)
                .belongOffice(belongOffice)
                .serviceEmployee(serviceEmployee)
                .getMoney(getMoney)
                .giveMoney(giveMoney)
                .serviceMoney(serviceMoney)
                .address(belongOffice.getAddress())
                .build();
        if (belongBank.getMoney() < money) throw new
                IllegalArgumentException("Такого количества денег нет в банке");
        else bankAtm.setMoney(money);
        if (!status.equals("Работает") && !status.equals("Не работает") && !status.equals("Нет денег"))
            throw new IllegalArgumentException("Неверно указан статус");
        else bankAtm.setStatus(status);
        belongBank.setCountAtm(belongBank.getCountAtm()+1);
        belongOffice.setCountAtm(belongOffice.getCountAtm()+1);
        return bankAtm;
    }

    @Override
    public BankAtm getBankAtm(long id) {
        return null;
    }

    @Override
    public void updateBankAtm(long id) {

    }

    @Override
    public void deleteBankAtm(long id) {

    }
}
