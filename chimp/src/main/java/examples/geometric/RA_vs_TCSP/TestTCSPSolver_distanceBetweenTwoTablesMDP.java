package examples.geometric.RA_vs_TCSP;

import java.awt.Color;
import java.util.logging.Level;

import org.metacsp.framework.ConstraintNetwork;
import org.metacsp.framework.ConstraintSolver;
import org.metacsp.framework.Variable;
import org.metacsp.framework.multi.MultiVariable;
import org.metacsp.meta.TCSP.TCSPSolver;
import org.metacsp.multi.TCSP.DistanceConstraint;
import org.metacsp.multi.TCSP.DistanceConstraintSolver;
import org.metacsp.multi.TCSP.MultiTimePoint;
import org.metacsp.multi.spatial.rectangleAlgebra.UnaryRectangleConstraint;
import org.metacsp.time.Bounds;
import org.metacsp.time.TimePoint;
import org.metacsp.utility.logging.MetaCSPLogging;


public class TestTCSPSolver_distanceBetweenTwoTablesMDP {
	
	public static void main(String args[]) {
		
		int maxFuelLevel = 300;
		TCSPSolver metaSolverX = new TCSPSolver(0, maxFuelLevel, 0);
		DistanceConstraintSolver groundSolverX = (DistanceConstraintSolver)metaSolverX.getConstraintSolvers()[0];		
		
		MetaCSPLogging.setLevel(metaSolverX.getClass(), Level.FINEST);
//-----------------------------
		//get distance between two rectangularConstraint
		
		//  x lowerbound  , X upperbound ,Y lowerbound,  Y upperbound  
		UnaryRectangleConstraint ManAreacounter = new UnaryRectangleConstraint(UnaryRectangleConstraint.Type.At,
				 new Bounds(20,20),new Bounds(20,20), new Bounds(200,200), new Bounds(200, 200));
		
		UnaryRectangleConstraint ManAreaTable1 = new UnaryRectangleConstraint(UnaryRectangleConstraint.Type.At,
				 new Bounds(130,130),new Bounds(130,130), new Bounds(300,300), new Bounds(300,300));
		
		//get the two  coordination of the table
		long counterX = ManAreacounter.getBounds()[0].min;
		long counterY = ManAreacounter.getBounds()[3].max;

		long table1X = ManAreaTable1.getBounds()[0].min;
		long table1Y = ManAreaTable1.getBounds()[3].max;
		
		Long distCounterToTable1 = (long) Math.hypot(counterX-table1X, counterY-table1Y);
		System.out.println(distCounterToTable1);
		
		

		
		

		
		Bounds CounterToTable1 = new Bounds(-distCounterToTable1,-distCounterToTable1);
		Bounds Table1ToCorner1 = new Bounds(-50,-50);
		Bounds Corner1ToTable2 = new Bounds(-50,-50);

		Bounds Table1ToTable2 = new Bounds(-70,-70);

		
		
		MultiTimePoint counter1 = groundSolverX.getSink();
		MultiTimePoint table1 = (MultiTimePoint)groundSolverX.createVariable();
		MultiTimePoint table2fromCorner1 = (MultiTimePoint)groundSolverX.createVariable();
		MultiTimePoint table2fromTable1 = (MultiTimePoint)groundSolverX.createVariable();
		MultiTimePoint corner = (MultiTimePoint)groundSolverX.createVariable();
		
		counter1.setColor(Color.pink);
		 table2fromCorner1.setAttributes("Final"); 
		 table2fromCorner1.setColor(Color.blue);
		 table2fromTable1.setAttributes("Final"); 
		 table2fromTable1.setColor(Color.blue);

		ConstraintNetwork.draw(groundSolverX.getConstraintNetwork(), "TCSP_X");
		
		DistanceConstraint Ax = new DistanceConstraint(CounterToTable1);
		Ax.setFrom(counter1);
		Ax.setTo(table1);
		
		
		DistanceConstraint Cx = new DistanceConstraint(Table1ToTable2);
		Cx.setFrom(table1);
		Cx.setTo(table2fromTable1);
		
		DistanceConstraint bx = new DistanceConstraint(Table1ToCorner1);
		bx.setFrom(table1);
		bx.setTo(corner);
		
		DistanceConstraint dx = new DistanceConstraint(Corner1ToTable2);
		dx.setFrom(corner);
		dx.setTo(table2fromCorner1);


			
		long startTime = System.nanoTime();
		DistanceConstraint[] DS=	new DistanceConstraint[] {Ax,Cx,bx,dx};
		for(DistanceConstraint ds : DS) {
			if(ds.getFrom().equals(corner)) {
				MultiTimePoint k = (MultiTimePoint) ds.getScope()[0];
				System.out.println(k.getLowerBound());
				 //((TimePoint) k).setLowerBound(5);
//				 ((TimePoint)((MultiVariable) ds.getTo()).getInternalVariables()[0]).setLowerBound(11);
//				 ((TimePoint)((MultiVariable) ds.getTo()).getInternalVariables()[0]).setUpperBound(11);
//				 
//				 ((TimePoint)((MultiVariable) ds.getFrom()).getInternalVariables()[0]).setLowerBound(11);
//				 ((TimePoint)((MultiVariable) ds.getFrom()).getInternalVariables()[0]).setUpperBound(11);

				Bounds b = ds.getBounds()[0];
				b.min =+11;
				b.max =+11;


			}
			System.out.println(ds);

			System.out.println(groundSolverX.addConstraint(ds));
		}
		Variable[] v=groundSolverX.getVariables();
		ConstraintSolver a = groundSolverX.getConstraintSolvers()[0];
		for(Variable vv:v){
			System.out.println(vv.toString());
			//System.out.println(((MultiTimePoint) vv).getLowerBound());
			System.out.println(vv.getAttributes());
			
		}
		long endTime = System.nanoTime();
		System.out.println("Took "+((endTime - startTime) / 1000000) + " ms"); 

		
		
		//TU Delft
		//Leon Planken - see his website for temporal reasoning survey (2007)
		//See his JAIR 2012 for ICAPS work
		
	}

}
