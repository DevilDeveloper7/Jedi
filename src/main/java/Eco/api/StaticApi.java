package Eco.api;

import Eco.dto.TrashTypes;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface StaticApi {
    @GET("types")
    Call<List<TrashTypes>> types();

    @POST("inRadius")
    Call<List<Object>> radius();
}
