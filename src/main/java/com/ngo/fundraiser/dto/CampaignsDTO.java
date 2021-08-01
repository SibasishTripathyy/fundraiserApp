package com.ngo.fundraiser.dto;

public class CampaignsDTO {

	private Long CampaignID; 
    private String Name;   
    private String ImageURL;
    private String Message;
    private String Target_Donation;
    private String Start_Date;
    private String End_Date;
    private String Status;
    private String CreatedBy;
    
    
	public CampaignsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(Long campaignID) {
		CampaignID = campaignID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getTarget_Donation() {
		return Target_Donation;
	}
	public void setTarget_Donation(String target_Donation) {
		Target_Donation = target_Donation;
	}
	public String getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}
	public String getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	@Override
	public String toString() {
		return "CampaignsDTO [CampaignID=" + CampaignID + ", Name=" + Name + ", ImageURL=" + ImageURL + ", Message="
				+ Message + ", Target_Donation=" + Target_Donation + ", Start_Date=" + Start_Date + ", End_Date="
				+ End_Date + ", Status=" + Status + ", CreatedBy=" + CreatedBy + "]";
	}
	
    
}
