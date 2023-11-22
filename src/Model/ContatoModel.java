package Model;

public class ContatoModel {
    
   private int id;
   private String nome;
   private String telefone;
   private String email;

    public ContatoModel() {
    }

    public ContatoModel(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   public void cadastrarContato(ContatoModel novoCadastro){
       //Aguarda criação do metodo que ira acessar o banco de dados e fazer a inserção das informaçoe na tabela.
       
   }
}
