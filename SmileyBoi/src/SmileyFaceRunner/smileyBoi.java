package SmileyFaceRunner;

// A+ Computer Science  -  www.apluscompsci.com
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

//Name -
//Date -
//Class -
//Lab  -
public class smileyBoi {

    public void paint(Canvas canvas) {
        smileyBoi(canvas);
    }

    public void smileyBoi(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);
        graphics.strokeText("SMILEY FACE LAB ", 35, 35);

        graphics.setFill(Color.web("eae5e6"));
        graphics.fillOval(210, 100, 400, 400);
        
        double middleX = canvas.getWidth()/2;
        double middleY = canvas.getHeight()/2;
        
        // Red Dots
        graphics.setFill(Color.web("ed1a4b"));
        double diam = 50;
        double x1 = middleX - 113;
        double y1 = middleY;
        double x2 = middleX + 100;
        double y2 = middleY + 30;
        graphics.fillOval(x1, y1, diam, diam);
        graphics.fillOval(x2, y2, diam, diam);
        
        //Smile
        graphics.setLineWidth(20);
        graphics.setStroke(Color.web("800000"));
        double centerX = 335;
        double centerY = 325;
        double radiusX = 150;
        double radiusY = 100;
        double startAngle = 0;
        double finishAngle = -180;
        graphics.strokeArc(centerX, centerY, radiusX, radiusY, startAngle, finishAngle, ArcType.OPEN);
        graphics.setLineWidth(1);

        //Eyes
        double xPos = 360;
        double yPos = 175;
        double width = 100;
        double height = 75;
        double eyeSeparation = 175;
        double irisRatio = 0.75;
        double pupilRatio = 0.35;
        double irisXDisp = 12; // X Displacement value
        double irisYDisp = 10; // Y Displacement value
        double pupilXDisp = 30;
        double pupilYDisp = 25;
            //outline
        graphics.setStroke(Color.web("191415"));
        graphics.strokeOval(xPos - (eyeSeparation / 2), yPos, width, height);
        graphics.strokeOval(xPos + (eyeSeparation / 2), yPos, width, height);
        graphics.setFill(Color.LIGHTGREY);
            //whites
        graphics.fillOval(xPos - (eyeSeparation / 2), yPos, width, height);
        graphics.fillOval(xPos + (eyeSeparation / 2), yPos, width, height);
            //irises
        graphics.setFill(Color.web("007FFF"));
        graphics.fillOval((xPos - (eyeSeparation / 2)) + irisXDisp, yPos + irisYDisp, width * irisRatio, height * irisRatio);
        graphics.fillOval((xPos + (eyeSeparation / 2)) + irisXDisp, yPos + irisYDisp, width * irisRatio, height * irisRatio);
            //pupils
        graphics.setFill(Color.BLACK);
        graphics.fillOval((xPos - (eyeSeparation / 2)) + pupilXDisp, yPos + pupilYDisp, width * pupilRatio, height * pupilRatio);
        graphics.fillOval((xPos + (eyeSeparation / 2)) + pupilXDisp, yPos + pupilYDisp, width * pupilRatio, height * pupilRatio);
        
        // Nose
        graphics.setFill(Color.CHOCOLATE);
        double noseHeight = 50;
        double noseWidth = 100;
        double yAdjust = 100;
        graphics.fillOval(xPos, yPos + yAdjust, noseWidth, noseHeight);
        
        
        
    }
}
