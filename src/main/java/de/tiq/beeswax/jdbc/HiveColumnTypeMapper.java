package de.tiq.beeswax.jdbc;

import java.sql.Types;

public class HiveColumnTypeMapper {

	public static int toJava(String type) {
		// TODO
		if ("tinyint".equalsIgnoreCase(type)) {
			return Types.TINYINT;
		} else 
		if ("smallint".equalsIgnoreCase(type)) {
			return Types.SMALLINT;
		} else 
		if ("int".equalsIgnoreCase(type)) {
			return Types.INTEGER;
		} else 
		if ("bigint".equalsIgnoreCase(type)) {
			return Types.BIGINT;
		} else 
		if ("boolean".equalsIgnoreCase(type)) {
			return Types.BOOLEAN;
		} else 
		if ("float".equalsIgnoreCase(type)) {
			return Types.FLOAT;
		} else 
		if ("double".equalsIgnoreCase(type)) {
			return Types.DOUBLE;
		} else 
		if ("string".equalsIgnoreCase(type)) {
			return Types.VARCHAR;
		}

		return -1;
	}
	
}
