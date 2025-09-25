package com.myrealpet.petlifecycleclient.breed.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ListBreedRequest {
    private final int page;
    private final int perPage;
}
