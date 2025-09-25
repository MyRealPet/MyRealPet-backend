package com.myrealpet.petlifecycleclient.breed.response;

import com.myrealpet.petlifecycledto.breed.entity.Breed;
import com.myrealpet.petlifecycledto.breed.entity.Species;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateBreedResponse {
    private final Long breedId;
    private final String name;
    private final Species species;
    private final String description;

    public static UpdateBreedResponse from(Breed breed) {
        return new UpdateBreedResponse(
                breed.getId(),
                breed.getName(),
                breed.getSpecies(),
                breed.getDescription()
        );
    }
}
