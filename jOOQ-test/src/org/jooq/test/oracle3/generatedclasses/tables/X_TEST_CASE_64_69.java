/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X_TEST_CASE_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1813463501;

	/**
	 * The singleton instance of <code>X_TEST_CASE_64_69</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69 X_TEST_CASE_64_69 = new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69.class;
	}

	/**
	 * The column <code>X_TEST_CASE_64_69.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>X_TEST_CASE_64_69</code> table reference
	 */
	public X_TEST_CASE_64_69() {
		super("X_TEST_CASE_64_69", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>X_TEST_CASE_64_69</code> table reference
	 */
	public X_TEST_CASE_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_TEST_CASE_64_69A, org.jooq.test.oracle3.generatedclasses.Keys.FK_X_TEST_CASE_64_69B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69 as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69(alias);
	}
}
