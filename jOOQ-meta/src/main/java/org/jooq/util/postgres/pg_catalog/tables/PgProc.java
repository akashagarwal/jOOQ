/*
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.8.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgProc extends TableImpl<Record> {

	private static final long serialVersionUID = -575731366;

	/**
	 * The reference instance of <code>pg_catalog.pg_proc</code>
	 */
	public static final PgProc PG_PROC = new PgProc();

	/**
	 * The class holding records for this type.
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_proc.proname</code>.
	 */
	public final TableField<Record, String> PRONAME = createField("proname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.pronamespace</code>.
	 */
	public final TableField<Record, Long> PRONAMESPACE = createField("pronamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proowner</code>.
	 */
	public final TableField<Record, Long> PROOWNER = createField("proowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prolang</code>.
	 */
	public final TableField<Record, Long> PROLANG = createField("prolang", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.procost</code>.
	 */
	public final TableField<Record, Float> PROCOST = createField("procost", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prorows</code>.
	 */
	public final TableField<Record, Float> PROROWS = createField("prorows", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.provariadic</code>.
	 */
	public final TableField<Record, Long> PROVARIADIC = createField("provariadic", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.protransform</code>.
	 */
	public final TableField<Record, String> PROTRANSFORM = createField("protransform", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proisagg</code>.
	 */
	public final TableField<Record, Boolean> PROISAGG = createField("proisagg", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proiswindow</code>.
	 */
	public final TableField<Record, Boolean> PROISWINDOW = createField("proiswindow", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prosecdef</code>.
	 */
	public final TableField<Record, Boolean> PROSECDEF = createField("prosecdef", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proleakproof</code>.
	 */
	public final TableField<Record, Boolean> PROLEAKPROOF = createField("proleakproof", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proisstrict</code>.
	 */
	public final TableField<Record, Boolean> PROISSTRICT = createField("proisstrict", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proretset</code>.
	 */
	public final TableField<Record, Boolean> PRORETSET = createField("proretset", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.provolatile</code>.
	 */
	public final TableField<Record, String> PROVOLATILE = createField("provolatile", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.pronargs</code>.
	 */
	public final TableField<Record, Short> PRONARGS = createField("pronargs", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.pronargdefaults</code>.
	 */
	public final TableField<Record, Short> PRONARGDEFAULTS = createField("pronargdefaults", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prorettype</code>.
	 */
	public final TableField<Record, Long> PRORETTYPE = createField("prorettype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proargtypes</code>.
	 */
	public final TableField<Record, Long[]> PROARGTYPES = createField("proargtypes", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proallargtypes</code>.
	 */
	public final TableField<Record, Long[]> PROALLARGTYPES = createField("proallargtypes", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proargmodes</code>.
	 */
	public final TableField<Record, String[]> PROARGMODES = createField("proargmodes", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proargnames</code>.
	 */
	public final TableField<Record, String[]> PROARGNAMES = createField("proargnames", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proargdefaults</code>.
	 */
	public final TableField<Record, Object> PROARGDEFAULTS = createField("proargdefaults", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.protrftypes</code>.
	 */
	public final TableField<Record, Long[]> PROTRFTYPES = createField("protrftypes", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prosrc</code>.
	 */
	public final TableField<Record, String> PROSRC = createField("prosrc", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.probin</code>.
	 */
	public final TableField<Record, String> PROBIN = createField("probin", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proconfig</code>.
	 */
	public final TableField<Record, String[]> PROCONFIG = createField("proconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proacl</code>.
	 */
	public final TableField<Record, String[]> PROACL = createField("proacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_proc</code> table reference
	 */
	public PgProc() {
		this("pg_proc", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_proc</code> table reference
	 */
	public PgProc(String alias) {
		this(alias, PG_PROC);
	}

	private PgProc(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgProc(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/** {@inheritDoc} */
	@Override
	public PgProc as(String alias) {
		return new PgProc(alias, this);
	}

	/**
	 * Rename this table.
	 */
	public PgProc rename(String name) {
		return new PgProc(name, null);
	}
}
