package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridLayout;

import com.example.anime.adapter.AnimeAdapter;
import com.example.anime.databinding.ActivityMainBinding;
import com.example.anime.model.AnimeResponse;
import com.example.anime.remote.AnimeService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private AnimeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        activityMainBinding.rvAnime.setLayoutManager(gridLayoutManager);

        AnimeService.getApi().getNowPlayingAnime(7, 0 ).enqueue(new Callback<List<AnimeResponse>>() {
            @Override
            public void onResponse(Call<List<AnimeResponse>> call, Response<List<AnimeResponse>> response) {


                Log.d("response", String.valueOf(response.code()));
                if(response.isSuccessful()){
                    List<AnimeResponse> animes = response.body();
                    adapter = new AnimeAdapter(animes, MainActivity.this);
                    activityMainBinding.rvAnime.setAdapter(adapter);

                   /* for(AnimeResponse animeResponse : animes){
                        AnimeResponse animetitle = animeResponse;

                        Log.d("judul : anime", animetitle.getAnimeTitle());
                    }*/
                }
            }

            @Override
            public void onFailure(Call<List<AnimeResponse>> call, Throwable t) {
                Log.e("req gagal", t.getLocalizedMessage());

            }
        });
    }
}
