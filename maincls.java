package collections;

class maincls {
 public static void main(String[] args) { 
	 int upper=0,lower=0,digit=0,space=0,symbol=0;
	 String str = "Dear Studentstuu @2027"; 
	 for(char c:str.toCharArray()) {
		 if(Character.isUpperCase(c)) {
			 upper++;
		 }
		 else if(Character.isLowerCase(c)) {
			 lower++;
		 }
		 else if(Character.isDigit(c)) {
			 digit++;
		 }
		 else if(Character.isSpace(c)) {
			 space++;
		 }
		 else {
			 symbol++;
		 }
	 }
	 System.out.println("Uppercase : "+upper); 
	 System.out.println("Lowercase : "+lower); 
	 System.out.println("Digit : "+digit); 
	 System.out.println("Space : "+space); 
	 System.out.println("Symbol : "+symbol); 

	 } 
 }