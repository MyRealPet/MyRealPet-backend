package com.myrealpet.petlifecyclecore.breed.service;

import com.myrealpet.petlifecycleclient.breed.request.ListBreedRequest;
import com.myrealpet.petlifecycleclient.breed.request.RegisterBreedRequest;
import com.myrealpet.petlifecycleclient.breed.request.UpdateBreedRequest;
import com.myrealpet.petlifecycleclient.breed.response.ListBreedResponse;
import com.myrealpet.petlifecycleclient.breed.response.ReadBreedResponse;
import com.myrealpet.petlifecycleclient.breed.response.RegisterBreedResponse;
import com.myrealpet.petlifecycleclient.breed.response.UpdateBreedResponse;
import com.myrealpet.petlifecycledto.breed.entity.Species;

public interface BreedService {
    RegisterBreedResponse registerBreed(RegisterBreedRequest request);
    ListBreedResponse getAllBreed(ListBreedRequest request);
    ListBreedResponse getBreedBySpecies(Species species, ListBreedRequest request);
    ReadBreedResponse readBreed(Long breedId);
    UpdateBreedResponse updateBreed(Long breedId, UpdateBreedRequest request);
    void deleteBreed(Long breedId);
}
