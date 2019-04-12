package com.example.anime.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnimeService {
    private static final String BASE_URL = "https://myanimelist.net/animelist/";

    public static ApiEndpoint getApi(){
        final Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        return retrofit.create(ApiEndpoint.class);
    }
}
