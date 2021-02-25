import java.util.*; 

class word_guessing  {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		String st1,st2;
		char ch;
		int score=9;  
		System.out.println("Enter name"); 
		st1= ob.nextLine(); 
		st2=st1;
		for(int i=0;i<st2.length()-1;i++){
			if(st2.charAt(i)=='A'||st2.charAt(i)=='E'||st2.charAt(i)=='I'||st2.charAt(i)=='O'||st2.charAt(i)=='U'){

			}else{
				st2 = st2.substring(0, i)+ '_'+ st2.substring(i+1); 
			}
		}
		System.out.println(st2+"                                          "+score);

		int j=0;				
		while(j<st2.length()){
			if(st2.charAt(j)=='_' && score>0){
				ch= ob.next().charAt(0);
				if(st1.charAt(j) == ch){
					 st2 = st2.substring(0, j)+ ch+ st2.substring(j+1); 
					System.out.println(st2+"                                                                     SCORE=      "+score); 
					
				} else {
					score=score-1;
					System.out.println(st2+"                                                                     SCORE=     "+score); 
				}
			}
			else if(st2.charAt(j)!='_'&& score>0)
			{
			j++;
			}
			
			else{
					System.out.println(" GAME OVER");
				break;
			}
			
		}
	}
}








