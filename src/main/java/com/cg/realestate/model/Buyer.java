package com.cg.realestate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Buyer {


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int buyerId;
		@Column//(unique=true)
	//	@NotNull
	//	@Pattern(regexp = "^[A-Za-z]*$",message = "Name must be alphabet")
		private String userName;
	    @Column 
		private String emailId;
			
		
		public Buyer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Buyer(String userName, String emailId) {
			super();
			this.userName = userName;
			this.emailId = emailId;
			
		}
		
		public int getUserId() {
			return buyerId;
		}
		public void setUserId(int userId) {
			this.buyerId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		

		@Override
		public String toString() {
			return "User [buyerId=" + buyerId + ", userName=" + userName + ", EmailId=" + emailId + "]";
		}
		
	
	
}
