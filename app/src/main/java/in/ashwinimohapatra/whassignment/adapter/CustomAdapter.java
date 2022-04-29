package in.ashwinimohapatra.whassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import in.ashwinimohapatra.whassignment.R;
import in.ashwinimohapatra.whassignment.model.UserModel;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private List<UserModel> um;
    Context context;
    public CustomAdapter(List<UserModel> um,Context context) {
        this.um = um;
        this.context=context;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        holder.name.setText(um.get(position).getName());
        holder.qualification.setText(um.get(position).getQualifications().get(0));
        holder.subjects.setText(um.get(position).getSubjects().get(position));
        Glide.with(context).load(um.get(position).getProfileImage()).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return um.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,subjects,qualification;
        private ImageView profileImage;
        private Button viewMore;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textView5);
            subjects = (TextView) itemView.findViewById(R.id.textView6);
            qualification = (TextView) itemView.findViewById(R.id.textView7);
            profileImage = (ImageView) itemView.findViewById(R.id.imageView2);
        }

        public TextView getName() {
            return name;
        }

        public void setName(TextView name) {
            this.name = name;
        }

        public TextView getSubjects() {
            return subjects;
        }

        public void setSubjects(TextView subjects) {
            this.subjects = subjects;
        }

        public TextView getQualification() {
            return qualification;
        }

        public void setQualification(TextView qualification) {
            this.qualification = qualification;
        }

        public ImageView getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(ImageView profileImage) {
            this.profileImage = profileImage;
        }

        public Button getViewMore() {
            return viewMore;
        }

        public void setViewMore(Button viewMore) {
            this.viewMore = viewMore;
        }
    }
}
