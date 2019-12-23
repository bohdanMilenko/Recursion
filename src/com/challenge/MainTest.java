package com.challenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

       private final String oneLetter = "a";
          private final String oneDuplicateMiddle = "abcdddfgh";
          private final String oneDuplicateBeginning = "aaabcdefg";
          private final String oneDuplicateEnd = "abcdefffff";
          private final String multipleDuplicates = "aaabccccdefgggg";
          private final String noDuplicates = "abcdefg";
     
          @Test
          void shortenStringOneLetter() {
              assertEquals("a", Main.shortenString(oneLetter,1,'a'));

          }
          @Test
          void shortenStringOneDuplicateMiddle() {
              assertEquals("abcd3fgh",Main.shortenString(oneDuplicateMiddle,1,'a'));
          }
          @Test
          void shortenStringOneDuplicateBeginning() {
              assertEquals("a3bcdefg",Main.shortenString(oneDuplicateBeginning,1,'a'));
          }
          @Test
          void shortenStringOneDuplicateEnd() {
              assertEquals("abcdef5", Main.shortenString(oneDuplicateEnd,1,'a'));
          }
          @Test
          void shortenStringMultipleDuplicates() {
              assertEquals("a3bc4defg4", Main.shortenString(multipleDuplicates,1,'a'));
          }
          @Test
          void shortenStringNoDuplicates() {
              assertEquals("abcdefg", Main.shortenString(noDuplicates,1,'a'));
          }



}