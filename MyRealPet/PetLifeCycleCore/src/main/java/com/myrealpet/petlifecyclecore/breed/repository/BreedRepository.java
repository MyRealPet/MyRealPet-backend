package com.myrealpet.petlifecyclecore.breed.repository;

import com.myrealpet.petlifecycledto.breed.entity.Breed;
import com.myrealpet.petlifecycledto.breed.entity.Species;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BreedRepository extends JpaRepository<Breed, Long> {
    boolean existsByIdAndIsDeletedFalse(Long id);
    Optional<Breed> findByIdAndIsDeletedFalse(Long id);
    Page<Breed> findAllByIsDeletedFalse(Pageable pageable);
    Page<Breed> findAllBySpeciesAndIsDeletedFalse(Species species, Pageable pageable);
}
