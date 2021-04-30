import java.util.ArrayList;
import java.util.List;

public class Resume {
/* TODO
Create a public member inner class Education according to the specifications.*/

    public class Education {
        String major, school;

        public Education(String school, String major) {
            this.major = major;
            this.school = school;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        @Override
        public String toString() {
            return  major + " at " + school;
        }
    }
    /* TODO
Create a public static inner class called Experience, according to the specifications.*/
    public static class Experience {
        String jobTitle;
        int startYear, toYear;

        public Experience(String jobTitle, int startYear, int toYear) {
            this.jobTitle = jobTitle;
            this.startYear = startYear;
            this.toYear = toYear;
        }

        @Override
        public String toString() {
            return this.startYear + " - " + this.toYear + " : " + this.jobTitle;
        }
    }
/* TODO
Create the Person and List of Education and List of experience objects. They should be private.*/
    private Person person;
    private List<Education> educationList;
    private List<Experience> experienceList;
    public Resume(Person p){
/* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work.*/
        this.person = p;
        this.educationList = new ArrayList<>();
        this.experienceList =  new ArrayList<>();
    }

/* TODO
Create the addEducation, addExperience and override the toString methods as specified.*/
    public void addExperience(Experience experience){
        this.experienceList.add(experience);
    }

    public void addEducation(Education education){
        this.educationList.add(education);
    }

    //Needs to be testes and fixed in proper format
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer()
                .append(this.person.toString())
                .append("\nExperience");
        for (Experience experience : experienceList) {
            result.append("\n").append(experience);
        }
        result
                .append("\nEducation");
        for (Education education : educationList) {
            result.append("\n").append(education);
        }
        return result.toString();
    }
}
