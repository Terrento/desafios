//This program takes the position of a Spider and Fly and calculates the shortest path
//the formar must take to reach its destination.
//Original problem here: https://edabit.com/challenge/8Pgn2HjatQgF9Rdu8

package org.example.expert;

public class SpidervsFly {

    private int firstNumber;
    private int secondNumber;
    private char firstLetter;
    private char secondLetter;
    public String findPath(String spiPos, String flyPos){
        StringBuilder result = new StringBuilder(spiPos);

        this.firstNumber = spiPos.charAt(1) - '0';
        this.secondNumber = flyPos.charAt(1) - '0';
        this.firstLetter = spiPos.charAt(0);
        this.secondLetter = flyPos.charAt(0);

        //Check if middle path is better
        result.append(toCrossMiddle());
        //First sort the numbers
        result.append(sortNumbers());
        //Now sorting the letters
        result.append(sortLetters());

        return result.toString();
    }
    private String toCrossMiddle(){
        StringBuilder result = new StringBuilder();
        if (firstLetter != 0 && secondNumber != 0 &&
                (Math.abs(secondLetter - firstLetter) == 4 && Math.abs(secondNumber + firstNumber) <= 5)){
            while(firstNumber != 1){
                firstNumber--;
                result.append("-").append(firstLetter).append(firstNumber);
            }
            firstLetter = 65;
            firstNumber = 0;
            result.append("-").append(firstLetter).append(firstNumber);
        }

        if (firstNumber == 0){
            firstNumber++;
            firstLetter = secondLetter;
            result.append("-").append(firstLetter).append(firstNumber);
        }
        return result.toString();
    }
    private String sortNumbers(){
        StringBuilder result = new StringBuilder();
        while (firstNumber != secondNumber){
            if (firstNumber > secondNumber){
                firstNumber--;
                if (firstNumber == 0)
                    firstLetter = 65;
                result.append("-").append(firstLetter).append(firstNumber);
            } else{
                firstNumber++;
                result.append("-").append(firstLetter).append(firstNumber);
            }
        }
        //See if we need to cross ...H->A<-B...
        result.append(toJump());
        return result.toString();
    }
    private String toJump(){
        StringBuilder result = new StringBuilder();

        if (firstLetter - secondLetter > 4){
            while (firstLetter != 74) {
                firstLetter++;
                if (firstLetter >= 73){
                    firstLetter = 65;
                    result.append("-").append(firstLetter).append(firstNumber);
                    break;
                }
                result.append("-").append(firstLetter).append(firstNumber);
            }
        } else if (secondLetter - firstLetter > 4) {
            while (firstLetter != 65) {
                firstLetter--;
                if (firstLetter <= 64){
                    firstLetter = 65;
                    result.append("-").append(firstLetter).append(firstNumber);
                    break;
                }
                result.append("-").append(firstLetter).append(firstNumber);
            }
        }
        return result.toString();
    }
    private String sortLetters(){
        StringBuilder result = new StringBuilder();
        while (firstLetter != secondLetter){
            if (secondLetter < firstLetter){
                firstLetter--;
                if (firstLetter == 64)
                    firstLetter = 72;
                result.append("-").append(firstLetter).append(firstNumber);
            } else{
                firstLetter++;
                if (firstLetter > 72 && secondLetter < 69){
                    firstLetter = 65;
                } else if(secondLetter > 69 && firstLetter < 72){
                    firstLetter = 72;
                }
                result.append("-").append(firstLetter).append(firstNumber);
            }
        }
        return result.toString();
    }
}