public class MongoDatabase extends AbstractDatabase {

   @Override
   public void update(){
      System.out.println("Mongo updated...");
   }

   @Override
   public void get(){
      System.out.println("Mongo got data...");
   }

}
