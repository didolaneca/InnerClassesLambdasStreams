public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO
Create an education object. Schoo is NEIU, major is Computer Science.*/
        Resume.Education education = r.new Education("NEIU", "Computer Science");

       /* TODO
add this education object to the resume "r"*/
        r.addEducation(education);
        /* TODO
Create a new Experience object and add it to the resume.*/
        Resume.Experience experience = new Resume.Experience("Microsoft", 1998, 2021);
        r.addExperience(experience);
        r.addExperience(/* TODO
Create a new experience object on the fly, inside the addExperiece call.*/
        new Resume.Experience("Google", 1997, 2021)
        );
        r.addExperience(/* TODO
Add another experience object on the fly as you add it.*/
        new Resume.Experience("NASA", 1996, 2021)
        );
        System.out.println(r); //watch the resume print.
    }
}