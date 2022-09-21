package ru.skillfactory.tgbot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactory.tgbot.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
