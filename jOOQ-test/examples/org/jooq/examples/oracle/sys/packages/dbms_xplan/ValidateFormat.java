/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValidateFormat extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1537591338;

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.VALIDATE_FORMAT.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"));

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.VALIDATE_FORMAT.HASPLANSTATS</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Object> HASPLANSTATS = createParameter("HASPLANSTATS", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"));

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.VALIDATE_FORMAT.FORMAT</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.VALIDATE_FORMAT.FORMAT_FLAGS</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> FORMAT_FLAGS = createParameter("FORMAT_FLAGS", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public ValidateFormat() {
		super("VALIDATE_FORMAT", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(HASPLANSTATS);
		addInParameter(FORMAT);
		addOutParameter(FORMAT_FLAGS);
	}

	/**
	 * Set the <code>HASPLANSTATS</code> parameter IN value to the routine
	 */
	public void setHasplanstats(java.lang.Object value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.ValidateFormat.HASPLANSTATS, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter IN value to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.ValidateFormat.FORMAT, value);
	}

	/**
	 * Get the <code>FORMAT_FLAGS</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getFormatFlags() {
		return getValue(FORMAT_FLAGS);
	}
}
