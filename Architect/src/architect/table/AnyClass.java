package architect.table;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

public class AnyClass {
	public static void main(String[] args) {
		// The table is just like a two-key map, this is not the multikey map
		// You actually wrote a same structure like that, which is like 
		// This is the google core library for java, that is why oracle is trying to sue google for that. 
		// The first key is the row key, and the second one is the column key
		Table<Integer, Integer, Object> table = TreeBasedTable.create(); 
		table.put(3, 4, "Hello World");
		System.out.println(table.get(3, 4));
		for (Table.Cell<Integer, Integer, Object> iterator : table.cellSet()) {
			System.out.println(iterator.getRowKey() + " " + iterator.getColumnKey() + " " + iterator.getValue());
		}
	}
}
