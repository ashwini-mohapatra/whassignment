package in.ashwinimohapatra.whassignment.model;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    int id;
    String name;
    ArrayList<String> subjects;
    ArrayList<String> qualifications;
    String profileImage;

    public UserModel(int id, String name, ArrayList<String> subjects, ArrayList<String> qualifications, String profileImage) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.qualifications = qualifications;
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

    public ArrayList<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(ArrayList<String> qualifications) {
        this.qualifications = qualifications;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
