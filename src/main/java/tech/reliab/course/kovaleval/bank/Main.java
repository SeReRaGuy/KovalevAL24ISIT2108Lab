package tech.reliab.course.kovaleval.bank;

import tech.reliab.course.kovaleval.bank.entity.*;
import tech.reliab.course.kovaleval.bank.service.*;
import tech.reliab.course.kovaleval.bank.service.impl.*;
import tech.reliab.course.kovaleval.bank.utils.BankContentGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BankContentGenerator generator = new BankContentGenerator();
        generator.generateBanks();
        generator.generateOffices();
        generator.generateEmployees();
        generator.generateATMs();
        generator.generateUsers();
        generator.paymentAccount();
        generator.creditAccount();
    }

}
