import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class questions {
	
	public static Profile createProfile() {
	
		 	Scanner scanner = new Scanner(System.in);

		 	System.out.print("Name:");
		 	String name = scanner.nextLine();
		 	
		 	System.out.print("Age:");
		 	String age = scanner.nextLine();
		 	
	        // Daily Routines
	        System.out.print("What time do you typically wake up, and what is your morning routine? ");
	        String wakeUpTime = scanner.nextLine();

	        System.out.print("How do you spend your work or study hours? Include start and end times. ");
	        String workHours = scanner.nextLine();

	        System.out.print("What does your evening routine look like before bed? ");
	        String eveningRoutine = scanner.nextLine();

	        // Health and Wellness
	        System.out.print("Describe your typical meals and eating schedule throughout the day. ");
	        String mealSchedule = scanner.nextLine();

	        System.out.print("What type of physical activities or exercises do you engage in regularly? ");
	        String physicalActivites = scanner.nextLine();

	        System.out.print("How do you incorporate relaxation or stress management into your day? ");
	        String stressManagement = scanner.nextLine();

	        // Social Interactions
	        System.out.print("How often do you engage in social activities, and what are these activities? ");
	        String socialFrequency = scanner.nextLine();

	        System.out.print("Do you have regular commitments with friends or family? What are they? ");
	        String familyCommitments = scanner.nextLine();

	        // Work and Productivity
	        System.out.print("What are your main work or study priorities? ");
	        String workPriorities = scanner.nextLine();

	        System.out.print("Are there specific times when you feel most productive? ");
	        String peakProductivty = scanner.nextLine();

	        System.out.print("How do you organize and manage your tasks? ");
	        String taskManagement = scanner.nextLine();

	        // Leisure and Hobbies
	        System.out.print("What hobbies or leisure activities do you enjoy the most? ");
	        String favoriteHobbies = scanner.nextLine();

	        System.out.print("How much time do you wish to allocate to these activities each week? ");
	        String hobbyTime = scanner.nextLine();

	        // Decision-Making
	        System.out.print("How do you decide what tasks or activities to prioritize each day? ");
	        String priorityDecisions = scanner.nextLine();

	        System.out.print("How do you adjust your schedule when unexpected changes occur? ");
	        String adjustToChanges = scanner.nextLine();

	        // Sleep Patterns
	        System.out.print("What time do you typically go to bed and wake up? ");
	        String sleepSchedule = scanner.nextLine();

	        System.out.print("Do you follow any specific routines to ensure a good night's sleep? ");
	        String sleepRoutines = scanner.nextLine();

	        // Personal Values and Goals
	        System.out.print("What are your key values, and how do they influence your daily activities? ");
	        String coreValues = scanner.nextLine();

	        System.out.print("What short-term and long-term goals are you working towards? ");
	        String personalGoals = scanner.nextLine();

	        // Self-Reflection
	        System.out.print("In what areas of your life do you feel most satisfied? ");
	        String lifeSatisfaction = scanner.nextLine();

	        System.out.print("What aspects of your routine do you think need improvement? ");
	        String improvementAreas = scanner.nextLine();

	        // Return a new Profile object with all the collected data
	        Profile profile = new Profile(
	            name,age,wakeUpTime, workHours, eveningRoutine,
	            mealSchedule, physicalActivites, stressManagement,
	            socialFrequency, familyCommitments,
	            workPriorities, peakProductivty, taskManagement,
	            favoriteHobbies, hobbyTime,
	            priorityDecisions, adjustToChanges,
	            sleepSchedule, sleepRoutines,
	            coreValues, personalGoals,
	            lifeSatisfaction, improvementAreas
	        );
	        return profile;
	}
	
    public static void saveProfileToJson(Profile profile, String filePath) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(profile, writer);
            System.out.println("Profile saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to save JSON file: " + e.getMessage());
        }
    }

}


