package in.ashwinimohapatra.whassignment.model;
import java.util.ArrayList;

public class UserModel {
    int id;
    String name;
    ArrayList<String> subjects;
    ArrayList<String> qualification;
    String profileImage;

    public UserModel(int id, String name, ArrayList<String> subjects, ArrayList<String> qualification, String profileImage) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.qualification = qualification;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public ArrayList<String> getQualification() {
        return qualification;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
