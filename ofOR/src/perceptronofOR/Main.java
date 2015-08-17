package perceptronofOR;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerceptronOR or= new PerceptronOR();
		int tot = 0;
		
		or.createList(3);
		
		// For x1
		or.addToList(0, 0);
		or.addToList(0, 0);
		or.addToList(1, 0);
		or.addToList(1, 0);
		// For x2
		or.addToList(0, 1);
		or.addToList(1, 1);
		or.addToList(0, 1);
		or.addToList(1, 1);
		// For x3
		or.addToList(1, 2);
		or.addToList(1, 2);
		or.addToList(1, 2);
		or.addToList(1, 2);
		
		or.createY();
		while(tot < 4){
			tot = 0;
			for(int i=0;i<4;i++){
				tot = tot+or.operationOR(i);
			}
		}
		or.displayW();
		
	}

}
