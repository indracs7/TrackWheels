package com.softclique.trackwheels;

import com.softclique.trackwheels.pojo.Journey;
import com.softclique.trackwheels.pojo.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RestApiHandler {

    String BASE_URL = "https://serene-citadel-13251.herokuapp.com/v1/";

    @POST("create_user/")
    Call<User> createUser(@Body User user);

    @POST("start_journey/")
    Call<Journey> startJourney(@Body Journey journey);

    @POST("stop_journey/")
    Call<String> stopJourney(@Body Journey journey);

    @POST("get_journey_details/")
    Call<Journey> getJourneyDetails(@Body Journey journey);

    @POST("addlocation_log/")
    Call<String> addLocationLog(@Body Journey journey);





}
