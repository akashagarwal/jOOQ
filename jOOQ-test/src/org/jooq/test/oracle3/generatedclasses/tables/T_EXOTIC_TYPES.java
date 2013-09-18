/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_EXOTIC_TYPES extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1224026690;

	/**
	 * The singleton instance of <code>T_EXOTIC_TYPES</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES T_EXOTIC_TYPES = new org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES.class;
	}

	/**
	 * The column <code>T_EXOTIC_TYPES.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>T_EXOTIC_TYPES.UU</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES, java.lang.String> UU = createField("UU", org.jooq.impl.SQLDataType.CHAR.length(36), this);

	/**
	 * Create a <code>T_EXOTIC_TYPES</code> table reference
	 */
	public T_EXOTIC_TYPES() {
		super("T_EXOTIC_TYPES", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_EXOTIC_TYPES</code> table reference
	 */
	public T_EXOTIC_TYPES(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES.T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES(alias);
	}
}
