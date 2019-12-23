# String Transformer via Recursion

Main aim of this app is to use recursion to manipulate a string and transform it to the certain format.

Application takes a string from the user and looks for the consecutive characters. 
If there is a sequence of 4 characters - "eeee", they should be replaced with "e4". Otherwise the input character will be the same as the output.

## Examples

*Input:* "abcccdef"

*Output:* "abc3def"

*Input:* "aaaatttghjkkkkkkk"

*Output:* "a4t3ghjk7"

## Test

The created method is fully covered with Junit tests and works correctly with any String passed in the method. 