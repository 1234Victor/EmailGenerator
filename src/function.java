
public class function {
	public static String printTextTutorLong(String tutorName, String tuteeName, String startTime, String endTime, String MA, String date, int classTime, int rewardTime) {
		return ("Hi there,\r\n" + 
				"\r\n" + 
				"This is long-term tutoring, this time is from "+startTime + " "+ MA+ " to "+ endTime+ " " +MA+" on "+ date+".\r\n" + 
				"PLEASE BE PUNCTUAL.\r\n" + 
				"\r\n" + 
				"zoom Link:\r\n" + 
				"https://us02web.zoom.us/j/5450880275?pwd=QTVYeUQzUEtkQ2llUzNlV0hkdDhpdz09\r\n" + 
				"Password: 123456\r\n" + 
				"After you join, we will assign you to a breakout room.\r\n" + 
				"\r\n" + 
				"Tutor's name: "+tutorName+"\r\n"+ 
				"Tutee’s Name: "+tuteeName+"\r\n" + 
				"\r\n" + 
				"Reward: "+classTime+" minutes volunteer hour(s) plus up to "+rewardTime+" mins bonus(based on tutee’s rating)\r\n" + 
				"Please contact us if you have any questions. Thank you.\r\n" + 
				"\r\n" + 
				"Sincerely,\r\n" + 
				"Semi Study Circle");
	}
	
	public static String printTextTuteeLong(String tutorName, String tuteeName, String startTime, String endTime, String MA, String date) {
		return ("Hi there,\r\n" + 
				"\r\n" + 
				"This is long-term tutoring, this time is from "+startTime+ " "+MA+ " to " + endTime+" "+ MA+" on "+ date+".\r\n" + 
				"PLEASE BE PUNCTUAL.\r\n" + 
				"\r\n" + 
				"zoom Link:\r\n" + 
				"https://us02web.zoom.us/j/5450880275?pwd=QTVYeUQzUEtkQ2llUzNlV0hkdDhpdz09\r\n" + 
				"Password: 123456\r\n" + 
				"After you join, we will assign you to a breakout room\r\n" + 
				"\r\n" + 
				"Tutee's Name: "+tuteeName+"\r\n" + 
				"Tutor’s Name: "+tutorName+"\r\n" + 
				"\r\n" + 
				"You would receive a reflection form once a month to evaluate the tutoring quality, if you have any questions, please just email us directly.\r\n" + 
				"\r\n" + 
				"Please contact us if you have any questions. Thank you.\r\n" + 
				"\r\n" + 
				"Sincerely,\r\n" + 
				"Semi Study Circle");
	}
	public static String printTextTutorFirst(String tutorName, String tuteeName, String startTime, String endTime, String MA, String date, int classTime, int rewardTime) {
		return ("Hi there,\r\n" + 
				"\r\n" + 
				"You have been successfully paired up with a tutee! Tutoring time is from "+startTime+ " "+MA+ " to " + endTime+" "+ MA+" on "+ date+".\r\n" + 
				"PLEASE BE PUNCTUAL.\r\n" + 
				"\r\n" + 
				"zoom Link:\r\n" + 
				"https://us02web.zoom.us/j/5450880275?pwd=QTVYeUQzUEtkQ2llUzNlV0hkdDhpdz09\r\n" + 
				"Password: 123456\r\n" + 
				"After you join, we will assign you to a breakout room\r\n" + 
				"\r\n" + 
				"Tutor's name: "+tutorName+"\r\n"+
				"Here below is the tutee's information:\r\n" + 
				"Tutee’s Name: "+tuteeName+"\r\n" + 
				"(If this is the first time for teaching this student, we suggest you exchange contact information and get to know each other better)\r\n" + 
				"(Please remind your tutee at the end of the class that he/she needs to fill out a reflection and schedule confirmation form which we would send him/her later. The form could be used to confirm the future schedule and the tutee’s rating would affect your volunteer hours.)\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Reward: "+classTime+" minutes volunteer hour(s) plus up to "+rewardTime+" mins bonus(based on tutee’s rating)\r\n" + 
				"\r\n" + 
				"Please contact us if you have any questions. Thank you.\r\n" + 
				"\r\n" + 
				"Sincerely,\r\n" + 
				"Semi Study Circle");
	}
	public static String printTextTuteeFirst(String tutorName, String tuteeName, String startTime, String endTime, String MA, String date) {
		return ("Hi there,\r\n" + 
				"\r\n" + 
				"You have been successfully paired up with a tutor! Tutoring time is from "+startTime+" "+MA+" to "+endTime+" "+MA+" on "+date+".\r\n" + 
				"PLEASE BE PUNCTUAL.\r\n" + 
				"\r\n" + 
				"zoom Link:\r\n" + 
				"https://us02web.zoom.us/j/5450880275?pwd=QTVYeUQzUEtkQ2llUzNlV0hkdDhpdz09\r\n" + 
				"Password: 123456\r\n" + 
				"After you join, we will assign you to a breakout room\r\n" + 
				"\r\n" + 
				"Tutee's Name: "+tuteeName+"\r\n" + 
				"\r\n" + 
				"Here below is the tutor's information:\r\n" + 
				"Tutor’s Name: "+tutorName+"\r\n" + 
				"School & Grade: (.............)\r\n" + 
				"Email: (.............) \r\n" + 
				"\r\n" + 
				"After the meeting, you will fill out a feedback form to evaluate the quality of the tutoring.\r\n" + 
				"\r\n" + 
				"Please contact us if you have any questions. Thank you.\r\n" + 
				"\r\n" + 
				"Sincerely,\r\nSemi Study Circle");
	}
	public static String printPairing(String tuteeName, String tuteeEmail) {
		return("Hi,\r\n" + 
				"We are planning to pair you up with a tutee who needs help with (...subject...) (Tutee name: "+tuteeName+"). Please let us know if you are interested in tutoring this tutee. If yes, please contact this tutee's parent to confirm the session time. ("+tuteeEmail+")\r\n" + 
				"\r\n" + 
				"Sincerely,\r\n" + 
				"Semi Study Circle");
	}
	public static String printVolunteerHour(String tutorName, String hour) {
		return("Hi, \r\n" + 
				"\r\n" + 
				"Thank you for your participation in our program throughout the school year 2020-2021. \r\n" + 
				"Here’s your annual report:\r\n" + 
				"\r\n" + 
				"Name: "+tutorName+"\r\n" + 
				"Accumulated volunteer hour(s): "+hour+"\r\n" + 
				"Your certificate is attached to this email.\r\n" + 
				"Please contact us if you have any questions or want to exchange the volunteer hours. \r\n" + 
				"\r\n" + 
				"Thank you, have a good summer\r\n" + 
				"Sincerely,\r\n" + 
				"Semi Study Circle\r\n" + 
				"");
	}
}
