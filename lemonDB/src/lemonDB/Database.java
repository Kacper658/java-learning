package lemonDB;

public class Database {
	protected String databaseName;
	protected Table[] tables;

	public Database() {
		this("unnamed");
	}
	public Database(String name) {
		this(name, new Table[] {});
	}
	public Database(String name, Table[] tables) {
		this.databaseName = name;
		this.tables = tables;
	}

}
