package in.ashwinimohapatra.whassignment.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import in.ashwinimohapatra.whassignment.R;
import in.ashwinimohapatra.whassignment.adapter.CustomAdapter;
import in.ashwinimohapatra.whassignment.model.UserModel;
import in.ashwinimohapatra.whassignment.restclient.HttpsTrustManager;
import in.ashwinimohapatra.whassignment.restclient.RestClient;
import in.ashwinimohapatra.whassignment.restclient.RestEndpoint;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecycleViewFragment extends Fragment {


    CustomAdapter customAdapter;
    ArrayList<UserModel> um=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycle_view, container, false);
        HttpsTrustManager.allowAllSSL();
        RecyclerView recyclerView = view.findViewById(R.id.recycle);
        RestEndpoint restEndpoint= RestClient.getClient(view.getContext()).create(RestEndpoint.class);
        Call<ArrayList<UserModel>> clum = restEndpoint.getUserData();
        clum.enqueue(new Callback<ArrayList<UserModel>>() {
            @Override
            public void onResponse(Call<ArrayList<UserModel>> call, Response<ArrayList<UserModel>> response) {
                for(int i=0;i<response.body().size();i++){
                    um.add(response.body().get(i));
                    Log.i("Check","Check "+i);
                    Log.i("Check",um.toString());
                }
                customAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ArrayList<UserModel>> call, Throwable t) {
                Toast.makeText(getContext(),"Failed Fetching Data",Toast.LENGTH_LONG).show();
            }
        });
//        um.addAll(getUserData());
        Log.i("Check","Array Updated");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        customAdapter=new CustomAdapter(um,view.getContext());
        recyclerView.setAdapter(customAdapter);
        return view;
    }
}