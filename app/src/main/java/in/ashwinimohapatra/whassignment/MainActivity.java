package in.ashwinimohapatra.whassignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import in.ashwinimohapatra.whassignment.ui.RecycleViewFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new RecycleViewFragment(),"UserData").commit();
    }
}