package ru.skillfactory.tgbot.repo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactory.tgbot.Income;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class IncomeRepositoryTest {

    @Autowired
    private IncomeRepository incomeRepository;

    @Test
    public void testDataScripts(){
        Optional<Income> optionalIncome = incomeRepository.findById(1234L);
        Assert.assertTrue(optionalIncome.isPresent());
        Assert.assertEquals(new BigDecimal("5000.00"), optionalIncome.get().getIncome());
    }

}