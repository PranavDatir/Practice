package day4.beans;

public class UserValidator {
	public static boolean isValid(User currentUser) {
		boolean success = false;
		String currentUserId = currentUser.getUserId();
		String currentPassword = currentUser.getPassword();
		if(currentUserId.equals("admin") && currentPassword.equals("password")) {
			success = true;
		}
		return success;
	}
}
