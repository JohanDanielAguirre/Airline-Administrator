package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
public class HashTabletest extends TestCase {
	
    public Plane setUpStage1(){
        Plane fly1= new Plane(/*numFLight*/ "MidgetAirlines",/*rows*/5,/*columns*/ 1,/*rowsfirstclass*/ 2);
		return fly1;
    }
	public Plane setUpStage2(){
        Plane fly2= new Plane(/*numFLight*/ "Drugmaxdealer",/*rows*/4,/*columns*/ 2,/*rowsfirstclass*/ 0);
		return fly2;
    }
	public Plane setUpStage3(){
        Plane fly3= new Plane(/*numFLight*/ "Viagrafly",/*rows*/4,/*columns*/ 2,/*rowsfirstclass*/ 4);
		return fly3;
    }
	public ArrayList setUpStage4(){
		PassengerNode s4p1 = new PassengerNode("1a", new Passenger("olvir Eusebius",1110,"1a",0,10));
		PassengerNode s4p2 = new PassengerNode("2b",new Passenger("Cassian Rufina",290123,"2b",0,100));
		PassengerNode s4p3 = new PassengerNode("1c",new Passenger("Erkan Noriko",18200,"1c",0,1000));
		PassengerNode s4p4 = new PassengerNode("1d",new Passenger("Harpreet Aleksandra",610340,"1d",0,250));
		PassengerNode s4p5 = new PassengerNode("2a",new Passenger("Adalhaid Milda",950562,"2a",1,2500));
		PassengerNode s4p6 = new PassengerNode("1e",new Passenger("Oskars Muthoni",396014,"1e",2,25));
		PassengerNode s4p7 = new PassengerNode("2c",new Passenger("Anastasia Amahle",1130584,"2c",0,365));
		PassengerNode s4p8 = new PassengerNode("2d",new Passenger("Yasen Alaric",851944,"2d",5,653));
		PassengerNode s4p9 = new PassengerNode("2e",new Passenger("Rozalija Raginaharjaz",1042984,"2e",3,536));
		PassengerNode s4p10 = new PassengerNode("1b",new Passenger("Yarik Komang",44100,"1b",4,9564));

		ArrayList<PassengerNode<String,Passenger>> passengers = new ArrayList<>();
		passengers.add(s4p1);
		passengers.add(s4p2);
		passengers.add(s4p3);
		passengers.add(s4p4);
		passengers.add(s4p5);
		passengers.add(s4p6);
		passengers.add(s4p7);
		passengers.add(s4p8);
		passengers.add(s4p9);
		passengers.add(s4p10);
		return passengers;

	}
	public ArrayList setUpStage5(){
		PassengerNode s5p1 = new PassengerNode("1a",new Passenger("olvir Eusebius",1110,"1a",0,0));
		PassengerNode s5p2 = new PassengerNode("2b",new Passenger("Cassian Rufina",290123,"2b",0,0));
		PassengerNode s5p3 = new PassengerNode("3c",new Passenger("Harpreet Aleksandra",18200,"3c",0,0));
		PassengerNode s5p4 = new PassengerNode("4d",new Passenger("Oskars Muthoni",610340,"4d",0,0));
		PassengerNode s5p5 = new PassengerNode("2a",new Passenger("Anastasia Amahle",950562,"2a",0,0));
		PassengerNode s5p6 = new PassengerNode("1b",new Passenger("Yasen Alaric",396014,"1b",0,0));
		PassengerNode s5p7 = new PassengerNode("2c",new Passenger("Rozalija Raginaharjaz",1130584,"2c",0,0));
		PassengerNode s5p8 = new PassengerNode("1d",new Passenger("Yarik Komang",851944,"1d",0,0));
		ArrayList<PassengerNode<String,Passenger>> passengers = new ArrayList<>();
		passengers.add(s5p1);
		passengers.add(s5p2);
		passengers.add(s5p3);
		passengers.add(s5p4);
		passengers.add(s5p5);
		passengers.add(s5p6);
		passengers.add(s5p7);
		passengers.add(s5p8);
		return passengers;
	}
	public ArrayList setUpStage6(){
		PassengerNode s6p1 = new PassengerNode("1a",new Passenger("olvir Eusebius",1110,"1a",1,350));
		PassengerNode s6p2 = new PassengerNode("2b",new Passenger("Cassian Rufina",290123,"2b",2,125));
		PassengerNode s6p3 = new PassengerNode("3c",new Passenger("Harpreet Aleksandra",18200,"3c",3,500));
		PassengerNode s6p4 = new PassengerNode("4d",new Passenger("Oskars Muthoni",610340,"4d",4,95));
		PassengerNode s6p5 = new PassengerNode("2a",new Passenger("Anastasia Amahle",950562,"2a",5,350));
		PassengerNode s6p6 = new PassengerNode("1b",new Passenger("Yasen Alaric",396014,"1b",1,95));
		PassengerNode s6p7 = new PassengerNode("2c",new Passenger("Rozalija Raginaharjaz",1130584,"2c",4,125));
		PassengerNode s6p8 = new PassengerNode("1d",new Passenger("Yarik Komang",851944,"1d",2,500));
		ArrayList<PassengerNode<String,Passenger>> passengers = new ArrayList<>();
		passengers.add(s6p1);
		passengers.add(s6p2);
		passengers.add(s6p3);
		passengers.add(s6p4);
		passengers.add(s6p5);
		passengers.add(s6p6);
		passengers.add(s6p7);
		passengers.add(s6p8);
		return passengers;
	}
	public ArrayList setUpStage8(){
		PassengerNode s8p1 = new PassengerNode("1a",new Passenger("olvir Eusebius",1110,"1a",1,350));
		ArrayList<PassengerNode<String,Passenger>> passengers = new ArrayList<>();
		passengers.add(s8p1);
		return passengers;
	}
	public ArrayList setUpStage9(){
		PassengerNode s9p1 = new PassengerNode("4a",new Passenger("anatoly karpov",1110290182,"4a",0,908));
		ArrayList<PassengerNode<String,Passenger>> passengers = new ArrayList<>();
		passengers.add(s9p1);
		return passengers;
	}
	
	
	public void HashInserttest1(){
		ArrayList<PassengerNode<String,Passenger>> pass = new ArrayList<>(setUpStage4());
		ArrayList<PassengerNode<String,Passenger>> pass2 = new ArrayList<>(setUpStage8());
	   try{
		   HashTable<String,Passenger> has= new HashTable<String,Passenger>(1);
		   has.insert(pass.get(0).getKey(), pass.get(0).getValue());
		   has.insert(pass.get(1).getKey(), pass.get(1).getValue());
		   has.insert(pass.get(2).getKey(), pass.get(2).getValue());
		   has.insert(pass.get(3).getKey(), pass.get(3).getValue());
		   has.insert(pass.get(4).getKey(), pass.get(4).getValue());
		   has.insert(pass.get(5).getKey(), pass.get(5).getValue());
		   has.insert(pass.get(6).getKey(), pass.get(6).getValue());
		   has.insert(pass.get(7).getKey(), pass.get(7).getValue());
		   has.insert(pass.get(8).getKey(), pass.get(8).getValue());
		   has.insert(pass.get(9).getKey(), pass.get(9).getValue());
		   has.insert(pass2.get(0).getKey(), pass2.get(0).getValue());
		   assertEquals(11,has.getSize());
	   }catch (Exception e){
		   fail();
	   }
    }
	public void HashInserttest2(){
		ArrayList<PassengerNode<String,Passenger>> pass = new ArrayList<>(setUpStage6());
		ArrayList<PassengerNode<String,Passenger>> pass2 = new ArrayList<>(setUpStage8());
		try{
		   HashTable<String,Passenger> has= new HashTable<String,Passenger>(1);
			has.insert(pass.get(0).getKey(), pass.get(0).getValue());
			has.insert(pass.get(1).getKey(), pass.get(1).getValue());
			has.insert(pass.get(2).getKey(), pass.get(2).getValue());
			has.insert(pass.get(3).getKey(), pass.get(3).getValue());
			has.insert(pass.get(4).getKey(), pass.get(4).getValue());
			has.insert(pass.get(5).getKey(), pass.get(5).getValue());
			has.insert(pass.get(6).getKey(), pass.get(6).getValue());
			has.insert(pass2.get(0).getKey(), pass2.get(0).getValue());
		   fail();
		}catch(DuplicatedObjectExeption e){
			assertNotNull(e);
		}catch (IncorrectObjectExeption | NonexistObjectExeption e){
			fail();
		}
    }
	public void HashInserttest3(){
      Plane fly1 = setUpStage1();
	  try{
		HashTable has= new HashTable(1);
		has.insert(fly1.getNumFlight(),fly1);
		fail();
	  }catch(IncorrectObjectExeption e){
		 assertNotNull(e); 
	  }catch (DuplicatedObjectExeption | NonexistObjectExeption e){
		  fail();
	  }
    }
	
