package pucrs.myflight.modelo;

public class Geo {
	private final double latitude;
	private final double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo g1,Geo g2){
		//double distancia = 2*6371*Math.asin(Math.sqrt(Math.pow(Math.sin(Math.toRadians(latitude2-latitude1)/2.0),2)+
//				Math.pow(Math.sin(Math.toRadians(longitude2-longitude1)/2.0),2)* Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2))));

		double distancia = 2*6371*Math.asin(Math.sqrt(Math.pow(Math.sin(Math.toRadians(g2.getLatitude()-g1.getLatitude())/2.0),2)+
				Math.pow(Math.sin(Math.toRadians(g2.getLongitude()-g1.getLongitude())/2.0),2)*
						Math.cos(Math.toRadians(g1.getLatitude())) * Math.cos(Math.toRadians(g2.getLatitude()))));

		return distancia;
	}


}
