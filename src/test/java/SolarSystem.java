public class SolarSystem {

    public static void main(String[] args) {

        BasicStructure BB = new BasicStructure();
        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";
        System.out.println("Solar System is Ready");

        FeatureSun Xros=new FeatureSun();
        Xros.temp="32423k";
        Xros.Color="Yellow";
        Xros.Radius="1000000miles";

        Planet1 ZORO= new Planet1();
        ZORO.color="Blue";
        ZORO.radius="10324533miles";
    }
}
