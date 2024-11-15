public class MoyenneException
{
public static void main(String[] argv)
{
if (argv.length <= 0)
{
System.out.println("Il n'y a pas d'arguments");
System.exit(1);
}
int moyenne = moyenne(argv);
System.out.println("La moyenne est " + moyenne);
}
public static int moyenne(String[] argv)
{
int somme = 0;
int cpt = 0;
for (int i = 0; i < argv.length; i++)
{
somme += Integer.parseInt(argv[i]);
cpt++;
}
return somme / cpt;
}
}
