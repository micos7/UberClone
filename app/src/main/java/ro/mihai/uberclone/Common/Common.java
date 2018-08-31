package ro.mihai.uberclone.Common;

import ro.mihai.uberclone.remote.IGoogleApi;
import ro.mihai.uberclone.remote.RetrofitClient;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";

    public static IGoogleApi getGoogleApi(){
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
