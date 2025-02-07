/**
 * Classe MaillonSC utilisé par la classe ListeSC
 * 
 * ATTENTION: vous ne devez pas modifier ce fichier.
 */
public class MaillonSC
{
    public int val;
    public MaillonSC suiv;
    
    
    MaillonSC(int val) {
        this.val = val;
    }

    MaillonSC(int val, MaillonSC suiv) {
        this.val = val;
        this.suiv = suiv;
    }
}
