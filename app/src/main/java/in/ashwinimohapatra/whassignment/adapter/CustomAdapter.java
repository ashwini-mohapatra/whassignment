package in.ashwinimohapatra.whassignment.adapter;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import in.ashwinimohapatra.whassignment.R;
import in.ashwinimohapatra.whassignment.model.UserModel;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    ArrayList<UserModel> um=new ArrayList<>();
    Context context;

    public CustomAdapter(ArrayList<UserModel> um,Context context) {
        this.um = um;
        this.context=context;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.recycle_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        UserModel userModel=um.get(position);
        Log.i("Check 1",userModel.getName());
        holder.name.setText(userModel.getName());
        Log.i("Check 1",userModel.getSubjects().toString());
        holder.subjects.setText(arrayToString(userModel.getSubjects()));
        Log.i("Check 1",userModel.getQualification().toString());
        holder.qualification.setText(arrayToString(userModel.getQualification()));
        Log.i("Check 1",userModel.getProfileImage());
        Glide.with(context).load(userModel.getProfileImage()).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return um.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView subjects;
        private final TextView qualification;
        private final ImageView profileImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView5);
            subjects = itemView.findViewById(R.id.textView2);
            qualification = itemView.findViewById(R.id.textView3);
            profileImage = itemView.findViewById(R.id.imageView2);
        }
    }

    public String arrayToString(ArrayList<String> als){
        int l=als==null?0:als.size();
        Log.i("Check 2", String.valueOf(l));
        String res="";
        for(int i=0;i<l;i++){
            res=res+als.get(i).toString()+"\n";
        }
        return res;
    }
}
