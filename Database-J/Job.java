
import java.util.HashMap;

public class Job {

    HashMap<String, HashMap<String, Integer>> JobType = new HashMap<>();
    HashMap<String, Integer> HealthcareJobs = new HashMap<>();
    HashMap<String, Integer> FieldJobs = new HashMap<>();
    HashMap<String, Integer> TechJobs = new HashMap<>();


    public Job() {
        JobType.put("Field Jobs", FieldJobs);
        FieldJobs.put("Farmer", 30);
        FieldJobs.put("Construction Worker", 45);
        FieldJobs.put("Electrician", 35);
        FieldJobs.put("Plumber", 45);
        JobType.put("Healthcare Jobs", HealthcareJobs);
        HealthcareJobs.put("Doctor", 100);
        HealthcareJobs.put("Nurse", 60);
        HealthcareJobs.put("Pharmacist", 50);
        JobType.put("Tech Jobs", TechJobs);
        TechJobs.put("Software Engineer", 80);
        TechJobs.put("Data Scientist", 90);
        TechJobs.put("System Administrator", 70);
        TechJobs.put("Web Developer", 75);
        TechJobs.put("Cybersecurity Specialist", 85);
        TechJobs.put("AI Engineer", 95);
    }

}
