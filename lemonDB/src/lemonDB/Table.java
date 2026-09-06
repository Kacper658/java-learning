package lemonDB;
import java.lang.StringBuilder;

public class Table {
	protected String tableName;
	protected Column[] columns;

	public Table() {
		this("unnamed");
	}
	public Table(String name) {
		this(name, new Column[] {});
	}
	public Table(String name, Column[] columns) {
		this.tableName = name;
		this.columns = columns;
	}
	public String getTableName() {
		
	}
	public String[] listColumns() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<columns.length; i++) {
			sb.append(columns[i].getName());
			sb.append(" ");
		}
		return sb.toString().split(" ");
	}

}
