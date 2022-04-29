package in.ashwinimohapatra.whassignment.restclient;

import java.util.ArrayList;
import java.util.List;

import in.ashwinimohapatra.whassignment.model.UserModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestEndpoint {

    @GET("/easygautam/data/users")
    public Call<ArrayList<UserModel>> getUserData();
}
