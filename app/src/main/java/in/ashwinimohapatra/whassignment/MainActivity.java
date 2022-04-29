package in.ashwinimohapatra.whassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.FrameLayout;

import in.ashwinimohapatra.whassignment.ui.RecycleViewFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new RecycleViewFragment(),"UserData").commit();
    }
}