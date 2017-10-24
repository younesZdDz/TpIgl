package utilVecteur;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VectorHelperTest {

	@Test
	
	public void testSomme() throws Exception{
		int  tab1[]={1,2,3,4} ;
		int tab2[]={1,2,3,4};
		int tabExpected[]={2,4,6,8};
		int tab[]=VectorHelper.somme(tab1, tab2);
		assertArrayEquals(tab,tabExpected);
			
	}
	@Test 
	public void testTrie (){
		int  tab1[]={4,7,2,1} ;
		int tabExpected[]={1,2,4,7};
		VectorHelper.trierVecteur(tab1);
		assertArrayEquals(tab1,tabExpected);
	}
	@Test 
	public void testInverseTab (){
		int tab1[]={4,7,2,1};
		int tabExpected[]={1,2,7,4};
		VectorHelper.inverseTab(tab1);
		assertArrayEquals(tab1,tabExpected);
	}

}
