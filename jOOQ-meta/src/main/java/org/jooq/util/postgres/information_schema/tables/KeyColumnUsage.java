/*
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


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
public class KeyColumnUsage extends TableImpl<Record> {

	private static final long serialVersionUID = -319256529;

	/**
	 * The reference instance of <code>information_schema.key_column_usage</code>
	 */
	public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

	/**
	 * The class holding records for this type.
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.key_column_usage.constraint_catalog</code>.
	 */
	public final TableField<Record, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.constraint_schema</code>.
	 */
	public final TableField<Record, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.constraint_name</code>.
	 */
	public final TableField<Record, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.table_catalog</code>.
	 */
	public final TableField<Record, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.table_schema</code>.
	 */
	public final TableField<Record, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.table_name</code>.
	 */
	public final TableField<Record, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.column_name</code>.
	 */
	public final TableField<Record, String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.ordinal_position</code>.
	 */
	public final TableField<Record, Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
	 */
	public final TableField<Record, Integer> POSITION_IN_UNIQUE_CONSTRAINT = createField("position_in_unique_constraint", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>information_schema.key_column_usage</code> table reference
	 */
	public KeyColumnUsage() {
		this("key_column_usage", null);
	}

	/**
	 * Create an aliased <code>information_schema.key_column_usage</code> table reference
	 */
	public KeyColumnUsage(String alias) {
		this(alias, KEY_COLUMN_USAGE);
	}

	private KeyColumnUsage(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private KeyColumnUsage(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/** {@inheritDoc} */
	@Override
	public KeyColumnUsage as(String alias) {
		return new KeyColumnUsage(alias, this);
	}

	/**
	 * Rename this table.
	 */
	public KeyColumnUsage rename(String name) {
		return new KeyColumnUsage(name, null);
	}
}
