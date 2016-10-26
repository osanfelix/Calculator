package com.example.oscar.testinggabriela;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    enum OPERATION{ADD, SUB, MULT, DIV}

    protected TextView _label = null;

    protected int _lastOperator = 0;
    protected OPERATION _lastOperation = OPERATION.ADD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _label = (TextView) findViewById(R.id.textView);

    }


    // Button functions
    public void click0(View view)
    {
        _label.append("0");
    }

    public void click1(View view)
    {
        _label.append("1");
    }

    public void click2(View view)
    {
        _label.append("2");
    }

    public void click3(View view)
    {
        _label.append("3");
    }

    public void click4(View view)
    {
        _label.append("4");
    }

    public void click5(View view)
    {
        _label.append("5");
    }

    public void click6(View view)
    {
        _label.append("6");
    }

    public void click7(View view)
    {
        _label.append("7");
    }

    public void click8(View view)
    {
        _label.append("8");
    }

    public void click9(View view)
    {
        _label.append("9");
    }

    public void clickMult(View view)
    {

    }

    public void clickAdd(View view)
    {
        int result = 0;
        switch (_lastOperation)
        {
            case ADD:
                result = _lastOperator + Integer.parseInt(_label.getText().toString());
                break;
            case SUB:
                result = _lastOperator - Integer.parseInt(_label.getText().toString());
                break;
            case MULT:
                result = _lastOperator * Integer.parseInt(_label.getText().toString());
                break;
            case DIV:
                result = _lastOperator / Integer.parseInt(_label.getText().toString());
                break;
        }
        _label.setText( Integer.toString(result));

        _lastOperator = result;
        _lastOperation = OPERATION.ADD;
    }

    public void clickSub(View view)
    {

    }

    public void clickDel(View view)
    {

    }

    public void clickDiv(View view)
    {

    }

    public void clickEquals(View view)
    {

    }
}
