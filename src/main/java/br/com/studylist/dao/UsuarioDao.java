package br.com.studylist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.studylist.model.Usuario;
import br.com.studylist.singleton.ConnectionManager;
import br.com.studylist.utils.Genero;

public class UsuarioDao {
	
	
	public void cadastrar(Usuario usuario) {
        String sql = "INSERT INTO study_list (nome, sobrenome, email, senha, celular, genero) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionManager.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getCelular());
            stmt.setString(6, usuario.getGenero());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	  public List<Usuario> listar() {
		  System.out.println("0.1.0 - Listando usuarios");
	        List<Usuario> usuarios = new ArrayList<>();
	        String sql = "SELECT * FROM study_list";

	        try (Connection conn = ConnectionManager.getInstance().getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql);
	             ResultSet rs = stmt.executeQuery()) {

	            while (rs.next()) {
	                Usuario usuario = new Usuario();
	                usuario.setId(rs.getInt("id"));
	                usuario.setNome(rs.getString("nome"));
	                usuario.setSobrenome(rs.getString("sobrenome"));
	                usuario.setEmail(rs.getString("email"));
	                usuario.setCelular(rs.getString("celular"));
	                usuario.setGenero(Genero.getGenero(rs.getString("genero")));
	                usuario.setSenha(rs.getString("senha"));
	                usuarios.add(usuario);
	            }
	            System.out.println("0.1.1 - Usuarios preenchidos");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return usuarios;
	    }
	}
