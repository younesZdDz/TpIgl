package utilVecteur;

class VectorHelper {// test de conflit de tp igl 
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
	public static void inverseTab (int tab[]){
		int i=0 , j= tab.length-1, caseInter;
		while (i<j){
			caseInter= tab[i];
			tab[i]=tab[j];
			tab[j]=caseInter;
			i++;
			j--;
			}
	}
	// fonction 
	public static int [] minMaxTab(int tableau[])throws TableauVideException{
		if (tableau==null){
			throw new TableauVideException();
		}
		else{
			int tabTemp []=new int [2];
			int min= tableau[0];
			int max=tableau[0];
			int i=1;
			while (i<tableau.length){
				if (tableau[i]<min)
					min=tableau[i];
				if (tableau[i]>max)
					max=tableau[i];
				i++;
			}
			tabTemp[0]=min;
			tabTemp[1]=max;
			return tabTemp;
		}
	}

	public static void mulFoisNTableau(int tableau[],int n){
		for (int i=0;i<tableau.length;i++)
			tableau[i]=tableau[i]*2;
	}
	static public int[] TriertVecteur(int[] vecteur){
        int i, j, cle;
        
        for (i = 1; i < vecteur.length; i++) {
            cle = vecteur[i];
            j = i;
            while ((j >= 1) && (vecteur[j - 1] > cle)) {
                vecteur[j]  = vecteur[j - 1] ;
                j = j - 1;
            }
            vecteur[j] = cle;
        }
        
        return vecteur ;
    }
}
