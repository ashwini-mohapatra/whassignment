package in.ashwinimohapatra.whassignment.restclient;

import android.content.Context;

import in.ashwinimohapatra.whassignment.R;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    public static Retrofit getClient(Context context) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        return new Retrofit.Builder()
                .baseUrl(context.getResources().getString(R.string.api_url))
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

}

