package com.example.anime.remote;

import com.example.anime.model.AnimeResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndpoint {

    @GET("USERNAME/load.json")
    Call<List<AnimeResponse>> getNowPlayingAnime(
            @Query("status") Integer statusApi,
            @Query("offset") Integer offsetApi
    );

}
