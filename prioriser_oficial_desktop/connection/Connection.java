/* public class Connection
{

    private static final String DRIVER = "";
    private static final String URL = "";
    private static final String USER = "";
    private static final String PASS = "";

    public static Connection getConnection()
    {
        try
        {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException error) {
            throw new RuntimeException("Erro");
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
    }

    public static void closeConnection(Connection con)
     {
        try 
        {
            if (con != null)
            {
                con.close();
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt)
    {
        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs)
    {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

*/