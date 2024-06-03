/* This code takes a circle's radius and calculates the area
of the regular polygon inside it given by the number of sides
Original problem can be found here: https://www.codewars.com/kata/5a58ca28e626c55ae000018a
*/

package org.example.de2024;

import java.text.DecimalFormat;

public class PolygonSides {
    public String areaOfPolygonInsideCircle(double circleRadius, int numberOfSides){
        DecimalFormat df = new DecimalFormat("0.###");

        if (numberOfSides <= 2 || circleRadius < 0){
            return "Impossible";
        }

        if (numberOfSides == 3){
            double polygonSide = (3*circleRadius)/Math.sqrt(3);
            return df.format((Math.sqrt(3)/4)*Math.pow(polygonSide, 2));
        } else{
            double polygonSide = Math.sin(Math.PI/numberOfSides)*2*circleRadius;
            double apothem = polygonSide/(2*Math.tan(Math.PI/numberOfSides));
            return df.format((polygonSide*apothem/2)*numberOfSides);
        }
    }
}