package TeoDor.week_6;

public class String_PasswordValidation {
   /** 1. Write a return method that can verify if a password is valid or not.
    requirements:
            1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

    */
   public static boolean is_valid(String password) {

       boolean has6CharAndNoSpace = password.length() >= 6 && !password.contains(" ");//length > 6 & not contains space
       boolean hasUpperCaseLetter = false;  // has Upper case letter
       boolean hasLowerCaseLetter = false;  // has lower case letter
       boolean hasDigit = false;            // has Digit
       boolean hasSpecialCharacter = false; // has Special Character

       for (char eachLetter : password.toCharArray()) {//transfer String password in Array of Char & get each letter as Char in order to be compared by Java with ASKI Table

           if (Character.isUpperCase(eachLetter)) {// autoboxing to Character wrapper class in order to use isUpperCase() method and to check in ASKI Table if each element is upper case.
               hasUpperCaseLetter = true;// if element is upper case assign "true" value to boolean hasUpperCaseLetter

           } else if (Character.isLowerCase(eachLetter)) {// autoboxing to Character wrapper class in order to use isLowerCase() method and to check in ASKI Table if element is lower case.
               hasLowerCaseLetter = true;// if element is lower case assign "true" value to boolean hasLowerCaseLetter

           } else if (Character.isDigit(eachLetter)) {// autoboxing to Character wrapper class in order to use isDigit() method and to check in ASKI Table if element is digit.
               hasDigit = true;// if element is digit assign "true" value to boolean hasDigit

           } else { //because ASKI Table has only UpperCaseLetters, LowerCaseLetters, Digits and SpecialCharacters, and we already chcked first 3 of them, we don`t need to show Java what to check in "else" bloc
               hasSpecialCharacter = true;// if element is upper case assign "true" value to boolean hasLowerCaseLetter
           }
       }
       //in order to be valid all conditions must be "true", in this boolean isValid will check all 5 condition together
       boolean isValid = has6CharAndNoSpace && hasUpperCaseLetter && hasLowerCaseLetter && hasDigit && hasSpecialCharacter;

       System.out.println(isValid);
       return isValid;
   }
   public static void main(String[] args) {

       is_valid("Cydeo13!");
    }
}
