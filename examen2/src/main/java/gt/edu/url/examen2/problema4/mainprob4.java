package gt.edu.url.examen2.problema4;

import gt.edu.url.examen2.problema3.Position;
import gt.edu.url.examen2.problema3.PositionalLinkedList;
import gt.edu.url.examen2.problema3.PositionalList;

public class mainprob4 {

	public static void main(String[] args) {
		 PositionalList<Integer> myps = new PositionalLinkedList<>();
			Position<Integer> temp =  myps.addFirst(1);
			 myps.addAfter(temp,2);
			 Position<Integer> ps = myps.positionAtindex(1);
			System.out.println(ps.getElement());

	}

}
