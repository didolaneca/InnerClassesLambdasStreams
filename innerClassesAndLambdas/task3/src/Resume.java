import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
    /* Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.*/
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

    /* Create a member variable of type Person (exactly as in task 2)*/
    private Person person;

    /* Create a List to hold values of type Education (exactly as in task 2) */
    private List<Education> educationList;

    /* Create a Priority Queue that holds values of type Experience.*/
    private PriorityQueue<Experience> experienceByPriority;
    public Resume(Person p){
        /* Assign a value to the Person variable.
           Initialize the List with Education objects.
           Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.*/
        this.person = p;
        this.educationList = new ArrayList<>();
        this.experienceByPriority = new PriorityQueue<Experience>((experience1, experience2) -> experience2.toYear - experience1.toYear);
    }

        /* Add a standard getter for the experiences. getExperience. it should return a priority queue.
        Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)*/

    public PriorityQueue<Experience> getExperience() {
        return this.experienceByPriority;
    }

    public void addExperience(Experience experience){
        this.experienceByPriority.add(experience);
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
        for (Experience experience : experienceByPriority) {
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
