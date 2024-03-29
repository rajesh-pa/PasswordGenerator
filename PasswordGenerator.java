import java.util.*;     // Using util since random method is used
public class PasswordGenerator
{
		public static void main(String[] args)
		{
			int len = 10;    // Length of the password
			System.out.println(randomPassword(len));
		}

		static char[] randomPassword(int length)    // Using static because no need to create any object
		{
			System.out.print("Password Generated!!! Your password is : ");

			// Password created using UPPERCASE, LOWERCASE, NUMBERS and certain SYMBOLS
			String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowerCase = "abcdefghijklmnopqrstuvwxyz";
			String digits = "0123456789";
			String symbols = "!@#$%^&*_=+-/.?<>)";

			String pswd = upperCase + lowerCase + digits + symbols; //Combining all cases to one variable

			// Random method is used
			Random rnd_gen = new Random();

			char[] password = new char[length];

			for (int i = 0; i < length; i++)
			{
				// charAt() method is used to fetch character values from the string variable
				// nextInt() method is used as it will scan the value as int
				password[i] = pswd.charAt(rnd_gen.nextInt(pswd.length()));
			}
			return password;
		}
	}