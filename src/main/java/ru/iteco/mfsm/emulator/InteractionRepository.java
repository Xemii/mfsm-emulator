package ru.iteco.mfsm.emulator;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InteractionRepository extends JpaRepository<InteractionEntity, String> {
    @Override
    <S extends InteractionEntity> S save(S s);
}
