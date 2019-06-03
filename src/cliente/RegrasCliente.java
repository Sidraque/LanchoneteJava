/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author dlpsv
 */
public class RegrasCliente {

    public void cadastrarCliente(Cliente cliente) throws Exception {

        if ((cliente.getNome() == null)||(cliente.getNome().trim().equals("") == true)) {
            throw new Exception("Informar o nome do cliente");
        }

        if ((cliente.getCpf() == null)||(cliente.getCpf().trim().equals("") == true)) {
            throw new Exception("Informar o cpf do cliente");
        }
        
        if (cliente.getNome().trim().length() > 200) {
            throw new Exception("O nome do cliente deverá ter menos de 200 caracteres");
        }
        
        if (cliente.getCpf().trim().length() != 11) {
            throw new Exception("O cpf do cliente deverá ter 11 caracteres");
        }

        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.cadastrarCliente(cliente);

    }

}
