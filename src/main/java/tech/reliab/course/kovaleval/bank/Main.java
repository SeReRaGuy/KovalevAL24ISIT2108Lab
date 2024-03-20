package tech.reliab.course.kovaleval.bank;

import tech.reliab.course.kovaleval.bank.entity.*;
import tech.reliab.course.kovaleval.bank.service.*;
import tech.reliab.course.kovaleval.bank.service.impl.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        BankAtmService bankAtmService = new BankAtmServiceImpl();
        UserService userService = new UserServiceImpl();
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        CreditAccountService creditAccountService = new CreditAccountServiceImpl();

        Bank bank = bankService.createBank(0,"Bank1");
        BankOffice bankOffice = bankOfficeService.createBankOffice(0,"Office1","Belgorod",true,
                true,0,true,true,true,5000,50,bank);
        Employee employee = employeeService.createEmployee(0,"Name","Lastname","Middlename",
                LocalDate.of(2004,1,1),"Employee",bank,false,bankOffice,true,100);
        BankAtm bankAtm = bankAtmService.createBankAtm(0,"Atm1","Working",bank,bankOffice,employee,
                true,true,150,10);
        User user = userService.createUser(0,"Ivan","Ivanov","Ivanovich",
                LocalDate.of(2005,1,1),"Zavod", List.of(bank));
        PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(0,user,bank);
        CreditAccount creditAccount = creditAccountService.createCreditAccount(0, user,
                LocalDate.of(2024,1,1),LocalDate.of(2025,1,1),
                12,120,10,employee,paymentAccount,bank);
    }
}
