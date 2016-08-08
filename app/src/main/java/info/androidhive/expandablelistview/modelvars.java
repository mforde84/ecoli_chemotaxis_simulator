package info.androidhive.expandablelistview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.provider.Settings;
import android.widget.LinearLayout;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class modelvars {

    public static double time_sim = 500, matrix_x = 2, matrix_y = 2, ini_pos_x = 1, ini_pos_y = 1, source_x = 1, source_y = 1, att_max = 0.1, att_min = 0, att_rate = 0.001, g_sigma = 5, step_val = 0.03, add_step = 5, rem_step = 350, diff_const = 0.062, cell_velocity = 20, rest_rate = 0.65, chez = 100, zphos = 30, chey = 100, yphos = 100, cheb = 100, bcat = 0.0364, cher = 100, rcat = 0.0182, precision = 100, adapt_rate = 1, chea = 100, autophos = 5, tar_off = 0.02, tar_on = 0.5, tsr_off = 100, tsr_on = 1000000, ini_methyl =0.924, integration_rate = 0.01;
    public static int n_cells = 5, position_cells = 0, orient_cells = 4, grad_select = 0, medium_num = 0, bound_select = 0, n_motors = 5, tar_num = 6, tsr_num = 12, tumble_select = 0, run_select = 0, motor_select = 0;
    public static long rand_seed = 3;
    public static String avgname = "averages.out", fullname = "individuals.out";

    public static List<Double> cellxpositions = new ArrayList<Double>();
    public static List<Double> cellypositions = new ArrayList<Double>();

    public void reset(){
        //reset default doubles
        time_sim = 500; matrix_x = 20; matrix_y = 20; ini_pos_x = 10; ini_pos_y = 10; source_x = 10; source_y = 10; att_max = 0.1; att_min = 0; att_rate = 0.001; g_sigma = 5; step_val = 0.03; add_step = 5; rem_step = 350; diff_const = 0.062; cell_velocity = 20; rest_rate = 0.65; chez = 100; zphos = 30; chey = 100; yphos = 100; cheb = 100; bcat = 0.0364; cher = 100; rcat = 0.0182; precision = 100; adapt_rate = 1; chea = 100; autophos = 5; tar_off = 0.02; tar_on = 0.5; tsr_off = 100; tsr_on = 1000000; ini_methyl =0.924; integration_rate = 0.01;
        //reset default ints
        n_cells = 1; position_cells = 0; orient_cells = 4; grad_select = 0; medium_num = 0; bound_select = 0; n_motors = 5; tar_num = 6; tsr_num = 12; tumble_select = 0; run_select = 0; motor_select = 0;
        //reset default longs
        rand_seed = 3;
        //reset default strings
        avgname = "averages.out"; fullname = "individuals.out";
    }

    //global variable set functions
    //public void setcell(double x1, double y1, double x2, double y2){
    //    cellpositions
    //}
    public void set_time_sim(double holder){time_sim = holder;}
    public void set_matrix_x(double holder){matrix_x = holder;}
    public void set_matrix_y(double holder){matrix_y = holder;}
    public void set_ini_pos_x(double holder){ini_pos_x = holder;}
    public void set_ini_pos_y(double holder){ini_pos_y = holder;}
    public void set_source_x(double holder){source_x = holder;}
    public void set_source_y(double holder){source_y = holder;}
    public void set_att_max(double holder){att_max = holder;}
    public void set_att_min(double holder){att_min = holder;}
    public void set_att_rate(double holder){att_rate = holder;}
    public void set_g_sigma(double holder){g_sigma = holder;}
    public void set_step_val(double holder){step_val = holder;}
    public void set_add_step(double holder){add_step = holder;}
    public void set_rem_step(double holder){rem_step = holder;}
    public void set_diff_const(double holder){diff_const = holder;}
    public void set_cell_velocity(double holder){cell_velocity = holder;}
    public void set_rest_rate(double holder){rest_rate = holder;}
    public void set_chez(double holder){chez = holder;}
    public void set_zphos(double holder){zphos = holder;}
    public void set_chey(double holder){chey = holder;}
    public void set_yphos(double holder){yphos = holder;}
    public void set_cheb(double holder){cheb = holder;}
    public void set_bcat(double holder){bcat = holder;}
    public void set_cher(double holder){cher = holder;}
    public void set_rcat(double holder){rcat = holder;}
    public void set_precision(double holder){precision = holder;}
    public void set_adapt_rate(double holder){adapt_rate = holder;}
    public void set_chea(double holder){chea = holder;}
    public void set_autophos(double holder){autophos = holder;}
    public void set_tar_off(double holder){tar_off = holder;}
    public void set_tar_on(double holder){tar_on = holder;}
    public void set_tsr_off(double holder){tsr_off = holder;}
    public void set_tsr_on(double holder){tsr_on = holder;}
    public void set_ini_methyl(double holder){ini_methyl = holder;}
    public void set_integration_rate(double holder){integration_rate = holder;}
    public void set_n_cells(int holder){n_cells = holder;}
    public void set_position_cells(int holder){position_cells = holder;}
    public void set_orient_cells(int holder){orient_cells = holder;}
    public void set_grad_select(int holder){grad_select = holder;}
    public void set_medium_num(int holder){medium_num = holder;}
    public void set_bound_select(int holder){bound_select = holder;}
    public void set_n_motors(int holder){n_motors = holder;}
    public void set_tar_num(int holder){tar_num = holder;}
    public void set_tsr_num(int holder){tsr_num = holder;}
    public void set_tumble_select(int holder){tumble_select = holder;}
    public void set_run_select(int holder){run_select = holder;}
    public void set_motor_select(int holder){motor_select = holder;}
    public void set_rand_seed(long holder){rand_seed = holder;}
    public void set_avgname(String holder){avgname = holder;}
    public void set_fullname(String holder){fullname = holder;}

    //global variable retrieve functions
    //public float getxarray(int holder){
      //  return Float.valueOf(cellxpositions.get(holder));
   // }

    public double ret_time_sim(){ return time_sim;}
    public double ret_matrix_x(){ return matrix_x;}
    public double ret_matrix_y(){ return matrix_y;}
    public double ret_ini_pos_x(){ return ini_pos_x;}
    public double ret_ini_pos_y(){ return ini_pos_y;}
    public double ret_source_x(){ return source_x;}
    public double ret_source_y(){ return source_y;}
    public double ret_att_max(){ return att_max;}
    public double ret_att_min(){ return att_min;}
    public double ret_att_rate(){ return att_rate;}
    public double ret_g_sigma(){ return g_sigma;}
    public double ret_step_val(){ return step_val;}
    public double ret_add_step(){ return add_step;}
    public double ret_rem_step(){ return rem_step;}
    public double ret_diff_const(){ return diff_const;}
    public double ret_cell_velocity(){ return cell_velocity;}
    public double ret_rest_rate(){ return rest_rate;}
    public double ret_chez(){ return chez;}
    public double ret_zphos(){ return zphos;}
    public double ret_chey(){ return chey;}
    public double ret_yphos(){ return yphos;}
    public double ret_cheb(){ return cheb;}
    public double ret_bcat(){ return bcat;}
    public double ret_cher(){ return cher;}
    public double ret_rcat(){ return rcat;}
    public double ret_precision(){ return precision;}
    public double ret_adapt_rate(){ return adapt_rate;}
    public double ret_chea(){ return chea;}
    public double ret_autophos(){ return autophos;}
    public double ret_tar_off(){ return tar_off;}
    public double ret_tar_on(){ return tar_on;}
    public double ret_tsr_off(){ return tsr_off;}
    public double ret_tsr_on(){ return tsr_on;}
    public double ret_ini_methyl(){ return ini_methyl;}
    public double ret_integration_rate(){ return integration_rate;}
    public int ret_n_cells(){ return n_cells;}
    public int ret_position_cells(){ return position_cells;}
    public int ret_orient_cells(){ return orient_cells;}
    public int ret_grad_select(){ return grad_select;}
    public int ret_medium_num(){ return medium_num;}
    public int ret_bound_select(){ return bound_select;}
    public int ret_n_motors(){ return n_motors;}
    public int ret_tar_num(){ return tar_num;}
    public int ret_tsr_num(){ return tsr_num;}
    public int ret_tumble_select(){ return tumble_select;}
    public int ret_run_select(){ return run_select;}
    public int ret_motor_select(){ return motor_select;}
    public long ret_rand_seed(){ return rand_seed;}
    public String ret_avgname(){ return avgname;}
    public String ret_fullname(){ return fullname;}

    public void passvars(Model Model1){

            Model1.setNcells(n_cells);
            Model1.setTmax(time_sim);
            Model1.setLxLy(matrix_x,matrix_y);
            Model1.setInitialCellDistribution(ini_pos_x,ini_pos_y,orient_cells);
            Model1.setGradient(grad_select);
            Model1.setStepGradientParams(step_val,add_step,rem_step);
            Model1.setGradMinMaxVal(att_min,att_max);
            Model1.setGradSourceXY(source_x,source_y);
            Model1.setExpGradRate(att_rate);
            Model1.setGradSigma(g_sigma);
            Model1.setMedium(medium_num);
            Model1.setOutputDt(att_max);
            Model1.setOutFileNames(avgname,fullname);
            Model1.setOutFlags(true,true,true,true,true,true,true,true,true,true,true,true);
            Model1.setDt(att_max);
            Model1.setRandSeed(rand_seed);
            Cell2D.setRandSeed(rand_seed);
            Network.setDissConstants(tar_off,tar_on,tsr_off,tsr_on);
            Model1.setRunModel(run_select);
            Model1.setTumbleModel(tumble_select);
            Model1.setBoundaryCondition(bound_select);
            Cell.setNmotors(n_motors);
            Cell.setRotDiffusionCoeff(diff_const);
            Cell.setMaxCellVelocity(1e-3*cell_velocity);
            Motor.setMotorBias0(rest_rate,motor_select);
            Model1.setAdaptRate(adapt_rate);
            Network.setAdaptPrecision(0.01*precision);
            Network.setRelativeCheRCheB(0.01*cher,0.01*cheb);
            Network.setNreceptors(tar_num,tsr_num);
            Network.setRelativeCheYCheZ(0.01*chey,0.01*chez);
            Network.setIniMethState(ini_methyl);
            Network.setRelativeCheA(0.01*chea);
            Network.setRates(rcat,bcat,autophos,yphos,zphos);

            try

            {
                Model1.runModel();
            }

            catch(
            InterruptedException e
            )

            {
                return;
            }

    }
}
