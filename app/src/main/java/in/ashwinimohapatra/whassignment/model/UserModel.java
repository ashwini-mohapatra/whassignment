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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getQualification() {
        return qualification;
    }

    public void setQualification(ArrayList<String> qualification) {
        this.qualification = qualification;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
