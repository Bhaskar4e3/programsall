package com.again.temp.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeRowMapper implements RowMapper<Pojo> {
	Pojo pojo=new Pojo();

	@Override
	public Pojo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
     Pojo pojo=new Pojo();
     pojo.setId(rs.getString(1));
     pojo.setName(rs.getString(2));
     pojo.setExp(rs.getInt(3));
     
		return pojo;
	}

}
