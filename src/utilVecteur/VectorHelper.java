package utilVecteur;

class VectorHelper {// test de conflit de tp igl 
/**
 * cette méthode calcule la somme des deux vecteurs 
 * @param tab1 le premier vecteur à sommer 
 * @param tab2 le dexuième vecteur à sommer 
 * @return est un entier qui donne la somme des vecteurs tab1 et tab2
 * @throws exceptionTailleDiff  si les deux vecteur ont des tailles différents 
 */
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
/**
 * cette méthode inverse les élements d'un vecteur
 * @param tab le vecteur à inverser 
 * <b>Exemple<b>
 * <pre>
 * 		soit le vecteur ={2,4,5,6}
 *      inverseTab(vecteur) nous donne :{6,5,4,2} 
 * </pre>
 */
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
	/**
	 * cette méthode trie les éléments d'un vecteur 
	 * @param vecteur le vecteur à trier
	 * @return le meme vecteur mais trier 
	 * <br>
	 * <b>Exemple<b>
	 * <pre>
	 * 		soit le vecteur = {4,5,9,2}
	 * 		trierVecteur (vecteur) nous donne :{2,4,5,9} 
	 * </pre>
	 */
	static public int[] trierVecteur(int[] vecteur){
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
