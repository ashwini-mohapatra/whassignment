package in.ashwinimohapatra.whassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import in.ashwinimohapatra.whassignment.ui.RecycleViewFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame,new RecycleViewFragment(),"UserData").commit();
    }
}