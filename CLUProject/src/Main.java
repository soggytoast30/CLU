
public class Main {

	public static void main(String[] args) {
        // Collect and save the profile data
        Profile profile = questions.createProfile();
        String jsonFilePath = "profile.json";
        questions.saveProfileToJson(profile, jsonFilePath);

        // Analyze the saved profile data
        NLPProcessor.analyzeTextWithNLP(jsonFilePath);

	}

}
