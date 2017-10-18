package utilVecteur;
/**
 * Classe utilitaire pour les traitement des vecteurs de type entier.
 *  
 * @author Younes Zadi
 *
 */
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
	/**
	 * Fonction pour le calcul du maximum et minimum simultanément d'un 
	 * {@code tableau} d'entier.
	 *  
	 * @param tableau le {@code tableau} a calculé son maximum et minimum
	 * @return  {@code tableau} de deux case la premiere est le min, et la seconde 
	 *	est le max. 
	 * @throws TableauVideException
	 * <br>
	 * <b>Exemple</b>
	 * <br>
	 * <pre>
	 * Si on donne comme entree le tableau {2,3,8,9,15,11}
	 * on aura comme sortie {2,15}
	 * </pre>
	 */
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
	/**
	 * Procedure pour faire une operation de produit de tous les case d'un 
	 * {@code tableau} par un entier donnee.
	 * 
	 * @param tableau le {@code tableau} dont on veut traiter.
	 * @param n l'entier a multipilié par tous les case du {@code tableau}
	 * <br>
	 * <b>Exemple</b>
	 * <br>
	 * <pre>
	 * si on donne comme entree {2,8,9,11}, et l'entier n=2 le tableau devient
	 * {4,16,18,22}
	 * </pre>
	 */
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
