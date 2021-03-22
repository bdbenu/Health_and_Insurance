package com.helth.and.insurance.ar.gen;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ApplicationNumberGenerater implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prifix="APPL";
		String suffix ="";

		try {
			Connection conn = session.connection();
			Statement stmt = conn.createStatement();
			String sql = "select application_registration.nextval from dual";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				int seqVal = rs.getInt(1);
				suffix =String.valueOf(seqVal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prifix+suffix;
	
	}

}
