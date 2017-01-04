
// missing 'getDist' method for calculating distance
 public class SimpleLocation {

  private double latitude,longitude;

  public SimpleLocation(double lat,double lon) {

      this.longitude = lon;
      this.latitude = lat;
     }

   public double distance(SimpleLocation other) {

      return getDist(this.latitude,this.longitude,other.latitude,other.longitude);

      }

    public static void main(String[] args) {

     SimpleLocation shomolu = new SimpleLocation(6.5350,3.3893);

     SimpleLocation ibadan = new SimpleLocation(7.3775,3.9470);

     System.out.println(shomolu.distance(ibadan));
     }

   }//end of SimpleLocation Class
