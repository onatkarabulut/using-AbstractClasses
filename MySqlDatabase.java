public class MySqlDatabase extends AbstractDatabase {

   @Override
   public void update(){
      System.out.println("MySql updated...");
   }

   @Override
   public void get(){
      System.out.println("MySql got data...");
   }

}
