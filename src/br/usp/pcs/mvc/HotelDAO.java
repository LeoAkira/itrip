package br.usp.pcs.mvc;

import java.util.ArrayList;

public class HotelDAO {
	private static HotelDAO instance = null;
	
	ArrayList<Hotel> hoteis = new ArrayList<Hotel>();

	public static HotelDAO getInstance() {
	      if(instance == null) {
	         instance = new HotelDAO();
	      }
	      return instance;
	   }
	
	public HotelDAO() {
		Hotel hotel1 = new Hotel("1", "Hotel 1", 10.0, "endereço 1");
		Hotel hotel2 = new Hotel("2", "Hotel 2", 20.0, "endereço 2");
		Hotel hotel3 = new Hotel("3", "Hotel 3", 30.0, "endereço 3");
		
		
	    hoteis.add(hotel1);
	    hoteis.add(hotel2);
	    hoteis.add(hotel3);
	}
	
	public ArrayList<Hotel> findAll() {
		return this.hoteis;
	}
	public Hotel findHotelById(String id) {
		for (Hotel hotel : this.hoteis) {
			if (hotel.getId().equals(id)) {
				return hotel;
			}
		}
		return null;
	}
}
