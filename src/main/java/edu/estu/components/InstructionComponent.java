package edu.estu.components;

import java.util.ArrayList;

public class InstructionComponent {

    static ArrayList<String> createInstructions() {
        System.out.println("************************* Add Instructions *************************");
        System.out.println("Add instruction and click enter (write done when you are done) ");

        ArrayList<String> instructions = new ArrayList<>();

        String instruction = "";
        while (!instruction.equals("done")) {
            instruction = System.console().readLine();
            if (instruction == "done") break;
            instructions.add(instruction);
        }


        return instructions;
    }
}
