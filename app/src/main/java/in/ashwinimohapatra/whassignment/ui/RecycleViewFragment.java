package in.ashwinimohapatra.whassignment.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;
import java.util.Objects;

import in.ashwinimohapatra.whassignment.R;
import in.ashwinimohapatra.whassignment.adapter.CustomAdapter;
import in.ashwinimohapatra.whassignment.model.UserModel;
import in.ashwinimohapatra.whassignment.restclient.RestClient;
import in.ashwinimohapatra.whassignment.restclient.RestEndpoint;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecycleViewFragment extends Fragment {

    CustomAdapter customAdapter;
    RecyclerView recyclerView;
    List<UserModel> um;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycle_view, container, false);
        recyclerView=view.findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        um=getUserData();
        customAdapter=new CustomAdapter(um,getContext());
        recyclerView.setAdapter(customAdapter);
        return view;
    }

    public List<UserModel> getUserData(){
        RestEndpoint restEndpoint= RestClient.getClient(getContext()).create(RestEndpoint.class);
        List<UserModel> lum1=null;
        Call<List<UserModel>> clum = restEndpoint.getUserData();
        clum.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                lum1.addAll(response.body());
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Toast.makeText(getContext(),"Failed Fetching Data",Toast.LENGTH_LONG).show();
            }
        });
        return lum1;
    }
}