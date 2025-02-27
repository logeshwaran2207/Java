import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DbUtils {
public static TableModel resultSetToTableModel(ResultSet rs) {
	try {
		ResultSetMetaData metaData =rs.getMetaData();
		int numberofColumns =metaData.getColumnCount();
		Vector columnNames=new Vector();
		
		for(int column=0; column<numberofColumns;column++) {
			columnNames.addElement(metaData.getColumnLabel(column+1));
			
		}
		Vector rows=new Vector();
		
		while (rs.next()) {
			Vector newRow=new Vector();
			
			for(int i=1;i<=numberofColumns;i++) {
				newRow.addElement(rs.getObject(i));
			}
			rows.addElement(newRow);
			
		}
		return new DefaultTableModel(rows,columnNames);
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}
}