	public void HashDeletetest1(){
		ArrayList<PassengerNode<String,Passenger>> pass = new ArrayList<>(setUpStage4());
		ArrayList<PassengerNode<String,Passenger>> pass2 = new ArrayList<>(setUpStage8());
	   try{
		   HashTable<String,Passenger> has= new HashTable<String,Passenger>(1);
		   has.insert(pass.get(0).getKey(), pass.get(0).getValue());
		   has.insert(pass.get(1).getKey(), pass.get(1).getValue());
		   has.insert(pass.get(2).getKey(), pass.get(2).getValue());
		   has.insert(pass.get(3).getKey(), pass.get(3).getValue());
		   has.insert(pass.get(4).getKey(), pass.get(4).getValue());
		   has.insert(pass.get(5).getKey(), pass.get(5).getValue());
		   has.insert(pass.get(6).getKey(), pass.get(6).getValue());
		   has.insert(pass.get(7).getKey(), pass.get(7).getValue());
		   has.insert(pass.get(8).getKey(), pass.get(8).getValue());
		   has.insert(pass.get(9).getKey(), pass.get(9).getValue());
		   has.delete(pass2.get(0).getKey());
		   fail();
	   }catch (NonexistObjectExeption e){
		   assertNotNull(e);
	   }catch (DuplicatedObjectExeption | IncorrectObjectExeption e){
		   fail();
	   }
    }
	public void HashDeletetest2(){
		ArrayList<PassengerNode<String,Passenger>> pass = new ArrayList<>(setUpStage6());
		ArrayList<PassengerNode<String,Passenger>> pass2 = new ArrayList<>(setUpStage8());
		try{
		   HashTable<String,Passenger> has= new HashTable<String,Passenger>(1);
		   has.insert(pass.get(0).getKey(), pass.get(0).getValue());
		   has.insert(pass.get(1).getKey(), pass.get(1).getValue());
		   has.insert(pass.get(2).getKey(), pass.get(2).getValue());
		   has.insert(pass.get(3).getKey(), pass.get(3).getValue());
		   has.insert(pass.get(4).getKey(), pass.get(4).getValue());
		   has.insert(pass.get(5).getKey(), pass.get(5).getValue());
		   has.insert(pass.get(6).getKey(), pass.get(6).getValue());
		   has.insert(pass.get(7).getKey(), pass.get(7).getValue());
		   has.delete(pass2.get(0).getKey());
		   assertEquals(7,has.getSize());
		}catch(Exception e){
			fail();
		}
    }
	
