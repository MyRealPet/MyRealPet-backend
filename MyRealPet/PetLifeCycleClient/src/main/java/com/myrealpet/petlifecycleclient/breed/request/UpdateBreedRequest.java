package com.myrealpet.petlifecycleclient.breed.request;


import com.myrealpet.petlifecycledto.breed.entity.Species;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateBreedRequest {
    private final String name;
    private final Species species;
    private final String description;
}
