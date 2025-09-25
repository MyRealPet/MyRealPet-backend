package com.myrealpet.petlifecycleclient.breed.client;


import com.myrealpet.petlifecycleclient.breed.request.RegisterBreedRequest;
import com.myrealpet.petlifecycleclient.breed.response.RegisterBreedResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name = "petlifecycle-api",
    url = "\\${petlifecycle.api.host}",
    path = "/petlifecycle/breed"
)
public interface BreadApiClient {
    @PostMapping
    ResponseEntity<RegisterBreedResponse> register(@RequestBody RegisterBreedRequest request);
}
