package ru.skillfactory.tgbot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactory.tgbot.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
