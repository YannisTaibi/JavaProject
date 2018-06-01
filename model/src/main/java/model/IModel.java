package model;

/**
 * <h1>The Interface IModel.</h1>
 * 
 */
public interface IModel {

	/**
	 * Gets the example by id.
	 * @param id the id
	 * @return the example by id
	 * @throws SQLException the SQL exception
	 */
	Example getExampleById(int id) throws java.sql.SQLException;

	/**
	 * Gets the example by name.
	 * @param name the name
	 * @return the example by name
	 * @throws SQLException the SQL exception
	 */
	Example getExampleByName(String name) throws java.sql.SQLException;

	/**
	 * Gets the all examples.
	 * @return the all examples
	 * @throws SQLException the SQL exception
	 */
	java.util.List<Example> getAllExamples() throws java.sql.SQLException;

}