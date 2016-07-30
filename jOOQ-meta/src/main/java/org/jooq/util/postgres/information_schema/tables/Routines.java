/*
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines extends TableImpl<Record> {

	private static final long serialVersionUID = 218812048;

	/**
	 * The reference instance of <code>information_schema.routines</code>
	 */
	public static final Routines ROUTINES = new Routines();

	/**
	 * The class holding records for this type.
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.routines.specific_catalog</code>.
	 */
	public final TableField<Record, String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.specific_schema</code>.
	 */
	public final TableField<Record, String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.specific_name</code>.
	 */
	public final TableField<Record, String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.routine_catalog</code>.
	 */
	public final TableField<Record, String> ROUTINE_CATALOG = createField("routine_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.routine_schema</code>.
	 */
	public final TableField<Record, String> ROUTINE_SCHEMA = createField("routine_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.routine_name</code>.
	 */
	public final TableField<Record, String> ROUTINE_NAME = createField("routine_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.routine_type</code>.
	 */
	public final TableField<Record, String> ROUTINE_TYPE = createField("routine_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.module_catalog</code>.
	 */
	public final TableField<Record, String> MODULE_CATALOG = createField("module_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.module_schema</code>.
	 */
	public final TableField<Record, String> MODULE_SCHEMA = createField("module_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.module_name</code>.
	 */
	public final TableField<Record, String> MODULE_NAME = createField("module_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.udt_catalog</code>.
	 */
	public final TableField<Record, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.udt_schema</code>.
	 */
	public final TableField<Record, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.udt_name</code>.
	 */
	public final TableField<Record, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.data_type</code>.
	 */
	public final TableField<Record, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.character_maximum_length</code>.
	 */
	public final TableField<Record, Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.character_octet_length</code>.
	 */
	public final TableField<Record, Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.character_set_catalog</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.character_set_schema</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.character_set_name</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.collation_catalog</code>.
	 */
	public final TableField<Record, String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.collation_schema</code>.
	 */
	public final TableField<Record, String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.collation_name</code>.
	 */
	public final TableField<Record, String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.numeric_precision</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.numeric_precision_radix</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.numeric_scale</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.datetime_precision</code>.
	 */
	public final TableField<Record, Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.interval_type</code>.
	 */
	public final TableField<Record, String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.interval_precision</code>.
	 */
	public final TableField<Record, Integer> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.type_udt_catalog</code>.
	 */
	public final TableField<Record, String> TYPE_UDT_CATALOG = createField("type_udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.type_udt_schema</code>.
	 */
	public final TableField<Record, String> TYPE_UDT_SCHEMA = createField("type_udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.type_udt_name</code>.
	 */
	public final TableField<Record, String> TYPE_UDT_NAME = createField("type_udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.scope_catalog</code>.
	 */
	public final TableField<Record, String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.scope_schema</code>.
	 */
	public final TableField<Record, String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.scope_name</code>.
	 */
	public final TableField<Record, String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.maximum_cardinality</code>.
	 */
	public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.dtd_identifier</code>.
	 */
	public final TableField<Record, String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.routine_body</code>.
	 */
	public final TableField<Record, String> ROUTINE_BODY = createField("routine_body", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.routine_definition</code>.
	 */
	public final TableField<Record, String> ROUTINE_DEFINITION = createField("routine_definition", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.external_name</code>.
	 */
	public final TableField<Record, String> EXTERNAL_NAME = createField("external_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.external_language</code>.
	 */
	public final TableField<Record, String> EXTERNAL_LANGUAGE = createField("external_language", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.parameter_style</code>.
	 */
	public final TableField<Record, String> PARAMETER_STYLE = createField("parameter_style", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.is_deterministic</code>.
	 */
	public final TableField<Record, String> IS_DETERMINISTIC = createField("is_deterministic", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.sql_data_access</code>.
	 */
	public final TableField<Record, String> SQL_DATA_ACCESS = createField("sql_data_access", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.is_null_call</code>.
	 */
	public final TableField<Record, String> IS_NULL_CALL = createField("is_null_call", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.sql_path</code>.
	 */
	public final TableField<Record, String> SQL_PATH = createField("sql_path", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.schema_level_routine</code>.
	 */
	public final TableField<Record, String> SCHEMA_LEVEL_ROUTINE = createField("schema_level_routine", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.max_dynamic_result_sets</code>.
	 */
	public final TableField<Record, Integer> MAX_DYNAMIC_RESULT_SETS = createField("max_dynamic_result_sets", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.is_user_defined_cast</code>.
	 */
	public final TableField<Record, String> IS_USER_DEFINED_CAST = createField("is_user_defined_cast", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.is_implicitly_invocable</code>.
	 */
	public final TableField<Record, String> IS_IMPLICITLY_INVOCABLE = createField("is_implicitly_invocable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.security_type</code>.
	 */
	public final TableField<Record, String> SECURITY_TYPE = createField("security_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.to_sql_specific_catalog</code>.
	 */
	public final TableField<Record, String> TO_SQL_SPECIFIC_CATALOG = createField("to_sql_specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.to_sql_specific_schema</code>.
	 */
	public final TableField<Record, String> TO_SQL_SPECIFIC_SCHEMA = createField("to_sql_specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.to_sql_specific_name</code>.
	 */
	public final TableField<Record, String> TO_SQL_SPECIFIC_NAME = createField("to_sql_specific_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.as_locator</code>.
	 */
	public final TableField<Record, String> AS_LOCATOR = createField("as_locator", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.created</code>.
	 */
	public final TableField<Record, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.routines.last_altered</code>.
	 */
	public final TableField<Record, Timestamp> LAST_ALTERED = createField("last_altered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.routines.new_savepoint_level</code>.
	 */
	public final TableField<Record, String> NEW_SAVEPOINT_LEVEL = createField("new_savepoint_level", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.is_udt_dependent</code>.
	 */
	public final TableField<Record, String> IS_UDT_DEPENDENT = createField("is_udt_dependent", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_from_data_type</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_FROM_DATA_TYPE = createField("result_cast_from_data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_as_locator</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_AS_LOCATOR = createField("result_cast_as_locator", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_char_max_length</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_CHAR_MAX_LENGTH = createField("result_cast_char_max_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_char_octet_length</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_CHAR_OCTET_LENGTH = createField("result_cast_char_octet_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_char_set_catalog</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_CHAR_SET_CATALOG = createField("result_cast_char_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_char_set_schema</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_CHAR_SET_SCHEMA = createField("result_cast_char_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_character_set_name</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_CHARACTER_SET_NAME = createField("result_cast_character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_collation_catalog</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_COLLATION_CATALOG = createField("result_cast_collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_collation_schema</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_COLLATION_SCHEMA = createField("result_cast_collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_collation_name</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_COLLATION_NAME = createField("result_cast_collation_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_numeric_precision</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_NUMERIC_PRECISION = createField("result_cast_numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_numeric_precision_radix</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_NUMERIC_PRECISION_RADIX = createField("result_cast_numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_numeric_scale</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_NUMERIC_SCALE = createField("result_cast_numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_datetime_precision</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_DATETIME_PRECISION = createField("result_cast_datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_interval_type</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_INTERVAL_TYPE = createField("result_cast_interval_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_interval_precision</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_INTERVAL_PRECISION = createField("result_cast_interval_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_type_udt_catalog</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_TYPE_UDT_CATALOG = createField("result_cast_type_udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_type_udt_schema</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_TYPE_UDT_SCHEMA = createField("result_cast_type_udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_type_udt_name</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_TYPE_UDT_NAME = createField("result_cast_type_udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_scope_catalog</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_SCOPE_CATALOG = createField("result_cast_scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_scope_schema</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_SCOPE_SCHEMA = createField("result_cast_scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_scope_name</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_SCOPE_NAME = createField("result_cast_scope_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_maximum_cardinality</code>.
	 */
	public final TableField<Record, Integer> RESULT_CAST_MAXIMUM_CARDINALITY = createField("result_cast_maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.routines.result_cast_dtd_identifier</code>.
	 */
	public final TableField<Record, String> RESULT_CAST_DTD_IDENTIFIER = createField("result_cast_dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>information_schema.routines</code> table reference
	 */
	public Routines() {
		this("routines", null);
	}

	/**
	 * Create an aliased <code>information_schema.routines</code> table reference
	 */
	public Routines(String alias) {
		this(alias, ROUTINES);
	}

	private Routines(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Routines(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/** {@inheritDoc} */
	@Override
	public Routines as(String alias) {
		return new Routines(alias, this);
	}

	/**
	 * Rename this table.
	 */
	public Routines rename(String name) {
		return new Routines(name, null);
	}
}
