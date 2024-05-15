
public class Profile {
	
	
	
	private String name;
	private String age;
	
	
	
	//daily routines
	private String wakeUpTime;
	private String workHours;
	private String eveningRoutine;
	
	
	
	//health
	private String mealSchedule;
	private String physicalActivites;
	private String stressManagement;
	
	
	//social
	private String socialFrequency;
	private String familyCommitments;
	
	
	
	//work
	private String workPriorities;
	private String peakProductivty;
	private String taskManagement;
	
	
	//hobbies
	private String favoriteHobbies;
	private String hobbyTime;
	
	
	//decision making
	private String priorityDecisions;
	private String adjustToChanges;
	
	
	//sleep
	private String sleepSchedule;
	private String sleepRoutines;
	
	
	//values
	private String coreValues;
	private String personalGoals;
	
	
	//self-refection
	private String lifeSatisfaction;
	private String improvementAreas;
	
	// Constructor
		public Profile(String name, String age,
			String wakeUpTime, String workHours, String eveningRoutine,
			String mealSchedule, String physicalActivites, String stressManagement,
			String socialFrequency,String familyCommitments,
			String workPriorities, String peakProductivty, String taskManagement,
			String favoriteHobbies, String hobbyTime,
			String priorityDecisions, String adjustToChanges,
			String sleepSchedule, String sleepRoutines,
			String coreValues, String personalGoals, String lifeSatisfaction, String improvementAreas) {
			
			
			
			this.name = name;
			
			this.age = age;
			
			this.wakeUpTime = wakeUpTime;
			
			this.workHours = workHours;
			
			this.eveningRoutine = eveningRoutine;
			
			this.mealSchedule = mealSchedule;
			
			this.physicalActivites = physicalActivites;
			
			this.stressManagement = stressManagement;
			
			this.socialFrequency = socialFrequency;
			
			this.familyCommitments = familyCommitments;
			
			this.workPriorities = workPriorities;
			
			this.peakProductivty = peakProductivty;
			
			this.taskManagement = taskManagement;
			
			this.favoriteHobbies = favoriteHobbies;
			
			this.hobbyTime = hobbyTime;
			
			this.priorityDecisions = priorityDecisions;
			
			this.adjustToChanges = adjustToChanges;
			
			this.sleepSchedule = sleepSchedule;
			
			this.sleepRoutines = sleepRoutines;
			
			this.coreValues = coreValues;
			
			this.personalGoals = personalGoals;
			
			this.lifeSatisfaction = lifeSatisfaction;
			
			this.improvementAreas = improvementAreas;
			
			
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the age
		 */
		public String getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(String age) {
			this.age = age;
		}

		/**
		 * @return the wakeUpTime
		 */
		public String getWakeUpTime() {
			return wakeUpTime;
		}

		/**
		 * @param wakeUpTime the wakeUpTime to set
		 */
		public void setWakeUpTime(String wakeUpTime) {
			this.wakeUpTime = wakeUpTime;
		}

		/**
		 * @return the workHours
		 */
		public String getWorkHours() {
			return workHours;
		}

		/**
		 * @param workHours the workHours to set
		 */
		public void setWorkHours(String workHours) {
			this.workHours = workHours;
		}

		/**
		 * @return the eveningRoutine
		 */
		public String getEveningRoutine() {
			return eveningRoutine;
		}

		/**
		 * @param eveningRoutine the eveningRoutine to set
		 */
		public void setEveningRoutine(String eveningRoutine) {
			this.eveningRoutine = eveningRoutine;
		}

		/**
		 * @return the mealSchedule
		 */
		public String getMealSchedule() {
			return mealSchedule;
		}

		/**
		 * @param mealSchedule the mealSchedule to set
		 */
		public void setMealSchedule(String mealSchedule) {
			this.mealSchedule = mealSchedule;
		}

		/**
		 * @return the physicalActivites
		 */
		public String getPhysicalActivites() {
			return physicalActivites;
		}

		/**
		 * @param physicalActivites the physicalActivites to set
		 */
		public void setPhysicalActivites(String physicalActivites) {
			this.physicalActivites = physicalActivites;
		}

		/**
		 * @return the stressManagement
		 */
		public String getStressManagement() {
			return stressManagement;
		}

		/**
		 * @param stressManagement the stressManagement to set
		 */
		public void setStressManagement(String stressManagement) {
			this.stressManagement = stressManagement;
		}

		/**
		 * @return the socialFrequency
		 */
		public String getSocialFrequency() {
			return socialFrequency;
		}

		/**
		 * @param socialFrequency the socialFrequency to set
		 */
		public void setSocialFrequency(String socialFrequency) {
			this.socialFrequency = socialFrequency;
		}

		/**
		 * @return the familyCommitments
		 */
		public String getFamilyCommitments() {
			return familyCommitments;
		}

		/**
		 * @param familyCommitments the familyCommitments to set
		 */
		public void setFamilyCommitments(String familyCommitments) {
			this.familyCommitments = familyCommitments;
		}

		/**
		 * @return the workPriorities
		 */
		public String getWorkPriorities() {
			return workPriorities;
		}

		/**
		 * @param workPriorities the workPriorities to set
		 */
		public void setWorkPriorities(String workPriorities) {
			this.workPriorities = workPriorities;
		}

		/**
		 * @return the peakProductivty
		 */
		public String getPeakProductivty() {
			return peakProductivty;
		}

		/**
		 * @param peakProductivty the peakProductivty to set
		 */
		public void setPeakProductivty(String peakProductivty) {
			this.peakProductivty = peakProductivty;
		}

		/**
		 * @return the taskManagement
		 */
		public String getTaskManagement() {
			return taskManagement;
		}

		/**
		 * @param taskManagement the taskManagement to set
		 */
		public void setTaskManagement(String taskManagement) {
			this.taskManagement = taskManagement;
		}

		/**
		 * @return the favoriteHobbies
		 */
		public String getFavoriteHobbies() {
			return favoriteHobbies;
		}

		/**
		 * @param favoriteHobbies the favoriteHobbies to set
		 */
		public void setFavoriteHobbies(String favoriteHobbies) {
			this.favoriteHobbies = favoriteHobbies;
		}

		/**
		 * @return the hobbyTime
		 */
		public String getHobbyTime() {
			return hobbyTime;
		}

		/**
		 * @param hobbyTime the hobbyTime to set
		 */
		public void setHobbyTime(String hobbyTime) {
			this.hobbyTime = hobbyTime;
		}

		/**
		 * @return the priorityDecisions
		 */
		public String getPriorityDecisions() {
			return priorityDecisions;
		}

		/**
		 * @param priorityDecisions the priorityDecisions to set
		 */
		public void setPriorityDecisions(String priorityDecisions) {
			this.priorityDecisions = priorityDecisions;
		}

		/**
		 * @return the adjustToChanges
		 */
		public String getAdjustToChanges() {
			return adjustToChanges;
		}

		/**
		 * @param adjustToChanges the adjustToChanges to set
		 */
		public void setAdjustToChanges(String adjustToChanges) {
			this.adjustToChanges = adjustToChanges;
		}

		/**
		 * @return the sleepSchedule
		 */
		public String getSleepSchedule() {
			return sleepSchedule;
		}

		/**
		 * @param sleepSchedule the sleepSchedule to set
		 */
		public void setSleepSchedule(String sleepSchedule) {
			this.sleepSchedule = sleepSchedule;
		}

		/**
		 * @return the sleepRoutines
		 */
		public String getSleepRoutines() {
			return sleepRoutines;
		}

		/**
		 * @param sleepRoutines the sleepRoutines to set
		 */
		public void setSleepRoutines(String sleepRoutines) {
			this.sleepRoutines = sleepRoutines;
		}

		/**
		 * @return the coreValues
		 */
		public String getCoreValues() {
			return coreValues;
		}

		/**
		 * @param coreValues the coreValues to set
		 */
		public void setCoreValues(String coreValues) {
			this.coreValues = coreValues;
		}

		/**
		 * @return the personalGoals
		 */
		public String getPersonalGoals() {
			return personalGoals;
		}

		/**
		 * @param personalGoals the personalGoals to set
		 */
		public void setPersonalGoals(String personalGoals) {
			this.personalGoals = personalGoals;
		}

		/**
		 * @return the lifeSatisfaction
		 */
		public String getLifeSatisfaction() {
			return lifeSatisfaction;
		}

		/**
		 * @param lifeSatisfaction the lifeSatisfaction to set
		 */
		public void setLifeSatisfaction(String lifeSatisfaction) {
			this.lifeSatisfaction = lifeSatisfaction;
		}

		/**
		 * @return the improvementAreas
		 */
		public String getImprovementAreas() {
			return improvementAreas;
		}

		/**
		 * @param improvementAreas the improvementAreas to set
		 */
		public void setImprovementAreas(String improvementAreas) {
			this.improvementAreas = improvementAreas;
		}
		
		
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
