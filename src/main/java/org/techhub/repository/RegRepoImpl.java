package org.techhub.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.techhub.Register;

@Repository("regRepo")
public class RegRepoImpl  implements RegRepo{

	@Autowired
	JdbcTemplate template;
	@Override
	public boolean isRegister(Register model) {
	
		int value=template.update("insert into mvcregister values(?,?,?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
			ps.setString(1,model.getName());
			ps.setString(2,model.getEmail());
			ps.setString(3,model.getContact());
			}
			
		});
		return value>0?true:false;
	}

	
}
