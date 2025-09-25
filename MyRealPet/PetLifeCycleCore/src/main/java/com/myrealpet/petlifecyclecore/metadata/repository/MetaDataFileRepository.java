package com.myrealpet.petlifecyclecore.metadata.repository;

import com.myrealpet.petlifecycledto.metadata.entity.MetaDataFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MetaDataFileRepository extends JpaRepository<MetaDataFile, Long> {
    Optional<MetaDataFile> findByS3Key(String s3Key);
    List<MetaDataFile> findByIsDeletedTrueAndS3DeletedFalseAndDeletedAtBefore(LocalDateTime cutOfDate);

}
