package ru.skillfactory.tgbot.services;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import ru.skillfactory.tgbot.repo.IncomeRepository;
import ru.skillfactory.tgbot.repo.SpendRepository;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс-тест для тестирования FinanceService
 */
// указываем, что этот класс - тестовый, под управлением SpringBoot
@SpringBootTest
// указываем, что инстанс теста создаётся на весь класс (т.е. для отработки всех методов)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FinanceServiceTest {

    // упоминание нашего сервиса с аннотацией, которая имитирует сервис
    // и включает имитацию нужных зависимостей,
    // так как в тестах не вся программа инициализируется, а только её часть
    @InjectMocks
    private FinanceService financeService;

    // указываем, что этот класс надо имитировать (он используется в FinanceService)
    @Mock
    private SpendRepository spendRepository;

    // указываем, что этот класс надо имитировать (он используется в FinanceService)
    @Mock
    private IncomeRepository incomeRepository;

    // запишем время, когда начался каждый тест
    @BeforeEach
    public void beforeAll() {
        System.out.println(System.currentTimeMillis());
    }

    // запишем время, когда закончился каждый тест
    @AfterEach
    public void afterEach() {
        System.out.println(System.currentTimeMillis());
    }

    // тестовый метод для первого кейса
    @DisplayName("ADD_INCOME_test")
    @Test
    public void addFinanceOperationAddIncomeTest() {
        // установили произвольное значение переменной для отправки в метод
        String price = "150.0";
        // обращаемся к методу с произвольными параметрами и сохраняем результат в переменную
        String message = financeService.addFinanceOperation("/addincome", price, 500L);
        // убеждаемся, что получили ожидаемый результат
        Assertions.assertEquals("Доход в размере " + price + " был успешно добавлен", message);
    }

    // тестовый метод для второго кейса, всё аналогично первому, но с другими параметрами
    @DisplayName("non_ADD_INCOME_test")
    @Test
    public void addFinanceOperationElseBranchTest() {
        // снова даём значение переменной
        String price = "200";
        // снова обращаемся к методу с другими параметрами
        String message = financeService.addFinanceOperation("/nan", price, 250L);
        // убеждаемся, что получили ожидаемый результат
        Assertions.assertEquals("Расход в размере " + price + " был успешно добавлен", message);
    }
}