package Interfaces;

public class Main {
    public static void main(String[] args){
        // interfaces
        ICustomerDal customerOracleDal = new OracleCustomerDal();
        ICustomerDal customerMySqlDal = new MySqlCustomerDal();
        customerMySqlDal.Add();
        customerOracleDal.Add();

    }
}
