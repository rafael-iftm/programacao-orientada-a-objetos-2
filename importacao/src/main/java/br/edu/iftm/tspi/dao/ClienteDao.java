package br.edu.iftm.tspi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.iftm.tspi.domain.Cliente;
import br.edu.iftm.tspi.exceptions.InclusaoAlteracaoException;
import br.edu.iftm.tspi.exceptions.LoteNaoEncontradoException;

public class ClienteDao {

    public void salvarCliente(Cliente cliente) throws Exception {
        Connection connection = Conexao.getConnection();
        String sql = "INSERT IGNORE INTO tbCliente(cpfcli,nomcli,"+
                     "endcli,baicli,cidcli,sigest,datcad) "+
                     " values (?,?,?,?,?,?,now())";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, cliente.getCpf());
        ps.setString(2, cliente.getNome());
        ps.setString(3, cliente.getEndereco());
        ps.setString(4, cliente.getBairro());
        ps.setString(5, cliente.getCidade());
        ps.setString(6, cliente.getEstado());
        ps.execute();
    }

    public void atualizarCliente(Cliente cliente) throws Exception {
        Connection connection = Conexao.getConnection();
        String sql = "UPDATE tbCliente set ";
        int sequencia = 1;

        if (cliente.isAtualizou(cliente.getNome())) {
            sql += " nomcli = ?,";
        }
        if (cliente.isAtualizou(cliente.getEndereco())) {
            sql += " endcli = ?,";          
        }
        if (cliente.isAtualizou(cliente.getBairro())) {
            sql += " baicli = ?,";        
        }
        if (cliente.isAtualizou(cliente.getCidade())) {
            sql += " cidcli = ?,";         
        }
        if (cliente.isAtualizou(cliente.getEstado())) {
            sql += " sigest = ? ,";          
        }

        sql = sql.substring(0, sql.length() - 1);
        sql += "where cpfcli = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        if (cliente.isAtualizou(cliente.getNome())) {
            ps.setString(sequencia, cliente.getNome());
            sequencia++;
        }
        if (cliente.isAtualizou(cliente.getEndereco())) {
            ps.setString(sequencia, cliente.getEndereco());
            sequencia++;            
        }
        if (cliente.isAtualizou(cliente.getBairro())) {
            ps.setString(sequencia, cliente.getBairro());
            sequencia++;            
        }
        if (cliente.isAtualizou(cliente.getCidade())) {
            ps.setString(sequencia, cliente.getCidade());
            sequencia++;            
        }
        if (cliente.isAtualizou(cliente.getEstado())) {
            ps.setString(sequencia, cliente.getEstado());
            sequencia++;            
        }

        ps.setString(sequencia, cliente.getCpf());
        ps.execute();
    }

    public void persistir(Cliente cliente) throws InclusaoAlteracaoException {
        if (cliente.getInclusaoAlteracao().equals("I")) {
            try {
                salvarCliente(cliente);
            } catch (Exception e) {
                throw new InclusaoAlteracaoException("Erro ao salvar cliente", e);
            }
        } else if (cliente.getInclusaoAlteracao().equals("A")) {
            try {
                atualizarCliente(cliente);
            } catch (Exception e) {
                throw new InclusaoAlteracaoException("Erro ao atualizar cliente", e);
            }
        } else {
            throw new InclusaoAlteracaoException("Desconheço essa opção de inclusão/alteração: " + cliente.getInclusaoAlteracao());
        }
    }

    public Integer getUltimoLote() throws LoteNaoEncontradoException {
        try {
            Connection conexao = Conexao.getConnection();
            String sql = "select MAX(numlot) as maxLote " +
                         "from tbControleRecebimento " +
                         "where tiparq = 'CLI'";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            throw new LoteNaoEncontradoException("Erro ao buscar o último lote de cliente", e);
        }
        throw new LoteNaoEncontradoException("Não encontrei o último lote de cliente");
    }

    public void salvarLote(Integer lote) throws Exception {
        Connection conexao = Conexao.getConnection();
        String sql = "INSERT INTO tbControleRecebimento(tiparq,numlot,dathraprc) "+
                     "values ('CLI',?,now())";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, lote);
        ps.execute();
    }
}
