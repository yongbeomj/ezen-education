module javafx_1 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mail;			// mail ���� ���̺귯��
	requires activation; 	// mail ���� ���̺귯��
	
	opens Day21 to javafx.graphics, javafx.fxml;
	opens Day22 to javafx.graphics, javafx.fxml;
	
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml , mail , activation;
	opens dao to java.sql;
	opens domain to mail , activation , javafx.base;
	
	
}
