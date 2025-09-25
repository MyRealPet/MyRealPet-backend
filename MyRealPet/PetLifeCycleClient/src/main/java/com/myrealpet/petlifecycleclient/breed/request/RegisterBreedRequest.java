package com.myrealpet.petlifecycleclient.breed.request;

import com.myrealpet.petlifecycledto.breed.entity.Breed;
import com.myrealpet.petlifecycledto.breed.entity.Species;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterBreedRequest {
    private final Species species;
    private final String name;
    private final String description;

    public Breed toBreed() {
        return new Breed(species, name, description);
    }
}
