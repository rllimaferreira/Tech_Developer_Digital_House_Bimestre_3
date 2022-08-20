package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import entities.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelDaoH2 implements IDao<Hotel> {

    // Injeções de dependências
    private ConfiguracaoJDBC configuracaoJDBC;

    // Construtor que recebe o Configuração JDBC
    public HotelDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Hotel salvar(Hotel hotel) {

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String queryInsert = String.format("INSERT INTO hoteis (nomeDaFilial, rua, numero, cidade, estado, estrelas) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')", hotel.getNomeDaFilial(), hotel.getRua(), hotel.getNumero(), hotel.getCidade(), hotel.getEstado(), hotel.getEstrelas());

        try {
            statement = conexao.createStatement();
            statement.executeUpdate(queryInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                hotel.setId(rs.getInt(1));
            }
            statement.close();
            conexao.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return hotel;
    }
}
