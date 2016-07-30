/*
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 2031776439;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.ROUTINES</code>
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.Routines ROUTINES = new org.jooq.util.hsqldb.information_schema.tables.Routines();

	/**
	 * The class holding records for this type.
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SPECIFIC_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_CATALOG = createField("SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SPECIFIC_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_SCHEMA = createField("SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SPECIFIC_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROUTINE_CATALOG = createField("ROUTINE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROUTINE_SCHEMA = createField("ROUTINE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROUTINE_NAME = createField("ROUTINE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROUTINE_TYPE = createField("ROUTINE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.MODULE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> MODULE_CATALOG = createField("MODULE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.MODULE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> MODULE_SCHEMA = createField("MODULE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.MODULE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> MODULE_NAME = createField("MODULE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.UDT_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_CATALOG = createField("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.UDT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_SCHEMA = createField("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.UDT_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_NAME = createField("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_SET_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_CATALOG = createField("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_SET_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_SCHEMA = createField("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.COLLATION_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_CATALOG = createField("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.COLLATION_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_SCHEMA = createField("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.COLLATION_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.NUMERIC_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.NUMERIC_PRECISION_RADIX</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.NUMERIC_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.DATETIME_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.INTERVAL_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INTERVAL_TYPE = createField("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.INTERVAL_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INTERVAL_PRECISION = createField("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.TYPE_UDT_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_UDT_CATALOG = createField("TYPE_UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.TYPE_UDT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_UDT_SCHEMA = createField("TYPE_UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.TYPE_UDT_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_UDT_NAME = createField("TYPE_UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SCOPE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_CATALOG = createField("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SCOPE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_SCHEMA = createField("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SCOPE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_NAME = createField("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.MAXIMUM_CARDINALITY</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAXIMUM_CARDINALITY = createField("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.DTD_IDENTIFIER</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_BODY</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROUTINE_BODY = createField("ROUTINE_BODY", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_DEFINITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROUTINE_DEFINITION = createField("ROUTINE_DEFINITION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.EXTERNAL_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> EXTERNAL_NAME = createField("EXTERNAL_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.EXTERNAL_LANGUAGE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> EXTERNAL_LANGUAGE = createField("EXTERNAL_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.PARAMETER_STYLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARAMETER_STYLE = createField("PARAMETER_STYLE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_DETERMINISTIC</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_DETERMINISTIC = createField("IS_DETERMINISTIC", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SQL_DATA_ACCESS</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SQL_DATA_ACCESS = createField("SQL_DATA_ACCESS", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_NULL_CALL</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_NULL_CALL = createField("IS_NULL_CALL", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SQL_PATH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SCHEMA_LEVEL_ROUTINE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_LEVEL_ROUTINE = createField("SCHEMA_LEVEL_ROUTINE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.MAX_DYNAMIC_RESULT_SETS</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAX_DYNAMIC_RESULT_SETS = createField("MAX_DYNAMIC_RESULT_SETS", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_USER_DEFINED_CAST</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_USER_DEFINED_CAST = createField("IS_USER_DEFINED_CAST", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_IMPLICITLY_INVOCABLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_IMPLICITLY_INVOCABLE = createField("IS_IMPLICITLY_INVOCABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.SECURITY_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SECURITY_TYPE = createField("SECURITY_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.TO_SQL_SPECIFIC_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_CATALOG = createField("TO_SQL_SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.TO_SQL_SPECIFIC_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_SCHEMA = createField("TO_SQL_SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.TO_SQL_SPECIFIC_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_NAME = createField("TO_SQL_SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.AS_LOCATOR</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> AS_LOCATOR = createField("AS_LOCATOR", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.CREATED</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.LAST_ALTERED</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> LAST_ALTERED = createField("LAST_ALTERED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.NEW_SAVEPOINT_LEVEL</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NEW_SAVEPOINT_LEVEL = createField("NEW_SAVEPOINT_LEVEL", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_UDT_DEPENDENT</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_UDT_DEPENDENT = createField("IS_UDT_DEPENDENT", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_FROM_DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_FROM_DATA_TYPE = createField("RESULT_CAST_FROM_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_AS_LOCATOR</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_AS_LOCATOR = createField("RESULT_CAST_AS_LOCATOR", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_MAX_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_CHAR_MAX_LENGTH = createField("RESULT_CAST_CHAR_MAX_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_OCTET_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_CHAR_OCTET_LENGTH = createField("RESULT_CAST_CHAR_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_SET_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_CHAR_SET_CATALOG = createField("RESULT_CAST_CHAR_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_SET_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_CHAR_SET_SCHEMA = createField("RESULT_CAST_CHAR_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_CHARACTER_SET_NAME = createField("RESULT_CAST_CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_COLLATION_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_COLLATION_CATALOG = createField("RESULT_CAST_COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_COLLATION_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_COLLATION_SCHEMA = createField("RESULT_CAST_COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_COLLATION_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_COLLATION_NAME = createField("RESULT_CAST_COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_NUMERIC_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_NUMERIC_PRECISION = createField("RESULT_CAST_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_NUMERIC_RADIX</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_NUMERIC_RADIX = createField("RESULT_CAST_NUMERIC_RADIX", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_NUMERIC_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_NUMERIC_SCALE = createField("RESULT_CAST_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DATETIME_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_DATETIME_PRECISION = createField("RESULT_CAST_DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_INTERVAL_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_INTERVAL_TYPE = createField("RESULT_CAST_INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_INTERVAL_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_INTERVAL_PRECISION = createField("RESULT_CAST_INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_TYPE_UDT_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_TYPE_UDT_CATALOG = createField("RESULT_CAST_TYPE_UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_TYPE_UDT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_TYPE_UDT_SCHEMA = createField("RESULT_CAST_TYPE_UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_TYPE_UDT_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_TYPE_UDT_NAME = createField("RESULT_CAST_TYPE_UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_SCOPE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_SCOPE_CATALOG = createField("RESULT_CAST_SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_SCOPE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_SCOPE_SCHEMA = createField("RESULT_CAST_SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_SCOPE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_SCOPE_NAME = createField("RESULT_CAST_SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_MAX_CARDINALITY</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_MAX_CARDINALITY = createField("RESULT_CAST_MAX_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DTD_IDENTIFIER</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_DTD_IDENTIFIER = createField("RESULT_CAST_DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.DECLARED_DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.DECLARED_NUMERIC_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.DECLARED_NUMERIC_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_FROM_DECLARED_DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT_CAST_FROM_DECLARED_DATA_TYPE = createField("RESULT_CAST_FROM_DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DECLARED_NUMERIC_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_DECLARED_NUMERIC_PRECISION = createField("RESULT_CAST_DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DECLARED_NUMERIC_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESULT_CAST_DECLARED_NUMERIC_SCALE = createField("RESULT_CAST_DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.ROUTINES</code> table reference
	 */
	public Routines() {
		this("ROUTINES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.ROUTINES</code> table reference
	 */
	public Routines(java.lang.String alias) {
		this(alias, org.jooq.util.hsqldb.information_schema.tables.Routines.ROUTINES);
	}

	private Routines(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Routines(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/** {@inheritDoc} */
	@Override
	public org.jooq.util.hsqldb.information_schema.tables.Routines as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.Routines(alias, this);
	}

	/**
	 * Rename this table.
	 */
	public org.jooq.util.hsqldb.information_schema.tables.Routines rename(java.lang.String name) {
		return new org.jooq.util.hsqldb.information_schema.tables.Routines(name, null);
	}
}
