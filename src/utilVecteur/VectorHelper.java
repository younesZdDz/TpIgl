package utilVecteur;
class VectorHelper {
public static int [] somme (int tab1[],int tab2[])throws exceptionTailleDiff{
		
		if (tab1.length != tab2.length) throw new exceptionTailleDiff() ;
		else {
			int tabResul[]= new int [tab1.length];
			int i =0 ; 
			for ( i=0 ;i < tab1.length ;i++){
				tabResul[i]=tab1[i]+tab2[i];
			}
			return tabResul;} 
	}
}
