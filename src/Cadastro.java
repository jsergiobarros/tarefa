/**
 * A classe Cadastro implementa um cadastro de professores.
 * 
 * @author Isabel 
 * @version maio/2005
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Cadastro
{
    private ArrayList array;

    // Construtor recebe o tamanho inicial do cadastro
    public Cadastro(int capacidade)
    {
        try{
            array = new ArrayList(capacidade);
        }catch(IllegalArgumentException e){
            System.out.println("falhou");
        }
        // crie o objeto ArrayList considerando que se o usu�rio
        // passou um valor negativo deve ser gerada uma exce��o
        // IllegalArgumentException
    }
        
    // Adiciona um objeto no array
    public void insere(Professor p)
    {
            array.add(p);
    }
    
     // Adiciona um objeto numa posi��o espec�fica do array
     // Caso ocorra uma exce��o, fa�a o m�todo retornar false,
     // sen�o o m�todo deve retornar true.
    public boolean insere(Professor p, int posicao)
    {
        try{
        array.add(posicao, p);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }   
    
    // Remove o professor cujo nome � passado por par�metro.
    // Voc� deve percorrer a cole��o obrigatoriamente usando
    // iterator, e comparar o nome. Se encontrar, remova o objeto
    // e retorne true. Caso contr�rio, retorne false
    public boolean remove(String nome)
    {
 
        Professor p;
        for (Iterator it = array.iterator(); it.hasNext();){

            p = (Professor) it.next();
            if (p.nome==nome){
                it.remove();
                return true;
            }
        }
        return false;
        
    }
    
    // Consulta se o professor cujo nome � passado por par�metro
    // est� no array.Voc� deve percorrer a cole��o obrigatoriamente 
    // usando iterator, e comparar o nome. Se encontrar, retorne a
    // refer�ncia do objeto. Caso contr�rio, retorne false
    public Professor consulta(String nome)
    {
        Professor p;
        for (Iterator it = array.iterator(); it.hasNext();){
            p = (Professor) it.next();
            if (p.nome==nome){
 
                return p;
               }
       
        }
         return null;
    }    
    
    // Retorna a refer�ncia para o objeto que est� armazenado no array
    // na posi��o passada como par�metro. Lembre que uma exce��o 
    // IndexOutOfBoundsException pode ser gerada, e propague esta 
    // exce��o.
    public Professor get(int posicao)
    {
        try{
        Professor p = (Professor) array.get(posicao);
        }
        catch(IndexOutOfBoundsException e){
            
        }
        return null;
    }      
    
}
