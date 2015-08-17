package perceptronofOR;

import java.util.LinkedList;

public class PerceptronOR {
	
	LinkedList<LinkedList<Integer>> totVect = new LinkedList<LinkedList<Integer>>(); // List of List
	LinkedList<Integer> yList = new LinkedList<Integer>();
	LinkedList<Integer> w = new LinkedList<Integer>();

	public void createList(int totInputVect) {
		// TODO Auto-generated method stub
		for(int i=0;i<totInputVect;i++) {
			totVect.add(new LinkedList<Integer>());
			w.add(0);
		}
	}

	public void addToList(int nextInt, int listnum) {
		// TODO Auto-generated method stub
		totVect.get(listnum).add(nextInt);
	}

	public void createY() {
		// TODO Auto-generated method stub
		for(int i=0;i<totVect.get(0).size();i++) {
			if(totVect.get(0).get(i) == 1 || totVect.get(1).get(i) == 1)
				yList.add(1);
			else
				yList.add(0);
		}
	}

	public int operationOR(int nOfX) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<w.size();i++) {
			sum = sum + (w.get(i) * totVect.get(i).get(nOfX));
		}
		
		System.out.println(sum+" "+yList.get(nOfX));
		
		if(sum != yList.get(nOfX)) {
			if(yList.get(nOfX) == 0)
				createWList("-",nOfX);       
			else
				createWList("+",nOfX);
			return 0;
		}
		else
			return 1;
	}
	

	private void createWList(String operator, int nOfX) {
		// TODO Auto-generated method stub
		for(int k=0;k<w.size();k++) {
			if(operator.equals("+"))
				w.set(k, w.get(k) - totVect.get(k).get(nOfX));
			else 
				w.set(k, w.get(k) + totVect.get(k).get(nOfX));
		}
	}
	
	public void displayW() {
		System.out.println(w);
	}

}
