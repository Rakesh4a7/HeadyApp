package com.example.headyapp.api;

import com.example.headyapp.model.response.MasterdataDTO;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * API service for api call.
 *
 * @author Rakesh
 */
public interface ApiService
{
    @GET("/json")
	Observable<MasterdataDTO> getCategoryAndProductDetails();
}
