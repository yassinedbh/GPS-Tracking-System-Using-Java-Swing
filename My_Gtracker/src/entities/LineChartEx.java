package entities;

import connexion.Connexion;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LineChartEx extends JFrame {

    public LineChartEx() throws SQLException {

        initUI();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private void initUI() throws SQLException {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.blue);
        add(chartPanel);

        pack();
        setTitle("Statistique des positions par chaque tracker");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private XYDataset createDataset() throws SQLException {

        XYSeries series = new XYSeries("Position Par Tracker");
        XYSeriesCollection dataset = new XYSeriesCollection();
        String req = "SELECT count(*) as Nombres ,t.*,p.* FROM position p inner join tracker  t on t.id=p.idTracker group by p.idTracker; ";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = pr.executeQuery();
			while (rs.next())
			      series.add(rs.getInt("Nombres"), rs.getInt("idTracker"));
        dataset.addSeries(series);
        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Position Par Tracker",
                "Tracker",
                "Position",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.pink);
        renderer.setSeriesStroke(0, new BasicStroke(3.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.gray);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.white);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.white);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Position Par Trackere",
                        new Font("Serif", java.awt.Font.BOLD, 50)
                )
        );

        return chart;
    }

    public static void main(String[] args) {

    
    }
}