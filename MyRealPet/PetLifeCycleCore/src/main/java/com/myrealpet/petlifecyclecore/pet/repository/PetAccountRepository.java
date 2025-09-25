package com.myrealpet.petlifecyclecore.pet.repository;

import com.myrealpet.petlifecycledto.pet.entity.PetAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PetAccountRepository extends JpaRepository<PetAccount, Long> {

    Optional<PetAccount> findByPetIdAndIsDeletedFalse(Long petId);
    List<PetAccount> findByAccountIdAndIsDeletedFalseOrderByCreatedAtDesc(Long accountId);
}
