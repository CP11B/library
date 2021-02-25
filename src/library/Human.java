package library;

public class Human {
	
	private int humanID;
	private String forename;
	private String surname;
	private String contactNumber;

	
	// parent class of human
    public Human(String forename, String surname, String contactNumber) {
    	this.forename = forename;
    	this.surname = surname;
    	this.contactNumber = contactNumber;
    	
    }
  
    // getters and setters
    public String getForename() {
    	return forename;
    }
    
    public void setForename(String forename) {
    	this.forename = forename;
    }
    
    public String getSurname() {
    	return surname;
    }
    
    public void setSurname(String surname) {
    	this.surname = surname;
    }
      
    public String getContactNumber() {
    	return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
    	this.contactNumber = contactNumber;
    }
    
    public int getHumanID() {
    	return humanID;
    }
    
    public void setHumanID(int humanID) {
    	this.humanID = humanID;
    }

	@Override
	public String toString() {
		return "Human [humanID = " + humanID + ", forename = " + forename + ", surname = " + surname + ", contactNumber = "
				+ contactNumber + "]";
	}
}
