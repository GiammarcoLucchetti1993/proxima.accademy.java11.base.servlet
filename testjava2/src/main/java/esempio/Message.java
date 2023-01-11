/**
 *
 */
package esempio;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Common Message class represents Message object to exchange client-server
 * applications
 * 
 * @author maurizio.franco@ymail.com
 *
 */
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String text;
	// time whenever user insert text message(on own client)
	private LocalDateTime userInsertedTime;
	// time whenever server receives message from client
	private LocalDateTime serverReceivedTime;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the userInsertedTime
	 */
	public LocalDateTime getUserInsertedTime() {
		return userInsertedTime;
	}

	/**
	 * @param userInsertedTime the userInsertedTime to set
	 */
	public void setUserInsertedTime(LocalDateTime userInsertedTime) {
		this.userInsertedTime = userInsertedTime;
	}

	/**
	 * @return the serverReceivedTime
	 */
	public LocalDateTime getServerReceivedTime() {
		return serverReceivedTime;
	}

	/**
	 * @param serverReceivedTime the serverReceivedTime to set
	 */
	public void setServerReceivedTime(LocalDateTime serverReceivedTime) {
		this.serverReceivedTime = serverReceivedTime;
	}

	@Override
	public String toString() {
		String s = userName + " - " + text + " - ";
		
		if(userInsertedTime != null) {
			s += userInsertedTime.format(DateTimeFormatter.ofPattern(Constants.DATE_TIME_FORMAT_PATTERN)) + " - "; 
		} 
		if(serverReceivedTime != null) {
			s += serverReceivedTime.format(DateTimeFormatter.ofPattern(Constants.DATE_TIME_FORMAT_PATTERN));
		} 
		
		return s;
	}

}
