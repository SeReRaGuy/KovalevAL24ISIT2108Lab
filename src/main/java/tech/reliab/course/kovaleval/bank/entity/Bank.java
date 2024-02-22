package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Bank {
    private long id;
    private String name;
    private int countOffice;
    private int countAtm;
    private int countEmployee;
    private int countUser;
    private int rating;
    private double money;
    private double interestRate;

    @Override
    public String toString()
    {
        return "Id банка: " + id
                + "\nНазвание банка: " + name
                + "\nКоличество офисов/банкоматов/сотрудников/пользователей: " + countOffice + '/' + countAtm + '/' + countEmployee + '/' + countUser
                + "\nРейтинг банка: " + rating
                + "\nКол-во денег: " + money
                + "\nПроцентная ставка банка: " + interestRate;
    }
}

