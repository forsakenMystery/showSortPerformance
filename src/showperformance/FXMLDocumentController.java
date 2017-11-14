/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showperformance;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import sort.*;
/**
 *
 * @author FORSAKEN MYSTERY
 */
public class FXMLDocumentController implements Initializable {
    int xAxis[]={1,5,7,10,15,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,1500,2000,2500,3000,3500,4000,4500,5000,5500,6000,6500,7000,7500,8000,8500,9000,9500,10000,11000,12000,13000,14000,15000,20000};
    int Data[];
    MergeSort ms=new MergeSort();
//    InsertionSort is=new InsertionSort();
    ShellSort ss=new ShellSort();
    HybridSort hs=new HybridSort();
    
    @FXML
    private Button random;
    @FXML
    private Button unsorted;
    @FXML
    private Button sorted;
    @FXML
    private Button same;
    @FXML
    private Button exit;
    @FXML
    private LineChart<String , Number> Diagram;
    
    XYChart.Series merge/*,insert*/,Shell,hybrid;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @FXML
    private void RandomClicked(MouseEvent event) {
        Diagram.getData().clear();
        int yAxisMerge[]/*,yAxisInsert[]*/,yAxisShell[],yAxisHybrid[];
        merge=new XYChart.Series<>();
//        insert=new XYChart.Series<>();
        Shell=new XYChart.Series<>();
        hybrid=new XYChart.Series<>();
        int temp[];
        yAxisMerge=new int[xAxis.length];
//        yAxisInsert=new int[xAxis.length];
        yAxisShell=new int[xAxis.length];
        yAxisHybrid=new int[xAxis.length];
        for(int i=0;i<xAxis.length;i++){
            Data=new int[xAxis[i]];
            temp=new int[xAxis[i]];
            DataGenerator.get().gegenerateRandom(Data);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisMerge[i]=ms.sort(temp);
//            System.arraycopy(Data, 0, temp, 0, temp.length);
//            yAxisInsert[i]=is.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisShell[i]=ss.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisHybrid[i]=hs.sort(temp);
        }
        merge.setName("Merge Sort");
//        insert.setName("Insertion Sort");
        Shell.setName("Shell Sort");
        hybrid.setName("Hybrid Sort");
        for(int i=0;i<xAxis.length;i++){
            merge.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisMerge[i]));
//            insert.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisInsert[i]));
            Shell.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisShell[i]));
            hybrid.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisHybrid[i]));
        }
        Diagram.getData().add(merge);
//        Diagram.getData().add(insert);
        Diagram.getData().add(Shell);
        Diagram.getData().add(hybrid);
    }
    
    @FXML
    private void UnsortedClicked(MouseEvent event) {Diagram.getData().clear();
        int yAxisMerge[]/*,yAxisInsert[]*/,yAxisShell[],yAxisHybrid[];
        merge=new XYChart.Series<>();
//        insert=new XYChart.Series<>();
        Shell=new XYChart.Series<>();
        hybrid=new XYChart.Series<>();
        int temp[];
        yAxisMerge=new int[xAxis.length];
//        yAxisInsert=new int[xAxis.length];
        yAxisShell=new int[xAxis.length];
        yAxisHybrid=new int[xAxis.length];
        for(int i=0;i<xAxis.length;i++){
            Data=new int[xAxis[i]];
            temp=new int[xAxis[i]];
            DataGenerator.get().generateDecreasing(Data);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisMerge[i]=ms.sort(temp);
//            System.arraycopy(Data, 0, temp, 0, temp.length);
//            yAxisInsert[i]=is.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisShell[i]=ss.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisHybrid[i]=hs.sort(temp);
        }
        merge.setName("Merge Sort");
//        insert.setName("Insertion Sort");
        Shell.setName("Shell Sort");
        hybrid.setName("Hybrid Sort");
        for(int i=0;i<xAxis.length;i++){
            merge.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisMerge[i]));
//            insert.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisInsert[i]));
            Shell.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisShell[i]));
            hybrid.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisHybrid[i]));
        }
        Diagram.getData().add(merge);
//        Diagram.getData().add(insert);
        Diagram.getData().add(Shell);
        Diagram.getData().add(hybrid);
    }

    @FXML
    private void SortedClicked(MouseEvent event) {Diagram.getData().clear();
        int yAxisMerge[]/*,yAxisInsert[]*/,yAxisShell[],yAxisHybrid[];
        merge=new XYChart.Series<>();
//        insert=new XYChart.Series<>();
        Shell=new XYChart.Series<>();
        hybrid=new XYChart.Series<>();
        int temp[];
        yAxisMerge=new int[xAxis.length];
//        yAxisInsert=new int[xAxis.length];
        yAxisShell=new int[xAxis.length];
        yAxisHybrid=new int[xAxis.length];
        for(int i=0;i<xAxis.length;i++){
            Data=new int[xAxis[i]];
            temp=new int[xAxis[i]];
            DataGenerator.get().generateIncreasing(Data);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisMerge[i]=ms.sort(temp);
//            System.arraycopy(Data, 0, temp, 0, temp.length);
//            yAxisInsert[i]=is.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisShell[i]=ss.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisHybrid[i]=hs.sort(temp);
        }
        merge.setName("Merge Sort");
//        insert.setName("Insertion Sort");
        Shell.setName("Shell Sort");
        hybrid.setName("Hybrid Sort");
        for(int i=0;i<xAxis.length;i++){
            merge.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisMerge[i]));
//            insert.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisInsert[i]));
            Shell.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisShell[i]));
            hybrid.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisHybrid[i]));
        }
        Diagram.getData().add(merge);
//        Diagram.getData().add(insert);
        Diagram.getData().add(Shell);
        Diagram.getData().add(hybrid);
    }

    @FXML
    private void SameClicked(MouseEvent event) {Diagram.getData().clear();
        int yAxisMerge[]/*,yAxisInsert[]*/,yAxisShell[],yAxisHybrid[];
        merge=new XYChart.Series<>();
//        insert=new XYChart.Series<>();
        Shell=new XYChart.Series<>();
        hybrid=new XYChart.Series<>();
        int temp[];
        yAxisMerge=new int[xAxis.length];
//        yAxisInsert=new int[xAxis.length];
        yAxisShell=new int[xAxis.length];
        yAxisHybrid=new int[xAxis.length];
        for(int i=0;i<xAxis.length;i++){
            Data=new int[xAxis[i]];
            temp=new int[xAxis[i]];
            DataGenerator.get().generateSame(Data);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisMerge[i]=ms.sort(temp);
//            System.arraycopy(Data, 0, temp, 0, temp.length);
//            yAxisInsert[i]=is.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisShell[i]=ss.sort(temp);
            System.arraycopy(Data, 0, temp, 0, temp.length);
            yAxisHybrid[i]=hs.sort(temp);
        }
        merge.setName("Merge Sort");
//        insert.setName("Insertion Sort");
        Shell.setName("Shell Sort");
        hybrid.setName("Hybrid Sort");
        for(int i=0;i<xAxis.length;i++){
            merge.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisMerge[i]));
//            insert.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisInsert[i]));
            Shell.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisShell[i]));
            hybrid.getData().add(new XYChart.Data<>(Integer.toString(xAxis[i]), yAxisHybrid[i]));
        }
        Diagram.getData().add(merge);
//        Diagram.getData().add(insert);
        Diagram.getData().add(Shell);
        Diagram.getData().add(hybrid);
    }

    @FXML
    private void ExitClicked(MouseEvent event) {
        System.exit(0);
    }

    
    
   
}
