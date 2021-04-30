public class Task {
    public static void main(String[] args){
/* This code is exactly the same as in Task 3 and should yield the same output.*/
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /*  Create an education object. School is NEIU, major is Computer Science.*/
        Resume.Education education = r.new Education("NEIU", "Computer Science");

        /* add this education object to the resume "r"*/
        r.addEducation(education);

        /* Create a new Experience object and add it to the resume.*/
        Resume.Experience experience = new Resume.Experience("Microsoft", 1998, 2021);
        r.addExperience(experience);
        r.addExperience(/* Create a new experience object on the fly, inside the addExperiece call.*/
                new Resume.Experience("Google", 1997, 2021)
        );
        r.addExperience(
                new Resume.Experience("NASA", 1996, 2021)
        );
        System.out.println(r);
    }
}