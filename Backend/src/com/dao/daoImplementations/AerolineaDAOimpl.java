package com.dao.daoImplementations;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.AerolineaDAO;
import com.domain.Aerolinea;
import com.exceptions.NoSuchIdException;
import com.utils.ConexionDB.MySQL;
import com.mysql.cj.jdbc.CallableStatement;

public class AerolineaDAOimpl implements AerolineaDAO{
	private PreparedStatement preparedStatement;
	//private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public boolean addAerolinea(Aerolinea a) throws IOException, SQLException{
		// TODO Auto-generated method stub
		
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE aerolinea SET  WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, a.getNombre());
		preparedStatement.setString(2, a.getAlianza().toString());
		preparedStatement.setString(3, a.getVuelos().toString());
		int resultSet = preparedStatement.executeUpdate();
		if (resultSet == 1) {
			preparedStatement.close();
			connection.close();
			return true;
		} else {
			preparedStatement.close();
			connection.close();
			return false;
		}
	}


	@Override
	public void deleteAerolinea(int idAerolinea) throws SQLException, IOException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aerolinea> findAllAerolinea() throws SQLException, IOException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aerolinea getAerolinea(int aerolinea) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Aerolinea updateAerolinea(Aerolinea a) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
