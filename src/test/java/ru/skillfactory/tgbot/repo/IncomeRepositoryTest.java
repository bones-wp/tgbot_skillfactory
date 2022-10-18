package ru.skillfactory.tgbot.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
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
        Optional<Income> income = incomeRepository.findById(1234L);
        assertTrue(income.isPresent());
        assertEquals(new BigDecimal("5000.00"), income.get().getIncome());
    }
}