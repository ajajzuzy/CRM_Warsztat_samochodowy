package pl.coderslab.Dao;

import pl.coderslab.model.Employee;
import pl.coderslab.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

    public void saveToDB(Employee employee){
        try{
            PreparedStatement stat = DbUtil.getConn().prepareStatement("INSERT INTO Employee(imie,nazwisko,adres,tel,note,r-g) VALUES (?,?,?,?,?,?)");
            stat.setString(1,employee.getImie());
            stat.setString(2,employee.getNazwisko());
            stat.setString(3,employee.getDane_adresowe());
            stat.setInt(4, employee.getNr_tel());
            stat.setString(5,employee.getNote());
            stat.setDouble(6,employee.getRg());
            stat.executeUpdate();

        }catch (SQLException e){

        }

    }


}
