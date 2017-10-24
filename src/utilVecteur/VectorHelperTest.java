package utilVecteur;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * classe de teste unitaire de Junit
 * @author zadi et sekouti
 *
 */
public class VectorHelperTest {

	@Test
	public void testMinMaxTab() throws TableauVideException{
		int expectedOutput[]={3,15};
		int inputTab[]={5,4,7,3,8,15,9};
		int actualOutput[]=VectorHelper.minMaxTab(inputTab);
		assertArrayEquals(actualOutput,expectedOutput);
		
	}
	@Test
	public void testMulFoisNTableau()throws TableauVideException{
		int expectedOutput[]={10,8,14,6,16,30,18};
		int inputTab[]={5,4,7,3,8,15,9};
		VectorHelper.mulFoisNTableau(inputTab, 2);
		int actualOutput[]=inputTab;
		assertArrayEquals(actualOutput,expectedOutput);
	}
	@Test
	public void testSomme() throws exceptionTailleDiff, TableauVideException{
		int  tab1[]={1,2,3,4} ;
		int tab2[]={1,2,3,4};
		int tabExpected[]={2,4,6,8};
		int tab[]=VectorHelper.somme(tab1, tab2);
		assertArrayEquals(tab,tabExpected);
			
	}
	@Test 
	public void testTrie ()throws TableauVideException{
		int  tab1[]={4,7,2,1} ;
		int tabExpected[]={1,2,4,7};
		VectorHelper.trierVecteur(tab1);
		assertArrayEquals(tab1,tabExpected);
	}
	@Test 
	public void testInverseTab ()throws TableauVideException{
		int tab1[]={4,7,2,1};
		int tabExpected[]={1,2,7,4};
		VectorHelper.inverseTab(tab1);
		assertArrayEquals(tab1,tabExpected);
	}

}
