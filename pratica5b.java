package pratica5;
import javax.swing.JOptionPane;
import java.util.*;
public class pratica5b {

	public static void main(String[] args) {
		 int i,j;
	     ArrayList<String> rede = new ArrayList();

	    // [ B ] usando o m�todo add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Inserir\n2-Alterar\n3-Excluir\n4-Listar\n5-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	                String instagram = JOptionPane.showInputDialog("Digite o instagram: ");
	                String email= JOptionPane.showInputDialog("Digite o email: ");
	                rede.add(nome+";"+telefone+";"+instagram+";"+email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                
	                 break;
	             case 2:
	            	 String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
		                int n = rede.size();
		                for(i=0;i<n;i++) {
		                	if(rede.get(i).contains(nomeexcluir)) 
		                	{
		                		rede.remove(i);
		                		
		                	}
		                }
		                
		                JOptionPane.showMessageDialog(null, "Exclu�do com Sucesso");
		                  } catch (IndexOutOfBoundsException e) {
		                      // exce��o lan�ada para indicar que um �ndice (i)
		                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
		                      System.out.printf("\nErro: posi��o inv�lida (%s).",
		                        e.getMessage());
		                  }
	                 break;
	             case 3:
	            	 String buscanome= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
			                int n = rede.size();
			                for(i=0;i<n;i++) {
			                	if(rede.get(i).contains(buscanome)) 
			                	{
			                		JOptionPane.showInternalMessageDialog(null, rede.get(i));
			                		
			                	}
			                	else if(!rede.get(i).contains(buscanome) && i==n-1){
			                		JOptionPane.showInternalMessageDialog(null, "\nErro: Nome invalido (%s).");
			                	}
			                }
	            	 } catch (IndexOutOfBoundsException e) {
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida (%s).",
	                        e.getMessage());
	                  }
	                 break;
	             case 4:
	 
	                   j = 0;
	                    Iterator<String> iterator = rede.iterator();
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
