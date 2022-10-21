/*package ru.skillfactory.tgbot.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.skillfactory.tgbot.Income;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IncomeRepositoryTest {
    @Autowired
    private IncomeRepository incomeRepository;
    @Test
    public void testDataScripts(){
        Optional<Income> income = incomeRepository.findById(1234L);
        assertTrue(income.isPresent());
        assertEquals(new BigDecimal("5000"), income.get().getIncome());
    }
}*/