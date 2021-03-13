package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Variables:
        int userTuitionInput, userInflationRateInput, userNumOfYearsInflation,
                userYearsAfterInflation = 0;
        int controlVar1, controlVar2 = 0;
        double sumFirstLoop, sumSecondLoop = 0;
        double totalTuitionSecondLoop = 0.0;
        double sumTotalForAttendance = 0.0;
        double convertInflationToPercentage = 0.0;

    //Block 1: UI
        System.out.println("Estimated tuition (Ex: 10000): ");
        userTuitionInput = input.nextInt();

        System.out.println("Estimated inflation rate (Ex: 6): ");
        userInflationRateInput = input.nextInt();

        System.out.println("Number of years from now you expect to start attending your " +
                "chosen institution (Ex: 10): ");
        userNumOfYearsInflation = input.nextInt();

        System.out.println("Expected number of years you'll be attending said institution " +
                "(Ex: 4): ");
        userYearsAfterInflation = input.nextInt();

    //Block 2: Loop
        convertInflationToPercentage = userInflationRateInput * 0.01;
        sumFirstLoop = userTuitionInput;

        for (controlVar1 = 0; controlVar1 < userNumOfYearsInflation; controlVar1++) {
            sumFirstLoop = (sumFirstLoop * convertInflationToPercentage) + sumFirstLoop;
            sumSecondLoop = sumFirstLoop;
            if (controlVar1 < userNumOfYearsInflation) {
                for (controlVar2 = 0; controlVar2 < userYearsAfterInflation; controlVar2++) {
                    totalTuitionSecondLoop = sumSecondLoop;
                    sumSecondLoop = (sumSecondLoop * convertInflationToPercentage) + sumSecondLoop;
                    //Bottom code took me a looooooooooong time to figure out. And for no reason.
                    sumTotalForAttendance = totalTuitionSecondLoop + sumSecondLoop;
                }
            }
        }
        System.out.printf("Yearly tuition in %d years will be $%.2f. Total tuition for %d years " +
                        "after will be $%.2f.", userNumOfYearsInflation, sumFirstLoop,
                        userYearsAfterInflation, sumTotalForAttendance);

    }
}

/*
IDK why it took me so long to finish it, but it did, lol. I'm eager to see what your solution is.
*/
