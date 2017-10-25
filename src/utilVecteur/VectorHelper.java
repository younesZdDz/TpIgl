package utilVecteur;//commentaire 1
/**
 * Classe utilitaire pour les traitement des vecteurs de type entier.
 *  
 * @author Younes Zadi and Omar Sekouti
 *
 */
class VectorHelper {// test de conflit de tp igl 
/**
 * cette méthode calcule la somme des deux vecteurs 
 * @param tab1 le premier vecteur à sommer 
 * @param tab2 le dexuième vecteur à sommer 
 * @return est un entier qui donne la somme des vecteurs tab1 et tab2
 * @throws exceptionTailleDiff  si les deux vecteur ont des tailles différents
 * @throws TableauVideException si un des deux tableau est vide
 */
public static int [] somme (int tab1[],int tab2[])throws exceptionTailleDiff,TableauVideException{
		if (tab1==null || tab2==null){
			throw new TableauVideException();
		}
		else{
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
/**
 * cette méthode inverse les élements d'un vecteur
 * @param tab le vecteur à inverser
 * @throws TableauVideException si le vecteur donnée est vide 
 * <br>
 * <b>Exemple</b>
 * <br>
 * <pre>
 * 		soit le vecteur ={2,4,5,6}
 *      inverseTab(vecteur) nous donne :{6,5,4,2} 
 * </pre>
 */
	public static void inverseTab (int tab[])throws TableauVideException{
		if (tab==null){
			throw new TableauVideException();
		}
		int i=0 , j= tab.length-1, caseInter;
		while (i<j){
			caseInter= tab[i];
			tab[i]=tab[j];
			tab[j]=caseInter;
			i++;
			j--;
			}
	}

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
	 * @throws TableauVideException si le vecteur donnée est vide
	 * <br>
	 * <b>Exemple</b>
	 * <br>
	 * <pre>
	 * si on donne comme entree {2,8,9,11}, et l'entier n=2 le tableau devient
	 * {4,16,18,22}
	 * </pre>
	 */
	public static void mulFoisNTableau(int tableau[],int n)throws TableauVideException{
		if(tableau==null){
			throw new TableauVideException();
		}
		for (int i=0;i<tableau.length;i++)
			tableau[i]=tableau[i]*2;
	}
	/**
	 * cette méthode trie les éléments d'un vecteur 
	 * @param vecteur le vecteur à trier
	 * @throws TableauVideException si le vecteur donnée est vide
	 * @return le meme vecteur mais trier 
	 * <br>
	 * <b>Exemple</b>
	 * <br>
	 * <pre>
	 * 		soit le vecteur = {4,5,9,2}
	 * 		trierVecteur (vecteur) nous donne :{2,4,5,9} 
	 * </pre>
	 */
	static public int[] trierVecteur(int[] vecteur)throws TableauVideException{
		if(vecteur==null){
			throw new TableauVideException();
		}
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
