package Controller;

import Model.ContatoModel;
import javax.swing.JOptionPane;

public class ContatoController {

    public void cadastrarContato(String nome, String telefone, String email) {
        if ((nome != null && nome.length() > 0) && (telefone != null && telefone.length() > 0)
                && (email != null && email.length() > 0)) {
            
            ContatoModel novoContato = new ContatoModel(nome, telefone, email);
            novoContato.cadastrarContato(novoContato);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
        }
    }
}
