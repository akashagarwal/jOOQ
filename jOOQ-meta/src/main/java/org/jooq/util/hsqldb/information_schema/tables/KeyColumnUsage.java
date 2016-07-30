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
public class KeyColumnUsage extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1291516054;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code>
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage KEY_COLUMN_USAGE = new org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage();

	/**
	 * The class holding records for this type.
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> POSITION_IN_UNIQUE_CONSTRAINT = createField("POSITION_IN_UNIQUE_CONSTRAINT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code> table reference
	 */
	public KeyColumnUsage() {
		this("KEY_COLUMN_USAGE", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code> table reference
	 */
	public KeyColumnUsage(java.lang.String alias) {
		this(alias, org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);
	}

	private KeyColumnUsage(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private KeyColumnUsage(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/** {@inheritDoc} */
	@Override
	public org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage(alias, this);
	}

	/**
	 * Rename this table.
	 */
	public org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage rename(java.lang.String name) {
		return new org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage(name, null);
	}
}
