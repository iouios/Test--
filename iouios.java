public class iouios {
	
	private String firsTwotLetter,lastTwoLetter;
	private int count = 0;
	
	// 1. Square Area
	public int square(int x){
		return x*x;
	}
	// 2. Number of "a" and "A" letters
	public int countLetterA(String word){
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
	//3. Two Letters are the same
	public boolean checkTwoLetter(String letter){
		
		if(letter.length()<=1){
			return false;
		}
		else if(letter.length()==2){
			return true;
		}
		firsTwotLetter = letter.substring(0,2);
		lastTwoLetter = letter.substring(letter.length()-2);
		
		return firsTwotLetter.equals(lastTwoLetter);	
	}
	public static void main(String[] args) {
        iouios quiz = new iouios();

		String letter = "4399";
		int countLetterA =quiz.countLetterA(letter);
		System.out.println("a and A "+letter +" : "+ countLetterA);

		String firsttwoletters = "ba";
		boolean firstlettersSame = quiz.checkTwoLetter(firsttwoletters);
		System.out.println(" firstlettersSame " + firsttwoletters + " same " + firstlettersSame);

		String lasttwoletters = "99";
		boolean lasttwoLettersSame = quiz.checkTwoLetter(lasttwoletters);
		System.out.println(" lasttwoLettersSame " + lasttwoletters + " same " + lasttwoLettersSame);

    }
}