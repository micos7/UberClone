package ro.mihai.uberclone.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleApi {
    @GET
    Call<String> getPath(@Url String url);
}
