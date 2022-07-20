


public class Main {
   public static void main(String[] args) {
      AbstractDatabase mysql = new MySqlDatabase();
      AbstractDatabase mongodb = new MongoDatabase();
      mysql.add();
      mongodb.delete();
   }
}
