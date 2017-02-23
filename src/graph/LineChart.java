
package graph;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author czimbortibor
 */
public class LineChart {
    
    private double[][] randomData, switchData;
    private ChartPanel chartPanel;
    private XYDataset dataset;
    
    public LineChart(double[][] randomData, double[][] switchData) {
        this.randomData = randomData;
        this.switchData = switchData;
        this.dataset = createDataset(this.randomData, this.switchData);  
        JFreeChart lineChart = ChartFactory.createXYLineChart("Simulation", "Iterations", "Good hits", dataset);
 
        // customization
        XYPlot plot = lineChart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesPaint(1, Color.GREEN);
        plot.setBackgroundPaint(Color.DARK_GRAY);
        plot.setRenderer(renderer); // finalizing
        
        this.chartPanel = new ChartPanel(lineChart);
    }
    
    private XYDataset createDataset(double[][] randomData, double[][] switchData) {
        XYSeriesCollection ds = new XYSeriesCollection();
        XYSeries randomDataset = new XYSeries("random selection");
        XYSeries switchDataset = new XYSeries("switch selection");
        for (int i = 0; i < randomData[0].length; ++i) {
            randomDataset.add(randomData[0][i], randomData[1][i]);
        }
        for (int i = 0; i < switchData[0].length; ++i) {
            switchDataset.add(switchData[0][i], switchData[1][i]);
        }
        ds.addSeries(randomDataset);
        ds.addSeries(switchDataset);
        
        return ds;
    }
    
    public ChartPanel getChartPanel(){
        return this.chartPanel;
    }
    
    public void refresh(double[][] randomData, double[][] switchData) {
        dataset = createDataset(randomData, switchData);
        JFreeChart lineChart = ChartFactory.createXYLineChart("Simulation", "Iterations", "Good hits", dataset);
        XYPlot plot = lineChart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesPaint(1, Color.GREEN);
        plot.setBackgroundPaint(Color.DARK_GRAY);
        plot.setRenderer(renderer);
        this.chartPanel = new ChartPanel(lineChart);
    }
}
