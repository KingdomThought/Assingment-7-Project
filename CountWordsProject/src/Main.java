
public class Main {

	public static void main(String[] args) {
	
	System.out.println(countletter("America"));
	

	}
	
				public static int countletter (String word) {
					
					int count = 0;
					for (int i=0; i < word.length(); i++) {
						if (word.charAt(i)== 'a'|| word.charAt(i)=='A') {
							count++;
							
						}
					}
					return count;
				}

			
			}

