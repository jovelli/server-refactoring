package com.refactoring.examples.duplicateObservedData;
import java.awt.*;
import java.awt.event.*;

import java.util.Observer;
import java.util.Observable;

public class PathLengthFrame extends Frame implements Observer {

    private PathLength pathLength = new PathLength();

    private TextField start = new TextField("0.0");
    private TextField end = new TextField("0.0");
    private TextField length = new TextField("0.0");

    public PathLengthFrame() {
        this.setLayout(new GridLayout(3, 2, 10, 10));
        this.setSize(200, 130);
        this.setLocationRelativeTo(null);

        this.add(new Label("Start "));
        this.add(start);

        this.add(new Label("End "));
        this.add(end);

        this.add(new Label("Length "));
        this.add(length);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        start.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e) {}
            public void focusLost(FocusEvent e) {
                pathLength.setStart(Double.parseDouble(start.getText()));

                if (!isNumber(start.getText()) ) {
                    pathLength.setStart(0.0);
                }
                pathLength.recalculateLength();
            }
        });

        end.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e) {}
            public void focusLost(FocusEvent e) {
                pathLength.setEnd(Double.parseDouble(end.getText()));

                if (!isNumber(end.getText()) ) {
                    pathLength.setEnd(0.0);
                }
                pathLength.recalculateLength();
            }
        });

        length.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e) {}
            public void focusLost(FocusEvent e) {
                pathLength.setLength(Double.parseDouble(length.getText()));

                if (!isNumber(length.getText()) ) {
                    pathLength.setLength(0.0);
                }
                pathLength.recalculateEnd();
            }
        });

        pathLength.addObserver(this);
        update(pathLength, null);
    }

    public static void main(String[] args) {
        Frame frame = new PathLengthFrame();
        frame.show();
    }

    public void update(Observable observed, Object arg) {
        start.setText(pathLength.getStart().toString());
        end.setText(pathLength.getEnd().toString());
        length.setText(pathLength.getLength().toString());
    }

    private boolean isNumber(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}


