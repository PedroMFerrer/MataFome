package etapa001;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public Produto buscarPorId(int id) throws Exception {
        Produto produto = getProduto(id);
        if (produto == null) {
            throw new Exception("Produto não encontrado: ID " + id);
        }
        return produto;
    }

    public void cadastrar(Produto produto) {
        String sql = "INSERT INTO produto(nome, preco, quantidade_estoque) VALUES "
                + "(?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    public Produto getProduto(int id) {
        String sql = "SELECT * FROM produto WHERE id = ?";
        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Produto produto = new Produto();

            rs.next();
            produto.setId(id);
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getDouble("preco"));
            produto.setQuantidade(rs.getInt("quantidade_estoque"));

            return produto;

        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
        return null;
    }

    public void excluir(int id) {

        String sql = "DELETE FROM produto WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }

    public List<Produto> getProduto(String nomeproduto) {
        String sql = "SELECT * FROM produto WHERE nome LIKE ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + nomeproduto + "%");

            ResultSet rs = stmt.executeQuery();

            List<Produto> listaProduto = new ArrayList<>();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuantidade(rs.getInt("quantidade_estoque"));

                listaProduto.add(produto);

            }

            return listaProduto;

        } catch (Exception e) {
            return null;
        }

    }

    public void atualizarEstoque(int id, int quantidadeComprada) {
        Produto p = getProduto(id); 
        if (p != null) {
            int novaQuantidade = p.getQuantidade() - quantidadeComprada;

            String sql = "UPDATE produto SET quantidade_estoque = ? WHERE id = ?";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setInt(1, novaQuantidade);
                stmt.setInt(2, id);
                stmt.executeUpdate();
                stmt.close();
            } catch (Exception e) {
                System.out.println("Erro ao atualizar estoque: " + e.getMessage());
            }
        } else {
            System.out.println("Produto não encontrado para o ID: " + id);
        }
    }
}