	public void HashDeletetest3(){
      Plane fly1 = setUpStage1();
	  try{
		HashTable has= new HashTable(1);
		has.delete(fly1.getNumFlight());
		fail();
	  }catch(IncorrectObjectExeption e){
		 assertNotNull(e); 
	  }
    }
	
	public void HashSearchtest1(){
		ArrayList<PassengerNode<String,Passenger>> pass = new ArrayList<>(setUpStage4());
		ArrayList<PassengerNode<String,Passenger>> pass2 = new ArrayList<>(setUpStage8());
	   try{
		   HashTable<String,Passenger> has= new HashTable<String,Passenger>(1);
		   has.insert(pass.get(0).getKey(), pass.get(0).getValue());
		   has.insert(pass.get(1).getKey(), pass.get(1).getValue());
		   has.insert(pass.get(2).getKey(), pass.get(2).getValue());
		   has.insert(pass.get(3).getKey(), pass.get(3).getValue());
		   has.insert(pass.get(4).getKey(), pass.get(4).getValue());
		   has.insert(pass.get(5).getKey(), pass.get(5).getValue());
		   has.insert(pass.get(6).getKey(), pass.get(6).getValue());
		   has.insert(pass.get(7).getKey(), pass.get(7).getValue());
		   has.insert(pass.get(8).getKey(), pass.get(8).getValue());
		   has.insert(pass.get(9).getKey(), pass.get(9).getValue());
		   has.search(pass2.get(0).getKey());
		   fail();
	   }catch (NonexistObjectExeption e){
		   assertNotNull(e);
	   } catch (Exception e){
		   fail();
	   }
    }
	public void HashSearchtest2(){
		ArrayList<PassengerNode<String,Passenger>> pass = new ArrayList<>(setUpStage6());
		ArrayList<PassengerNode<String,Passenger>> pass2 = new ArrayList<>(setUpStage8());
		try{
		   HashTable<String,Passenger> has= new HashTable<String,Passenger>(1);
		   has.insert(pass.get(0).getKey(), pass.get(0).getValue());
		   has.insert(pass.get(1).getKey(), pass.get(1).getValue());
		   has.insert(pass.get(2).getKey(), pass.get(2).getValue());
		   has.insert(pass.get(3).getKey(), pass.get(3).getValue());
		   has.insert(pass.get(4).getKey(), pass.get(4).getValue());
		   has.insert(pass.get(5).getKey(), pass.get(5).getValue());
		   has.insert(pass.get(6).getKey(), pass.get(6).getValue());
		   has.insert(pass.get(7).getKey(), pass.get(7).getValue());;
		   Passenger p = has.search(pass2.get(0).getValue().getTicket());
		   Passenger s8p1 = new Passenger(" ",1110,"1a",350,1);
		   assertEquals("olvir Eusebius",p.getName());
		   assertEquals(1110,p.getId());
		   assertEquals("1a",p.getTicket());
		   assertEquals(350,p.getMiles());
		   assertEquals("physical disability",p.getTypeHelp());
		}catch(Exception e){
			fail();
		}
    }
	
	public void HashSearchtest3(){
      Plane fly1 = setUpStage1();
	  try{
		HashTable has= new HashTable(1);
		has.search(fly1.getNumFlight());
		fail();
	  }catch(IncorrectObjectExeption e){
		 assertNotNull(e);
	  }
    }
	
}