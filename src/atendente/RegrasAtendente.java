/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendente;

/**
 *
 * @author lgdal
 */
public class RegrasAtendente {

    public void cadastrarAtendente(Atendente atendente) throws Exception {
        
        if ((atendente.getNome() == null)||(atendente.getNome().trim().equals("") == true)) {
            throw new Exception("Informar o nome do atendente");
        }
        
        if(atendente == null){
            throw new Exception("Não existe nenhum atendente cadastrado");
        }

        if (atendente.getNome().trim().length() > 200) {
            throw new Exception("O nome do atendente deverá ter menos de 200 caracteres");
        }

        
        DadosAtendente dadosAtendente = new DadosAtendente();
        dadosAtendente.cadastrarAtendente(atendente);   
    }
}
