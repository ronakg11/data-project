package com.sqa.rg.data;

import java.sql.*;

import org.testng.annotations.*;

import com.sqa.rg.helpers.*;

public class DataTest {
	@Test(enabled = false)
	public void testDatabase() throws ClassNotFoundException, SQLException {
		Object[][] data = DataHelper.evalDatabaseTable("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:8889/sqadb",
				"root", "root", "person");
		DataHelper.displayData(data);
	}

	@Test
	public void testExcelFile() throws InvalidExcelExtensionException {
		Object[][] data = DataHelper.getExcelFileData("", "data.xls", false);
		DataHelper.displayData(data);
	}
}
