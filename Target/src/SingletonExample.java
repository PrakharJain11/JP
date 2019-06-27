public class SingletonExample {

   private static SingletonExample instance = null;
   private SingletonExample() {
      // Exists only to defeat instantiation.
   }

   public static SingletonExample getInstance() {
      if(instance == null) {
         instance = new SingletonExample();
      }
      return instance;
   }
}
