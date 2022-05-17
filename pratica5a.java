package pratica5;
import javax.swing.JOptionPane;
import java.util.*;
public class pratica5a {

	public static void main(String[] args) {
		int i,j;
	     ArrayList<String> agenda = new ArrayList();

	    // [ B ] usando o m�todo add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Inserir\n2-Alterar\n3-Excluir\n4-Listar\n5-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                String endereco= JOptionPane.showInputDialog("Digite o endereco: ");
	                agenda.add(nome+";"+endereco);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 break;
	             case 2:
	                 String nomevelho= JOptionPane.showInputDialog("Digite o Nome Anterior:");
	                 String novonome= JOptionPane.showInputDialog("Digite o Nome Novo:");
	                 try {
	                     agenda.set(agenda.indexOf(nomevelho), novonome); 
	                  } catch (IndexOutOfBoundsException e) {
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida (%s).",e.getMessage());
	                  }                  
	                 JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
	                 break;
	             case 3:
	                 String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                j = 0;
	                
	                JOptionPane.showMessageDialog(null, "Exclu�do com Sucesso");
	                 try {
	                    agenda.remove(nomeexcluir);
	                  } catch (IndexOutOfBoundsException e) {
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida (%s).",
	                        e.getMessage());
	                  }
	                 break;
	             case 4:
	 
	                   j = 0;
	                    Iterator<String> iterator = agenda.iterator();
	                    while (iterator.hasNext()) {
	                      System.out.printf("Posi��o %d- %s\n", j, iterator.next());
	                      j++;
	                    }
	                    break;
	             case 5:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das op��es v�lidas");
	        }
	     } while (i!=4);
	}

}
