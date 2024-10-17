package main.Controllers.Client;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;

public class DashboardController {

    @FXML
    private PieChart pieChart;

    @FXML
    private Button btnManageBooks;

    @FXML
    private Button btnManageMembers;

    @FXML
    private Button btnBorrowReturn;

    @FXML
    private Button btnTotalBooks;

    @FXML
    private Button btnBorrowedBooks;

    @FXML
    private Button btnOverdueBooks;

    @FXML
    public void initialize() {
        // Thiết lập dữ liệu cho PieChart
        pieChart.getData().add(new PieChart.Data("Available Books", 380));
        pieChart.getData().add(new PieChart.Data("Borrowed Books", 120));
        pieChart.getData().add(new PieChart.Data("Overdue Books", 15));

        // Bạn có thể thêm các sự kiện khi nhấn nút
        btnManageBooks.setOnAction(e -> System.out.println("Manage Books clicked"));
        btnManageMembers.setOnAction(e -> System.out.println("Manage Members clicked"));
        btnBorrowReturn.setOnAction(e -> System.out.println("Manage Borrow/Return clicked"));
    }
}