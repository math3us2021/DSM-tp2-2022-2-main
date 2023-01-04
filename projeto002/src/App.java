import entidades.Cliente;
import entidades.Contato;
import entidades.Documento;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.PessoaFisica;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente();
        obj1.setNome("Joaquim");

        Funcionario fun1 = new Funcionario();
        fun1.setNome("Severino");
       
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Matheus Barbosa Ferreira");
        pf1.setDataNascimento(LocalDate.of(1990, 10, 10));

        Documento doc1 = new Documento("40343394898");
        doc1.setRg("123123123");
        doc1.setCnh("123123123123");


        Endereco end1 = new Endereco("14400500");
        end1.setLogradouro("Rua");
        end1.setNome("Da Juventude");
        end1.setNumero("123");
        end1.setCidade("Franca");
        end1.setUf("SP");
        end1.setBairro("Centro");
  
        Contato con1 = new Contato();
        con1.setEmail("matheus@123");
        con1.setFixo("123123123");
        con1.setCelular("123123123");

////////////Dados da Pessoa Fisica////////////
        pf1.setEndereco(end1);
        pf1.setDocumento(doc1);
        pf1.setContato(con1);

        // System.out.println("---Cliente---");
        // System.out.println(pf1);

        System.out.println("---Funcionario---");
        Util.info(fun1);

        System.out.println("---Cliente---");
        Util.info(obj1);

     
    }
    
   

  


}
