package dbconnection;

import lombok.SneakyThrows;
import models.ProjectsTableModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class executeStatement extends DBConnect{


    @SneakyThrows
    public  static ResultSet getDataFromTable() {
        String query = "SELECT * FROM projects;";
        return statement.executeQuery(query);
    }

    @SneakyThrows
    public static void addCountryToTable() {
        String query = "INSERT INTO projects (country) VALUES ('BY');";
        statement.executeUpdate(query);
    }

    public static void main (String[] args) throws SQLException {
        connect();
        ResultSet results = getDataFromTable();
        ArrayList<ProjectsTableModel> projects = new ArrayList<>();
        while(results.next()) {
            ProjectsTableModel project = ProjectsTableModel.builder()
                    .id(results.getInt("id"))
                    .country(results.getString("country"))
                    .build();
            projects.add(project);

        }
        for (ProjectsTableModel project:
            projects) {
            System.out.println(project.toString());
        }
        closeConnection();
    }
}
