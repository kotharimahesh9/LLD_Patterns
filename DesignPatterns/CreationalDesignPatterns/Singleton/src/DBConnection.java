public class DBConnection {

    private static DBConnection dbConnection;

    private DBConnection(){
        System.out.println("Made a connection to the database");
    }


    public static DBConnection getInstance(){
        if(dbConnection == null){
            synchronized(DBConnection.class){
                if(dbConnection == null){
                    dbConnection = new DBConnection();
                }
            }
        }

        return dbConnection;
    }
}
