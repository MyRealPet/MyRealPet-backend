package com.myrealpet.petlifecyclecore.pet.service;

import com.myrealpet.petlifecycleclient.metadata.response.FileUploadResponse;
import com.myrealpet.petlifecycleclient.pet.request.RegisterPetAccountRequest;
import com.myrealpet.petlifecycleclient.pet.request.UpdatePetAccountRequest;
import com.myrealpet.petlifecycleclient.pet.response.ListPetAccountResponse;
import com.myrealpet.petlifecycleclient.pet.response.ReadPetAccountResponse;
import com.myrealpet.petlifecycleclient.pet.response.RegisterPetAccountResponse;
import com.myrealpet.petlifecycleclient.pet.response.UpdatePetAccountResponse;
import org.springframework.web.multipart.MultipartFile;

public interface PetAccountService {
    RegisterPetAccountResponse registerPetAccount(Long accountId, RegisterPetAccountRequest request);
    ReadPetAccountResponse readPetAccount(Long accountId, Long petId);
    ListPetAccountResponse listPetAccount(Long accountId);
    UpdatePetAccountResponse updatePetAccount (Long accountId, Long petId, UpdatePetAccountRequest request);
    FileUploadResponse uploadProfileImage(Long accountId, Long petId, MultipartFile file);
    FileUploadResponse uploadRegistration(Long accountId, Long petId, MultipartFile file);
    void deletePetAccount(Long accountId, Long petId);
}
