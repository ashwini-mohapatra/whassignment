package in.ashwinimohapatra.whassignment.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

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
        Log.i("Check 1",um.get(position).getName());
        holder.name.setText(um.get(position).getName());
//        String qual="";
//        for(int i=0;i<um.get(position).getQualifications().size();i++){
//            qual=qual+" "+um.get(position).getQualifications().get(i);
//        }
//        holder.qualification.setText(qual);
//        String subj="";
//        for(int j=0;j<um.get(position).getSubjects().size();j++){
//            subj=subj+" "+um.get(position).getSubjects().get(j);
//        }
//        holder.subjects.setText(subj);
        Glide.with(context).load(um.get(position).getProfileImage()).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return um.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,subjects,qualification;
        private ImageView profileImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView5);
            subjects = itemView.findViewById(R.id.textView6);
            qualification = itemView.findViewById(R.id.textView7);
            profileImage = itemView.findViewById(R.id.imageView2);
        }
    }
}
