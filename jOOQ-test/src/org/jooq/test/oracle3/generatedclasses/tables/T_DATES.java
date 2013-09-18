/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_DATES extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES> implements java.lang.Cloneable {

	private static final long serialVersionUID = -25144117;

	/**
	 * The singleton instance of <code>T_DATES</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_DATES T_DATES = new org.jooq.test.oracle3.generatedclasses.tables.T_DATES();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES.class;
	}

	/**
	 * The column <code>T_DATES.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>T_DATES.D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>T_DATES.T</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, java.sql.Timestamp> T = createField("T", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>T_DATES.TS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>T_DATES.D_INT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_DATES.TS_BIGINT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>T_DATES.I_Y</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, org.jooq.types.YearToMonth> I_Y = createField("I_Y", org.jooq.impl.SQLDataType.INTERVALYEARTOMONTH, this);

	/**
	 * The column <code>T_DATES.I_D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, org.jooq.types.DayToSecond> I_D = createField("I_D", org.jooq.impl.SQLDataType.INTERVALDAYTOSECOND, this);

	/**
	 * Create a <code>T_DATES</code> table reference
	 */
	public T_DATES() {
		super("T_DATES", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_DATES</code> table reference
	 */
	public T_DATES(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_DATES as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_DATES(alias);
	}
}
