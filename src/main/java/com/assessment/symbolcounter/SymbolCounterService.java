package com.assessment.symbolcounter;

import org.springframework.stereotype.Service;

@Service
public class SymbolCounterService {
    public int[] countSymbols(int n) {
        // Initial screen display
        String screen = "@";

        // Press the button n times
        for (int i = 0; i < n; i++) {
            StringBuilder newScreen = new StringBuilder();
            // Iterate through each character in the current screen display
            for (char c : screen.toCharArray()) {
                // If the character is '@', replace it with '&&', and if it's '&', replace it with '@&'
                if (c == '@') {
                    newScreen.append("&&");
                } else if (c == '&') {
                    newScreen.append("@&");
                }
            }
            screen = newScreen.toString();
        }

        // Count the number of '@'s and '&'s in the final screen display
        int numAt = 0, numAnd = 0;
        for (char c : screen.toCharArray()) {
            if (c == '@') {
                numAt++;
            } else if (c == '&') {
                numAnd++;
            }
        }

        return new int[]{numAt, numAnd};
    }
}
