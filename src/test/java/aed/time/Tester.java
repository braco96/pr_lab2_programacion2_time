package TimeInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;


/**
 * @author Guillermo Vigueras
 *
 */

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		      String[] ids = ManagementFactory.getRuntimeMXBean().getName()
			  .split("@");
		      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
		      bw.write(ids[0]);
		      bw.close();
		} catch (Exception e) {
		    System.out.println("Avisa al profesor de fallo sacando el PID");
		}

		
	    try {	
	    	
		{
			Time t1 = new TimeHMS(1,20,0,0);
			Time t2 = new TimeHMS(1,10,0,0);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(72000));			
			
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(20));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(0));			
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(0));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));			

			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));			

			do_check("suma()",t1,t2,t1.suma(t2),new Integer(108000));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(36000));			
			
		}		

		{
			Time t1 = new TimeSec(36000);
			Time t2 = new TimeHMS(1,20,0,0);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(36000));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(72000));			
			
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(10));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(0));			
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(0));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));			

			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t1,t2,new Boolean(t2.equals(t1)),new Boolean(false));			

			do_check("suma()",t1,t2,t1.suma(t2),new Integer(108000));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-36000));			
			
		}		
						
	    ////////////////////////////// BEGIN AUTO-GENERATED TEST CASES //////////////////////////////		
		{
			Time t1 = new TimeHMS(-1,8,2,2);
			Time t2 = new TimeSec(-5989);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-28922));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-5989));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(8));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(2));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(2));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(1));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(39));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(49));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-34911));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-34911));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-22933));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(22933));
		}

		{
			Time t1 = new TimeHMS(-1,8,46,13);
			Time t2 = new TimeSec(-188336);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-31573));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-188336));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(8));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(46));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(13));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(52));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(18));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(56));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-219909));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-219909));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(156763));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-156763));
		}

		{
			Time t1 = new TimeSec(-155942);
			Time t2 = new TimeSec(67771);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-155942));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(67771));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(43));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(19));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(2));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(18));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(49));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(31));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-88171));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-88171));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-223713));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(223713));
		}

		{
			Time t1 = new TimeHMS(-1,29,30,49);
			Time t2 = new TimeSec(-106249);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-106249));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-106249));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(29));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(30));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(49));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(29));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(30));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(49));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-212498));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-212498));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(1,39,8,14);
			Time t2 = new TimeSec(-135563);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(140894));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-135563));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(39));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(8));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(14));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(37));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(39));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(23));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(5331));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(5331));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(276457));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-276457));
		}

		{
			Time t1 = new TimeHMS(1,12,38,10);
			Time t2 = new TimeSec(125610);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(45490));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(125610));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(12));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(38));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(10));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(34));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(53));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(30));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(171100));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(171100));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-80120));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(80120));
		}

		{
			Time t1 = new TimeHMS(-1,10,54,34);
			Time t2 = new TimeSec(-39274);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-39274));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-39274));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(10));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(54));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(34));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(10));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(54));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(34));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-78548));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-78548));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(-197432);
			Time t2 = new TimeSec(-155942);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-197432));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-155942));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(54));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(50));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(32));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(43));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(19));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(2));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-353374));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-353374));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-41490));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(41490));
		}

		{
			Time t1 = new TimeSec(-186789);
			Time t2 = new TimeSec(42287);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-186789));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(42287));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(51));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(53));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(9));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(11));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(44));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(47));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-144502));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-144502));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-229076));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(229076));
		}

		{
			Time t1 = new TimeSec(-82399);
			Time t2 = new TimeSec(25082);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-82399));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(25082));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(22));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(53));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(19));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(6));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(58));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(2));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-57317));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-57317));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-107481));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(107481));
		}

		{
			Time t1 = new TimeHMS(1,37,1,31);
			Time t2 = new TimeSec(133291);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(133291));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(133291));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(37));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(1));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(31));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(37));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(1));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(31));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(266582));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(266582));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,46,34,21);
			Time t2 = new TimeSec(-167661);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-167661));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-167661));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(46));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(34));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(46));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(34));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(21));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-335322));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-335322));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,47,1,49);
			Time t2 = new TimeSec(-169309);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-169309));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-169309));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(47));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(1));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(49));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(47));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(1));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(49));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-338618));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-338618));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,35,52,7);
			Time t2 = new TimeSec(4863);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-129127));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(4863));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(35));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(52));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(7));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(1));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(21));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(3));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-124264));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-124264));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-133990));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(133990));
		}

		{
			Time t1 = new TimeSec(122761);
			Time t2 = new TimeSec(122761);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(122761));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(122761));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(34));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(6));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(1));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(34));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(6));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(1));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(245522));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(245522));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(25082);
			Time t2 = new TimeSec(45490);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(25082));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(45490));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(6));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(58));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(2));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(12));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(38));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(10));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(70572));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(70572));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-20408));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(20408));
		}

		{
			Time t1 = new TimeSec(74202);
			Time t2 = new TimeSec(-116764);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(74202));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-116764));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(20));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(36));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(42));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(32));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(26));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(4));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-42562));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-42562));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(190966));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-190966));
		}

		{
			Time t1 = new TimeHMS(-1,51,53,9);
			Time t2 = new TimeSec(148678);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-186789));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(148678));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(51));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(53));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(9));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(41));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(17));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(58));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-38111));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-38111));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-335467));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(335467));
		}

		{
			Time t1 = new TimeSec(-20459);
			Time t2 = new TimeSec(-19862);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-20459));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-19862));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(5));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(40));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(59));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(5));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(31));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(2));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-40321));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-40321));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-597));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(597));
		}

		{
			Time t1 = new TimeSec(-105743);
			Time t2 = new TimeSec(-105743);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-105743));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-105743));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(29));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(22));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(23));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(29));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(22));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(23));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-211486));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-211486));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(4863);
			Time t2 = new TimeSec(4308);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(4863));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(4308));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(1));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(21));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(3));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(1));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(11));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(48));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(9171));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(9171));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(555));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-555));
		}

		{
			Time t1 = new TimeSec(-145168);
			Time t2 = new TimeSec(97195);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-145168));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(97195));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(40));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(19));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(28));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(26));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(59));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(55));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-47973));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-47973));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-242363));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(242363));
		}

		{
			Time t1 = new TimeHMS(1,26,55,1);
			Time t2 = new TimeSec(157293);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(96901));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(157293));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(26));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(55));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(1));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(43));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(41));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(33));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(254194));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(254194));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-60392));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(60392));
		}

		{
			Time t1 = new TimeHMS(1,32,53,43);
			Time t2 = new TimeSec(-153236);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(118423));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-153236));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(32));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(53));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(43));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(42));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(33));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(56));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-34813));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-34813));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(271659));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-271659));
		}

		{
			Time t1 = new TimeSec(42287);
			Time t2 = new TimeSec(-178705);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(42287));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-178705));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(11));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(44));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(47));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(49));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(38));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(25));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-136418));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-136418));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(220992));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-220992));
		}

		{
			Time t1 = new TimeSec(181456);
			Time t2 = new TimeSec(157262);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(181456));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(157262));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(50));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(24));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(16));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(43));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(41));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(2));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(338718));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(338718));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(24194));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-24194));
		}

		{
			Time t1 = new TimeHMS(-1,25,51,44);
			Time t2 = new TimeSec(59952);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-93104));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(59952));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(25));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(51));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(44));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(16));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(39));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(12));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-33152));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-33152));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-153056));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(153056));
		}

		{
			Time t1 = new TimeSec(172969);
			Time t2 = new TimeSec(37505);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(172969));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(37505));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(48));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(2));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(49));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(10));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(25));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(5));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(210474));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(210474));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(135464));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-135464));
		}

		{
			Time t1 = new TimeSec(-26090);
			Time t2 = new TimeSec(171175);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-26090));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(171175));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(7));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(14));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(50));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(47));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(32));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(55));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(145085));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(145085));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-197265));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(197265));
		}

		{
			Time t1 = new TimeHMS(-1,37,39,23);
			Time t2 = new TimeSec(51275);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-135563));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(51275));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(37));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(39));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(23));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(14));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(14));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(35));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-84288));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-84288));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-186838));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(186838));
		}

		{
			Time t1 = new TimeHMS(1,25,18,1);
			Time t2 = new TimeSec(35571);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(91081));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(35571));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(25));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(18));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(1));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(9));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(52));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(51));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(126652));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(126652));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(55510));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-55510));
		}

		{
			Time t1 = new TimeSec(197741);
			Time t2 = new TimeSec(-61218);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(197741));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-61218));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(54));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(55));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(41));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(17));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(0));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(18));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(136523));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(136523));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(258959));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-258959));
		}

		{
			Time t1 = new TimeSec(-20459);
			Time t2 = new TimeSec(-20459);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-20459));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-20459));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(5));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(40));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(59));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(5));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(40));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(59));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-40918));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-40918));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,51,7,32);
			Time t2 = new TimeSec(-184052);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-184052));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-184052));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(51));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(7));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(32));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(51));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(7));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(32));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-368104));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-368104));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,51,29,46);
			Time t2 = new TimeSec(-113844);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-185386));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-113844));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(51));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(29));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(46));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(31));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(37));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(24));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-299230));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-299230));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-71542));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(71542));
		}

		{
			Time t1 = new TimeSec(133291);
			Time t2 = new TimeSec(-165951);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(133291));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-165951));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(37));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(1));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(31));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(46));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(5));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(51));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-32660));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-32660));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(299242));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-299242));
		}

		{
			Time t1 = new TimeHMS(-1,46,9,26);
			Time t2 = new TimeSec(-196604);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-166166));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-196604));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(46));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(9));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(26));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(54));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(36));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(44));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-362770));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-362770));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(30438));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-30438));
		}

		{
			Time t1 = new TimeHMS(1,37,6,59);
			Time t2 = new TimeSec(-136097);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(133619));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-136097));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(37));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(6));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(59));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(37));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(48));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(17));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-2478));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-2478));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(269716));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-269716));
		}

		{
			Time t1 = new TimeHMS(-1,5,7,20);
			Time t2 = new TimeSec(170079);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-18440));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(170079));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(5));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(7));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(20));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(47));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(14));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(39));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(151639));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(151639));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-188519));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(188519));
		}

		{
			Time t1 = new TimeHMS(1,18,59,38);
			Time t2 = new TimeSec(35824);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(68378));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(35824));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(18));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(59));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(38));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(9));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(57));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(4));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(104202));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(104202));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(32554));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-32554));
		}

		{
			Time t1 = new TimeHMS(1,10,36,46);
			Time t2 = new TimeSec(-39956);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(38206));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-39956));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(10));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(36));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(46));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(11));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(5));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(56));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-1750));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-1750));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(78162));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-78162));
		}

		{
			Time t1 = new TimeHMS(1,33,17,25);
			Time t2 = new TimeSec(23036);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(119845));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(23036));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(33));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(17));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(25));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(6));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(23));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(56));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(142881));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(142881));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(96809));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-96809));
		}

		{
			Time t1 = new TimeHMS(-1,3,11,53);
			Time t2 = new TimeSec(-11513);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-11513));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-11513));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(3));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(11));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(53));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(3));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(11));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(53));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-23026));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-23026));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(9938);
			Time t2 = new TimeSec(-187351);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(9938));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-187351));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(2));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(45));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(38));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(52));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(2));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(31));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-177413));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-177413));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(197289));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-197289));
		}

		{
			Time t1 = new TimeSec(138245);
			Time t2 = new TimeSec(133619);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(138245));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(133619));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(38));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(24));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(5));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(37));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(6));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(59));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(271864));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(271864));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(4626));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-4626));
		}

		{
			Time t1 = new TimeSec(108861);
			Time t2 = new TimeSec(74005);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(108861));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(74005));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(30));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(14));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(20));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(33));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(25));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(182866));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(182866));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(34856));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-34856));
		}

		{
			Time t1 = new TimeSec(131541);
			Time t2 = new TimeSec(-61218);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(131541));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-61218));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(36));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(32));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(17));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(0));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(18));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(70323));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(70323));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(192759));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-192759));
		}

		{
			Time t1 = new TimeHMS(1,36,32,21);
			Time t2 = new TimeSec(74005);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(131541));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(74005));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(36));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(32));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(20));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(33));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(25));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(205546));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(205546));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(57536));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-57536));
		}

		{
			Time t1 = new TimeHMS(1,44,2,21);
			Time t2 = new TimeSec(-137656);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(158541));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-137656));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(44));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(2));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(38));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(14));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(16));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(20885));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(20885));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(296197));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-296197));
		}

		{
			Time t1 = new TimeHMS(-1,15,53,26);
			Time t2 = new TimeSec(-93798);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-57206));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-93798));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(15));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(53));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(26));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(26));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(3));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(18));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-151004));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-151004));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(36592));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-36592));
		}

		{
			Time t1 = new TimeHMS(-1,36,25,16);
			Time t2 = new TimeSec(174428);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-131116));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(174428));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(36));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(25));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(16));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(48));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(27));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(8));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(43312));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(43312));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-305544));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(305544));
		}

		{
			Time t1 = new TimeSec(158541);
			Time t2 = new TimeSec(-44743);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(158541));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-44743));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(44));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(2));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(12));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(25));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(43));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(113798));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(113798));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(203284));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-203284));
		}

		{
			Time t1 = new TimeSec(-45635);
			Time t2 = new TimeSec(108433);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-45635));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(108433));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(12));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(40));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(35));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(30));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(7));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(13));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(62798));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(62798));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-154068));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(154068));
		}

		{
			Time t1 = new TimeHMS(-1,35,21,4);
			Time t2 = new TimeSec(164593);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-127264));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(164593));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(35));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(21));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(4));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(45));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(43));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(13));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(37329));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(37329));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-291857));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(291857));
		}

		{
			Time t1 = new TimeSec(123001);
			Time t2 = new TimeSec(117717);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(123001));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(117717));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(34));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(10));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(1));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(32));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(41));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(57));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(240718));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(240718));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(5284));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-5284));
		}

		{
			Time t1 = new TimeHMS(1,36,30,28);
			Time t2 = new TimeSec(83892);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(131428));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(83892));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(36));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(30));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(28));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(23));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(18));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(12));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(215320));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(215320));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(47536));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-47536));
		}

		{
			Time t1 = new TimeHMS(1,20,1,1);
			Time t2 = new TimeSec(151144);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(72061));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(151144));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(20));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(1));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(1));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(41));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(59));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(4));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(223205));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(223205));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-79083));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(79083));
		}

		{
			Time t1 = new TimeHMS(-1,32,37,30);
			Time t2 = new TimeSec(-28922);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-117450));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-28922));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(32));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(37));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(30));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(8));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(2));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(2));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-146372));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-146372));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-88528));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(88528));
		}

		{
			Time t1 = new TimeSec(-71498);
			Time t2 = new TimeSec(122761);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-71498));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(122761));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(19));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(51));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(38));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(34));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(6));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(1));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(51263));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(51263));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-194259));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(194259));
		}

		{
			Time t1 = new TimeHMS(-1,10,43,40);
			Time t2 = new TimeSec(1168);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-38620));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(1168));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(10));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(43));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(40));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(0));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(19));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(28));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-37452));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-37452));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-39788));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(39788));
		}

		{
			Time t1 = new TimeHMS(-1,52,22,4);
			Time t2 = new TimeSec(-63519);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-188524));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-63519));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(52));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(22));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(4));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(17));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(38));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(39));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-252043));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-252043));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-125005));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(125005));
		}

		{
			Time t1 = new TimeSec(-27543);
			Time t2 = new TimeSec(116626);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-27543));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(116626));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(7));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(39));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(3));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(32));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(23));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(46));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(89083));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(89083));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-144169));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(144169));
		}

		{
			Time t1 = new TimeSec(108861);
			Time t2 = new TimeSec(-122647);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(108861));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-122647));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(30));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(14));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(34));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(4));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(7));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-13786));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-13786));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(231508));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-231508));
		}

		{
			Time t1 = new TimeSec(100343);
			Time t2 = new TimeSec(100343);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(100343));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(100343));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(27));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(52));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(23));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(27));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(52));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(23));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(200686));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(200686));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,5,40,59);
			Time t2 = new TimeSec(-20459);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-20459));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-20459));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(5));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(40));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(59));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(5));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(40));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(59));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-40918));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-40918));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(-82088);
			Time t2 = new TimeSec(-173122);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-82088));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-173122));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(22));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(48));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(8));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(48));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(5));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(22));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-255210));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-255210));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(91034));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-91034));
		}

		{
			Time t1 = new TimeSec(-34457);
			Time t2 = new TimeSec(36493);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-34457));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(36493));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(9));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(34));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(17));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(10));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(8));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(13));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(2036));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(2036));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-70950));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(70950));
		}

		{
			Time t1 = new TimeSec(-162793);
			Time t2 = new TimeSec(-162793);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-162793));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-162793));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(45));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(13));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(13));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(45));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(13));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(13));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-325586));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-325586));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,52,20,57);
			Time t2 = new TimeSec(50721);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-188457));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(50721));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(52));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(20));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(57));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(14));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(5));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(21));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-137736));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-137736));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-239178));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(239178));
		}

		{
			Time t1 = new TimeHMS(1,8,20,20);
			Time t2 = new TimeSec(30020);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(30020));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(30020));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(8));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(20));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(20));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(8));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(20));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(20));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(60040));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(60040));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(64674);
			Time t2 = new TimeSec(-105743);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(64674));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-105743));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(17));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(57));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(54));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(29));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(22));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(23));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-41069));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-41069));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(170417));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-170417));
		}

		{
			Time t1 = new TimeHMS(-1,2,41,57);
			Time t2 = new TimeSec(177823);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-9717));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(177823));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(2));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(41));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(57));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(49));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(23));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(43));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(168106));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(168106));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-187540));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(187540));
		}

		{
			Time t1 = new TimeSec(50721);
			Time t2 = new TimeSec(-93798);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(50721));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-93798));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(14));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(5));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(26));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(3));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(18));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-43077));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-43077));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(144519));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-144519));
		}

		{
			Time t1 = new TimeHMS(1,4,8,41);
			Time t2 = new TimeSec(39223);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(14921));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(39223));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(4));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(8));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(41));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(10));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(53));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(43));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(54144));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(54144));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-24302));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(24302));
		}

		{
			Time t1 = new TimeSec(170594);
			Time t2 = new TimeSec(170594);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(170594));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(170594));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(47));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(23));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(14));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(47));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(23));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(14));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(341188));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(341188));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(1,43,41,2);
			Time t2 = new TimeSec(158541);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(157262));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(158541));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(43));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(41));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(2));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(44));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(2));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(21));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(315803));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(315803));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-1279));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(1279));
		}

		{
			Time t1 = new TimeSec(131428);
			Time t2 = new TimeSec(131428);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(131428));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(131428));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(36));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(30));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(28));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(36));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(30));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(28));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(262856));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(262856));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(-163410);
			Time t2 = new TimeSec(30318);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-163410));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(30318));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(45));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(23));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(30));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(8));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(25));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(18));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-133092));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-133092));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-193728));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(193728));
		}

		{
			Time t1 = new TimeHMS(1,20,28,48);
			Time t2 = new TimeSec(-93798);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(73728));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-93798));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(20));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(28));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(48));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(26));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(3));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(18));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-20070));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-20070));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(167526));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-167526));
		}

		{
			Time t1 = new TimeSec(-11513);
			Time t2 = new TimeSec(30020);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-11513));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(30020));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(3));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(11));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(53));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(8));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(20));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(20));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(18507));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(18507));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-41533));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(41533));
		}

		{
			Time t1 = new TimeHMS(-1,48,9,18);
			Time t2 = new TimeSec(-133855);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-173358));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-133855));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(48));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(9));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(18));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(37));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(10));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(55));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-307213));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-307213));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-39503));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(39503));
		}

		{
			Time t1 = new TimeSec(49237);
			Time t2 = new TimeSec(-188457);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(49237));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-188457));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(13));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(40));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(37));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(52));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(20));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(57));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-139220));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-139220));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(237694));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-237694));
		}

		{
			Time t1 = new TimeSec(91287);
			Time t2 = new TimeSec(64674);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(91287));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(64674));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(25));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(21));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(27));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(17));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(57));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(54));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(155961));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(155961));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(26613));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-26613));
		}

		{
			Time t1 = new TimeSec(-9717);
			Time t2 = new TimeSec(-131116);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-9717));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-131116));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(2));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(41));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(57));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(36));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(25));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(16));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-140833));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-140833));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(121399));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-121399));
		}

		{
			Time t1 = new TimeSec(148678);
			Time t2 = new TimeSec(148678);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(148678));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(148678));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(41));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(17));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(58));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(41));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(17));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(58));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(297356));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(297356));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(-4265);
			Time t2 = new TimeSec(-4265);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-4265));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-4265));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(1));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(11));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(5));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(1));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(11));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(5));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-8530));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-8530));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeSec(-132881);
			Time t2 = new TimeSec(120888);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-132881));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(120888));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(36));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(54));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(41));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(33));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(34));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(48));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-11993));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-11993));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-253769));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(253769));
		}

		{
			Time t1 = new TimeHMS(-1,25,31,33);
			Time t2 = new TimeSec(55964);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-91893));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(55964));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(25));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(31));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(33));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(15));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(32));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(44));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-35929));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-35929));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-147857));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(147857));
		}

		{
			Time t1 = new TimeHMS(1,3,39,42);
			Time t2 = new TimeSec(147206);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(13182));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(147206));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(3));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(39));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(42));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(40));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(53));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(26));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(160388));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(160388));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-134024));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(134024));
		}

		{
			Time t1 = new TimeSec(-31573);
			Time t2 = new TimeSec(-31573);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-31573));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-31573));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(8));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(46));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(13));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(8));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(46));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(13));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-63146));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-63146));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(-1,39,30,10);
			Time t2 = new TimeSec(-38620);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-142210));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-38620));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(39));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(30));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(10));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(10));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(43));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(40));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-180830));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-180830));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-103590));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(103590));
		}

		{
			Time t1 = new TimeSec(4863);
			Time t2 = new TimeSec(105328);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(4863));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(105328));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(1));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(21));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(3));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(29));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(15));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(28));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(110191));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(110191));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-100465));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(100465));
		}

		{
			Time t1 = new TimeSec(-23212);
			Time t2 = new TimeSec(-23212);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-23212));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-23212));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(6));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(26));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(52));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(6));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(26));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(52));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(true));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(true));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-46424));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-46424));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(0));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(0));
		}

		{
			Time t1 = new TimeHMS(1,8,48,58);
			Time t2 = new TimeSec(-167661);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(31738));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-167661));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(8));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(48));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(58));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(46));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(34));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(21));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-135923));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-135923));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(199399));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-199399));
		}

		{
			Time t1 = new TimeSec(-32309);
			Time t2 = new TimeSec(172247);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-32309));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(172247));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(8));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(58));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(29));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(47));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(50));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(47));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(139938));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(139938));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-204556));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(204556));
		}

		{
			Time t1 = new TimeHMS(1,1,11,48);
			Time t2 = new TimeSec(-162793);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(4308));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-162793));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(1));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(11));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(48));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(45));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(13));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(13));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-158485));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-158485));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(167101));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-167101));
		}

		{
			Time t1 = new TimeHMS(1,30,14,21);
			Time t2 = new TimeSec(13182);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(108861));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(13182));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(30));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(14));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(21));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(3));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(39));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(42));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(122043));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(122043));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(95679));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-95679));
		}

		{
			Time t1 = new TimeHMS(1,13,38,1);
			Time t2 = new TimeSec(-196604);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(49081));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-196604));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(13));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(38));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(1));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(54));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(36));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(44));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(-147523));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(-147523));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(245685));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-245685));
		}

		{
			Time t1 = new TimeSec(84671);
			Time t2 = new TimeSec(-26090);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(84671));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(-26090));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(23));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(31));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(11));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(7));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(14));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(50));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(-1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(58581));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(58581));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(110761));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(-110761));
		}

		{
			Time t1 = new TimeSec(-66213);
			Time t2 = new TimeSec(172969);

			do_check("timeInSeconds()",t1,null,new Integer(t1.timeInSeconds()),new Integer(-66213));
			do_check("timeInSeconds()",t2,null,new Integer(t2.timeInSeconds()),new Integer(172969));
			do_check("getHour()",t1,null,new Integer(t1.getHour()),new Integer(18));
			do_check("getMins()",t1,null,new Integer(t1.getMins()),new Integer(23));
			do_check("getSecs()",t1,null,new Integer(t1.getSecs()),new Integer(33));
			do_check("getSign()",t1,null,new Integer(t1.getSign()),new Integer(-1));
			do_check("getHour()",t2,null,new Integer(t2.getHour()),new Integer(48));
			do_check("getMins()",t2,null,new Integer(t2.getMins()),new Integer(2));
			do_check("getSecs()",t2,null,new Integer(t2.getSecs()),new Integer(49));
			do_check("getSign()",t2,null,new Integer(t2.getSign()),new Integer(1));
			do_check("equals()",t1,t2,new Boolean(t1.equals(t2)),new Boolean(false));
			do_check("equals()",t2,t1,new Boolean(t2.equals(t1)),new Boolean(false));
			do_check("suma()",t1,t2,t1.suma(t2),new Integer(106756));
			do_check("suma()",t2,t1,t2.suma(t1),new Integer(106756));
			do_check("resta()",t1,t2,t1.resta(t2),new Integer(-239182));
			do_check("resta()",t2,t1,t2.resta(t1),new Integer(239182));
		}

		////////////////////////////// END AUTO-GENERATED TEST CASES //////////////////////////////		
		
	    } catch (Exception exc) {
			System.out.println("\n*** Tester Error: returns exception\n"+exc.toString());
			throw new Error("Error en test: resultado incorrecto");		
	    }		
		
		System.out.println("\n Tester: Test finalizado correctamente.");
	}
	
	static void do_check(String op,Time t1, Time t2, Object result, Object expected) {	    

	    boolean correct = false;
	    if(result instanceof Integer || result instanceof Boolean)
	    	correct = result.equals(expected);		    	    	
	    else{
	    	Time t = (Time) result;
	    	correct = ((Integer)expected).intValue() == t.timeInSeconds();
	    }
	    
	    if (!correct) {
	    	String ErrMsg = "\n*** Tester Error: "+ op +" method\n"+
	    			" returns "+ result.toString() + "\n" + 
					" instead of " + expected.toString() + " for operands: \n";

			if(t1!=null)
				ErrMsg += " " + t1.toString();
			if(t1!=null && t2!=null)
				ErrMsg += " and \n";
			if(t2!=null)			
				ErrMsg += " " + t2.toString()+".\n";
	    	
	    	System.out.println(ErrMsg);
						
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}	

}
