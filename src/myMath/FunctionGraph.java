package myMath;



import java.awt.Color;
import javax.swing.JFrame;
import de.erichseifert.gral.data.DataTable;
import de.erichseifert.gral.plots.XYPlot;
import de.erichseifert.gral.plots.lines.DefaultLineRenderer2D;
import de.erichseifert.gral.plots.lines.LineRenderer;
import de.erichseifert.gral.plots.points.PointRenderer;
import de.erichseifert.gral.ui.InteractivePanel;

public class FunctionGraph extends JFrame {
	public FunctionGraph(Polynom_able p1) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		DataTable data = new DataTable(Double.class, Double.class);
		DataTable critical = new DataTable(Double.class, Double.class);
		Polynom_able p2 = p1.copy();
		p2 = p2.derivative();
		int counter=0;
		double x3 = 0;
		double x2 = 0;
		for (double x = -2.0; x <= 6.0; x+=0.25) {
			double y = p1.f(x);
			data.add(x, y);
			x2 = x+0.25;
			if(IsCritical(p2,x)==0) {
				System.out.println("X = "+x+" , Y = "+y);
				critical.add(x, y);
				counter++;
			}
			else if(IsCritical(p2,x)!=IsCritical(p2,x2) && IsCritical(p2,x2) !=0) {
				x3 = p2.root(x,x2,0.0001);
				critical.add(x3,p1.f(x3));
				counter++;
				System.out.println("X = "+x+" , Y = "+y);
			}

		}
		System.out.println(counter);
		XYPlot plot = new XYPlot(data,critical);
		getContentPane().add(new InteractivePanel(plot));
		LineRenderer lines = new DefaultLineRenderer2D();
		plot.setLineRenderers(data, lines);
		Color color = new Color(0.0f, 0.0f, 0.0f);
//		Color color2 = new Color(0.6f, 0.0f, 0.0f);
		plot.getPointRenderers(data).get(0).setColor(color);
		plot.getLineRenderers(data).get(0).setColor(color);
		if(!plot.getPointRenderers(critical).isEmpty()) plot.getPointRenderers(critical).get(0).setColor(color.pink);
		
	}

	public int IsCritical(Polynom_able deriv,double x) {
		int flg=1;
		if(Math.abs(deriv.f(x))<0.25) flg = 0;
		else if(deriv.f(x)<0)flg=-1;
		return flg;
	}


	public static void main(String[] args) {
		Polynom p1 = new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
		FunctionGraph frame = new FunctionGraph(p1);
		frame.setVisible(true);
	}

}