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
public class Attributes extends TableImpl<Record> {

	private static final long serialVersionUID = 2017178996;

	/**
	 * The reference instance of <code>information_schema.attributes</code>
	 */
	public static final Attributes ATTRIBUTES = new Attributes();

	/**
	 * The class holding records for this type.
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.attributes.udt_catalog</code>.
	 */
	public final TableField<Record, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.udt_schema</code>.
	 */
	public final TableField<Record, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.udt_name</code>.
	 */
	public final TableField<Record, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.attribute_name</code>.
	 */
	public final TableField<Record, String> ATTRIBUTE_NAME = createField("attribute_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.ordinal_position</code>.
	 */
	public final TableField<Record, Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.attribute_default</code>.
	 */
	public final TableField<Record, String> ATTRIBUTE_DEFAULT = createField("attribute_default", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.is_nullable</code>.
	 */
	public final TableField<Record, String> IS_NULLABLE = createField("is_nullable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.attributes.data_type</code>.
	 */
	public final TableField<Record, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.character_maximum_length</code>.
	 */
	public final TableField<Record, Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.character_octet_length</code>.
	 */
	public final TableField<Record, Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.character_set_catalog</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.character_set_schema</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.character_set_name</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.collation_catalog</code>.
	 */
	public final TableField<Record, String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.collation_schema</code>.
	 */
	public final TableField<Record, String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.collation_name</code>.
	 */
	public final TableField<Record, String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.numeric_precision</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.numeric_precision_radix</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.numeric_scale</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.datetime_precision</code>.
	 */
	public final TableField<Record, Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.interval_type</code>.
	 */
	public final TableField<Record, String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.interval_precision</code>.
	 */
	public final TableField<Record, Integer> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.attribute_udt_catalog</code>.
	 */
	public final TableField<Record, String> ATTRIBUTE_UDT_CATALOG = createField("attribute_udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.attribute_udt_schema</code>.
	 */
	public final TableField<Record, String> ATTRIBUTE_UDT_SCHEMA = createField("attribute_udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.attribute_udt_name</code>.
	 */
	public final TableField<Record, String> ATTRIBUTE_UDT_NAME = createField("attribute_udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.scope_catalog</code>.
	 */
	public final TableField<Record, String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.scope_schema</code>.
	 */
	public final TableField<Record, String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.scope_name</code>.
	 */
	public final TableField<Record, String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.maximum_cardinality</code>.
	 */
	public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.attributes.dtd_identifier</code>.
	 */
	public final TableField<Record, String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.attributes.is_derived_reference_attribute</code>.
	 */
	public final TableField<Record, String> IS_DERIVED_REFERENCE_ATTRIBUTE = createField("is_derived_reference_attribute", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * Create a <code>information_schema.attributes</code> table reference
	 */
	public Attributes() {
		this("attributes", null);
	}

	/**
	 * Create an aliased <code>information_schema.attributes</code> table reference
	 */
	public Attributes(String alias) {
		this(alias, ATTRIBUTES);
	}

	private Attributes(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Attributes(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/** {@inheritDoc} */
	@Override
	public Attributes as(String alias) {
		return new Attributes(alias, this);
	}

	/**
	 * Rename this table.
	 */
	public Attributes rename(String name) {
		return new Attributes(name, null);
	}
}
