package com.ashokit.ies.ar.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CitizenIdGenerator implements IdentifierGenerator  {
	
	private final String citizen_sql = "select citizenid_seq.nextval from dual";
    private final String prefix= "AR";
    String suffix="";
    
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

        try
        {
        	Connection conn=session.connection();
        	Statement stmt=conn.createStatement();
        	ResultSet res=stmt.executeQuery(citizen_sql);
        	if(res.next())
        	{
        		long seqCitizenId=res.getLong(1);
        		suffix=String.valueOf(seqCitizenId);
        	}
        }catch(SQLException e)
        {
        	e.printStackTrace();
        }
        
		return prefix+suffix;
	}

}
