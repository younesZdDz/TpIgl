package utilVecteur;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorHelperTest {

	@Test
	public void testMinMaxTab() {
		int expectedOutput[]={3,15};
		int inputTab[]={5,4,7,3,8,15,9};
		int actualOutput[]=null;
		try{
			actualOutput=VectorHelper.minMaxTab(inputTab);
		}
		catch(TableauVideException e){}
		assertArrayEquals(actualOutput,expectedOutput);
		
	}
	@Test
	public void testMulFoisNTableau(){
		int expectedOutput[]={10,8,14,6,16,30,18};
		int inputTab[]={5,4,7,3,8,15,9};
		int actualOutput[]=null;
			VectorHelper.mulFoisNTableau(inputTab, 2);
			actualOutput=inputTab;
		
		assertArrayEquals(actualOutput,expectedOutput);
	}

}
