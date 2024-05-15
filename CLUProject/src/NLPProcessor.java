import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Document.Type;
import com.google.cloud.language.v1.AnalyzeEntitiesResponse;
import com.google.cloud.language.v1.Entity;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class NLPProcessor {

	public static Profile readProfileJson(String filePath) {
		Gson gson = new Gson();
		try(FileReader reader = new FileReader(filePath)){
			return gson.fromJson(reader, Profile.class);
		}catch(IOException e) {
			System.err.println("Failed to read JSON file:"+ e.getMessage());
			return null;
		}
	}
	
	public static String combineText(Profile profile) {
		return profile.getWakeUpTime()+ " "+ profile.getWorkHours()+
				profile.getEveningRoutine()+" "+ profile.getEveningRoutine()+" "+
				profile.getMealSchedule()+" "+ profile.getPhysicalActivites()+" "+
				profile.getStressManagement()+" "+ profile.getSocialFrequency()+" "+
				profile.getFamilyCommitments()+" "+ profile.getWorkPriorities()+" "+
				profile.getPeakProductivty()+" "+ profile.getTaskManagement()+" "+
				profile.getFavoriteHobbies()+" "+ profile.getHobbyTime()+" "+
				profile.getAdjustToChanges()+" "+ profile.getSleepSchedule()+" "+
				profile.getSleepRoutines()+" "+ profile.getCoreValues()+" "+
				profile.getPersonalGoals()+" "+ profile.getLifeSatisfaction()+" "+
				profile.getLifeSatisfaction()+" "+profile.getImprovementAreas();
	}
	 public static void analyzeTextWithNLP(String jsonFilePath) {
	        Gson gson = new Gson();
	        try (FileReader reader = new FileReader(jsonFilePath)) {
	            Profile profile = gson.fromJson(reader, Profile.class);
	            String combinedText = combineText(profile);// Combine more fields as needed

	            try (LanguageServiceClient language = LanguageServiceClient.create()) {
	                Document doc = Document.newBuilder()
	                                       .setContent(combinedText)
	                                       .setType(Type.PLAIN_TEXT)
	                                       .build();
	                AnalyzeEntitiesResponse response = language.analyzeEntities(doc);
	                for (Entity entity : response.getEntitiesList()) {
	                    System.out.println("Entity: " + entity.getName() + " Type: " + entity.getType());
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error processing NLP or reading JSON: " + e.getMessage());
	        }
	    }
	    public static void profileToJsonFile(Profile profile, String filePath) {
	        Gson gson = new Gson();
	        try (FileWriter writer = new FileWriter(filePath)) {
	            gson.toJson(profile, writer);
	        } catch (IOException e) {
	            System.err.println("Error writing profile to file: " + e.getMessage());
	        }
	    }
}
