package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class HomeController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lbltotalmember.setText("20");
		lbltotalmember.setAlignment(Pos.CENTER);
		lbltotalmember.setText(MemberDao.getMemberDao().membercount()+"");
		lbltotalboard.setText(BoardDao.getboardDao().boardcount()+"");
		lbltotalproduct.setText(ProductDao.getProductDao().productcount()+"");
		
		// 라인 차트
		XYChart.Series series = new XYChart.Series<>();
		series.setName("등록 수");
			ObservableList<Product> products = ProductDao.getProductDao().productlist();
			
			ArrayList<String> dates = new ArrayList<>();
			
			for(Product product : products) {
				String date = product.getP_date().split(" ")[0];
				dates.add(date);
			}
			for(String date : dates) {
				XYChart.Data data = new XYChart.Data<>(date+"",1);
				series.getData().add(date);
			}
		lc.getData().add(series);
	}
	
	@FXML
	private LineChart lc;
	
	@FXML
	private Label lbltotalmember;
	
	@FXML
	private Label lbltotalboard;
	
	@FXML
	private Label lbltotalproduct;
	
}
