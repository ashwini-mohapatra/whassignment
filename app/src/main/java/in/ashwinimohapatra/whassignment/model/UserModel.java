package in.ashwinimohapatra.whassignment.model;

import java.util.List;

public class UserModel {
    int id;
    String name;
    List<String> subjects;
    List<String> qualifications;
    String profileImage;

    public UserModel(int id, String name, List<String> subjects, List<String> qualifications, String profileImage) {
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<String> qualifications) {
        this.qualifications = qualifications;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
