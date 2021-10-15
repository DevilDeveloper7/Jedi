package Eco.controllers;

import Eco.api.StaticApi;
import Eco.dto.TrashTypes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public class StaticController {
    private StaticApi mStaticApi;
    private final String BASE_URL = "https://static.api.ecohub.eco/";

    public StaticController() {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit.Builder retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson));
        mStaticApi = retrofit.baseUrl(BASE_URL).build().create(StaticApi.class);
    }
    public List<Object> radius() throws IOException {
        Call<List<Object>> call = mStaticApi.radius();
        var resp  = call.execute();
        return resp.body();


    }
    public void types(Consumer<List<TrashTypes>> tr){
        Call<List<TrashTypes>> call = mStaticApi.types();

        call.enqueue(new Callback<List<TrashTypes>>() {
            @Override
            public void onResponse(Call<List<TrashTypes>> call, Response<List<TrashTypes>> response) {
                tr.accept(response.body());
            }

            @Override
            public void onFailure(Call<List<TrashTypes>> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}
