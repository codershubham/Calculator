package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2;
    String string="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
    }

    public void Calculate(){

        String str1="0",str2="0";
        double x=0,y=0;
        int plus=-1,minus=-1,mul=-1,div=-1,mod=-1,log=-1;

         plus = string.indexOf("+");
        minus = string.indexOf("-");
        mul = string.indexOf("*");
        div = string.indexOf("/");
        mod = string.indexOf("%");
        log = string.indexOf("Log");

        if(plus>0){
             str1 = string.substring(0,plus);
             x = Double.parseDouble(str1);

             str2 = string.substring(plus+1,string.length());
             y = Double.parseDouble(str2);
            string =x+y +"";
        }
        else if(minus>0){
             str1 = string.substring(0,minus);
             x = Double.parseDouble(str1);

             str2 = string.substring(minus+1,string.length());
             y = Double.parseDouble(str2);
            string = x-y+"";
        }
        else if(mul>0){
             str1 = string.substring(0,mul);
             x = Double.parseDouble(str1);

             str2 = string.substring(mul+1,string.length());
             y = Double.parseDouble(str2);
            string =x*y +"";
        }
        else if(div>0){
             str1 = string.substring(0,div);
             x = Double.parseDouble(str1);

             str2 = string.substring(div+1,string.length());
             y = Double.parseDouble(str2);
             string = x/y+"";
        }
        else if(mod>0){
             str1 = string.substring(0,mod);
             x = Double.parseDouble(str1);

             str2 = string.substring(mod+1,string.length());
             y = Double.parseDouble(str2);
            string = x%y+"";
        }
        else if(log==0){
             str1 = string.substring(4,string.length()-1);
             x = Double.parseDouble(str1);
            if(x>0){
                string = Math.log(x)+"";
            }
            else {
                string="";
                Toast.makeText(this,"put Positive value",Toast.LENGTH_LONG).show();
            }
        }
        textView1.setText(string);
        textView2.setText(string);
    }

    public void doWork(View view) {
        switch(view.getId()){
            case R.id.button1 :
                string="";
                textView1.setText(string);
                textView2.setText("");
                break;
            case R.id.button2 :
                int length=0;
                length=string.length();
                string =string.substring(0,length-1);
                textView1.setText(string);

                break;
            case R.id.button3:
                break;
            case R.id.button4 :
                break;
            case R.id.button5 :
                string = string +"+";
                textView1.setText(string);
                break;
            case R.id.button6:
                string = string +"-";
                textView1.setText(string);
                break;
            case R.id.button7 :
                string = string +"*";
                textView1.setText(string);
                break;
            case R.id.button8 :
                string = string +"/";
                textView1.setText(string);
                break;
            case R.id.button9:
                string = string +"7";
                textView1.setText(string);
                break;
            case R.id.button10 :
                string = string +"8";
                textView1.setText(string);
                break;
            case R.id.button11 :
                string = string +"9";
                textView1.setText(string);
                break;
            case R.id.button12 :
                string = string +"%";
                textView1.setText(string);
                break;
            case R.id.button13:
                string = string +"4";
                textView1.setText(string);
                break;
            case R.id.button14 :
                string = string +"5";
                textView1.setText(string);
                break;
            case R.id.button15 :
                string = string +"6";
                textView1.setText(string);
                break;
            case R.id.button16:
                string = "1/"+string ;
                textView1.setText(string);
                break;
            case R.id.button17 :
                string = string +"1";
                textView1.setText(string);
                break;
            case R.id.button18 :
                string = string +"2";
                textView1.setText(string);
                break;
            case R.id.button19:
                string = string +"3";
                textView1.setText(string);
                break;
            case R.id.button20 :
                string = "Log("+string+")";
                textView1.setText(string);
                break;
            case R.id.button21 :
                string = string +".";
                textView1.setText(string);
                break;
            case R.id.button22 :
                string = string +"0";
                textView1.setText(string);
                break;
            case R.id.button23:
                Calculate();
                break;
            case R.id.button24 :
                break;
        }
    }
}
