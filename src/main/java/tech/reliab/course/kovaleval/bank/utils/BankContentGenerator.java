package tech.reliab.course.kovaleval.bank.utils;

import tech.reliab.course.kovaleval.bank.entity.*;
import tech.reliab.course.kovaleval.bank.service.*;
import tech.reliab.course.kovaleval.bank.service.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankContentGenerator {
    private static final BankService bankService = new BankServiceImpl();
    private static final BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
    private static final EmployeeService employeeService = new EmployeeServiceImpl();
    private static final BankAtmService bankAtmService = new BankAtmServiceImpl();
    private static final UserService userService = new UserServiceImpl();
    private static final PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
    private static final CreditAccountService creditAccountService = new CreditAccountServiceImpl();

    private static List<Bank> banks = new ArrayList<>();
    public void generateBanks() {
        String[] bankNames = {"Совкомбанк", "Банк Русский Стандарт", "ТарБанк", "Ренессанс Банк", "Wildberries Банк"};
        for (int i = 0; i < 5; i++) banks.add(bankService.createBank(i, bankNames[i]));
    }

    public void generateOffices() {
        int idCounter = 1;
        String[] officeAddresses = {"Белгород", "Москва", "Краснодон"};
        for (Bank bank : banks) {
            for (int i = 0; i < 3; i++) {
                bank.getBankOffices().add(bankOfficeService.createBankOffice(idCounter++, "Office" + i, officeAddresses[i], true,
                        true, 0, true, true, true, 5000, 50, bank));
            }
        }
    }

    public void generateEmployees() {
        int idCounter = 1;
        for (Bank bank : banks) {
            for (BankOffice bankOffice : bank.getBankOffices()) {
                for (int i = 0; i < 5; i++) {
                    bank.getEmployees().add(employeeService.createEmployee(idCounter++, "Name", "Lastname", "Middlename",
                            LocalDate.of(2004, 1, 1), "Employee", bank, false, bankOffice, true, 100));
                }
            }
        }
    }

    public void generateATMs() {
        int idCounter = 1;
        for (Bank bank : banks) {
            for (int i = 0; i < 3; i++) {
                bank.getBankAtms().add(bankAtmService.createBankAtm(idCounter++, "Atm" + i, "Working", bank,
                        getRandomOfficeOfBank(bank), getRandomEmployeeOfBank(bank),
                        true, true, 150, 10));
            }
        }
    }


    public void generateUsers() {
        int idCounter = 1;
        for (Bank bank : banks) {
            for (int i = 0; i < 5; i++) {
                bank.getUsers().add(userService.createUser(idCounter++, "Ivan", "Ivanov", "Ivanovich",
                        LocalDate.of(2005, 1, 1), "Zavod", List.of(bank)));
            }
        }
    }

    public void paymentAccount() {
        int idCounter = 1;
        for (Bank bank : banks) {
            for (User user : bank.getUsers()) {
                for (int i = 0; i < 2; i++) {
                    user.getPaymentAccounts().add(paymentAccountService.createPaymentAccount(idCounter++, user, bank));
                }
            }
        }
    }

    public void creditAccount() {
        int idCounter = 1;
        for (Bank bank : banks) {
            for (User user : bank.getUsers()) {
                for (int i = 0; i < 2; i++) {
                    user.getCreditAccounts().add(creditAccountService.createCreditAccount(idCounter++, user,
                            LocalDate.of(2024, 1, 1), LocalDate.of(2025, 1, 1),
                            12, 120, 10, getRandomEmployeeOfBank(bank), getRandomPaymentAccount(user), bank));
                }
            }
        }
    }


    private PaymentAccount getRandomPaymentAccount(User user) {
        Random random = new Random();
        return user.getPaymentAccounts().get(random.nextInt(user.getPaymentAccounts().size()));
    }

    private BankOffice getRandomOfficeOfBank(Bank bank) {
        Random random = new Random();
        return bank.getBankOffices().get(random.nextInt(bank.getBankOffices().size()));
    }

    private Employee getRandomEmployeeOfBank(Bank bank) {
        Random random = new Random();
        return bank.getEmployees().get(random.nextInt(bank.getEmployees().size()));
    }
}
