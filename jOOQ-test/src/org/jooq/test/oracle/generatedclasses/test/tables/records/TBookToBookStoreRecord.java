/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_TO_BOOK_STORE", schema = "TEST", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BOOK_STORE_NAME", "BOOK_ID"})
})
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1831913551;

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getBookStoreName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getBookId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	public void setStock(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	@javax.persistence.Column(name = "STOCK", precision = 7)
	public java.lang.Integer getStock() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStock();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord(java.lang.String bookStoreName, java.lang.Integer bookId, java.lang.Integer stock) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);

		setValue(0, bookStoreName);
		setValue(1, bookId);
		setValue(2, stock);
	}
}
