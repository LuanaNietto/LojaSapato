/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;
import br.com.satc.enums.LojaSapato;
import br.com.satc.enums.Menu;
import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Produtos;
import br.com.satc.objeto.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author luana.159917
 */
public class LojaProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
   ArrayList<Produtos> produtos = new ArrayList<>();
   
      
       int escMenu=0;
       int rgCLiente = 0;
       ArrayList<Cliente>cadastrarCliente =new ArrayList();
       ArrayList<Venda>cadastrarVenda = new ArrayList<>();
       ArrayList<Produtos>cadastrarProduto= new ArrayList<>();
       
      for(LojaSapato p : LojaSapato.values()){
           cadastrarProduto.add(new Produtos(p.getNome(),p.getDescricao(), p.getStatus(), p.getId()));
                } 
       do{
           escMenu=Integer.parseInt(JOptionPane.showInputDialog("escolha uma das opiçoes \n"
            +"1.CadastrarCliente\n"
            +"2.CadastrarProdutos\n"
            +"3.CadastrarVendas\n"
            +"4.ConsultarCliente\n"
            +"5.ConsultarProdutos\n"
            +"6.ConsultarVendas\n"
            +"7. sair /n"));
       
       switch(escMenu){
           case 1 :{
               do{
                   String nomeCliente=JOptionPane.showInputDialog("Informe o nome do cliente ");
                   int rgCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual o rg? "));
                    int cpfCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual o cpf? "));
                   int id = Integer.parseInt(JOptionPane.showInputDialog("Qual o id? "));
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                   Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
                   Date dataCadastro = sdf.parse(JOptionPane.showInputDialog("Informe a data do cadastro")); 
                   char status = JOptionPane.showInputDialog("Qual o status?").charAt(0);
                   cadastrarCliente.add(new Cliente(id, dataCadastro, status, nomeCliente, rgCLiente, cpfCliente, dataNascimento));
               }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
               break;
               }
           case 2 :{
               do{
         String nomeProduto=JOptionPane.showInputDialog("Informe o nome do produto ");
         String descricao= JOptionPane.showInputDialog("Informe a descrição ");
         char status = JOptionPane.showInputDialog("Qual o status?").charAt(0);
         float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor total a pagar?"));
         int idProduto =Integer.parseInt(JOptionPane.showInputDialog("Informe o id do produto"));
         cadastrarProduto.add(new Produtos(nomeProduto, descricao, status, idProduto));
        }while((JOptionPane.showConfirmDialog(null, "Desja continuar?"))==0);
               break;
           }
           case 3 : {
               do{
           
        String cliente = JOptionPane.showInputDialog("Informe o cliente");
        char status = JOptionPane.showInputDialog("Qual o status?").charAt(0);
        String listProdutos =JOptionPane.showInputDialog("Informe a lista de produtos");
        float totalPagar = Float.parseFloat(JOptionPane.showInputDialog("Qual o total a pagar?"));
        int idVenda =Integer.parseInt(JOptionPane.showInputDialog("Informe o id da vDialog(\"Qual o total a pagar?\"));\n" +"venda"));
        cadastrarVenda.add(new Venda(cliente, status, listProdutos, totalPagar,idVenda));
        }while((JOptionPane.showConfirmDialog(null, "Desja continuar?"))==0);
               break;
           }
           
             case 4: {
             String opcao = JOptionPane.showInputDialog("Qual opção voce deseja?");   
             int consultarCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual cliente voce quer consultar ? "));  
             JOptionPane.showMessageDialog(null, cadastrarCliente.get(consultarCliente).toString());     
             break;
                 }
              case 5: {
             int consultarProdutos = Integer.parseInt(JOptionPane.showInputDialog("Qual produto voce quer consultar ? "));  
             JOptionPane.showMessageDialog(null,cadastrarProduto.get(consultarProdutos).toString());
             break;
              }
              case 6: {
             int consultarVendas = Integer.parseInt(JOptionPane.showInputDialog("Qual venda voce quer consultar ? "));  
             JOptionPane.showMessageDialog(null,cadastrarVenda.get(consultarVendas).toString());
             break;
       
              } 
      }
       }while(escMenu!=7);

   
    }
}