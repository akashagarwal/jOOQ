/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71", schema = "TEST")
public class XTestCase_71 implements java.io.Serializable {

	private static final long serialVersionUID = 430293460;

	private java.lang.Integer id;
	private java.lang.Short   testCase_64_69Id;

	public XTestCase_71() {}

	public XTestCase_71(
		java.lang.Integer id,
		java.lang.Short   testCase_64_69Id
	) {
		this.id = id;
		this.testCase_64_69Id = testCase_64_69Id;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", precision = 4)
	public java.lang.Short getTestCase_64_69Id() {
		return this.testCase_64_69Id;
	}

	public void setTestCase_64_69Id(java.lang.Short testCase_64_69Id) {
		this.testCase_64_69Id = testCase_64_69Id;
	}
}
