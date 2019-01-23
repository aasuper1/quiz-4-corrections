# quiz-4-corrections
### Question 3
I want to print each character of a String one-by-one on a separate line. The number of characters in the String is unknown. You may assume the String is stored in a variable called str. How can I do this? Select all that apply.

  
>int i = 1;
int length = str.length();
while (i <= length) {
    System.out.println(str.charAt(i));
}
   
>for (int i = 1; i <= str.length(); i++) {
    System.out.println(str.charAt(i));
}
  
>int i = 0;
int length = str.length();
while (i < length) {
    System.out.println(str.charAt(i));
}
  
>for (int i = 0; i < str.length(); i++) {
    System.out.println(str.charAt(i));
}

The answer choice says the final two answers are correct, the latter of which I chose to start off with. I did not choose the third option because there is no iterator and it will run an infinite loop. 
**Can I get full credit for this question if I am not mistaken**

### Question 13
Consider the following code snippet.
> String str = "Hello, there. My name is Joseph. What's yours?";
> char c = str.charAt(7);

What is the value of c after running this code?
 
> " "
   
> "t"
  
> ' '
  
> 't'

The answer for this question is 't' because the charAt(int i) fuction returns the character at the ith index in the String. Since arrays start at 0, couning 0, 1, 2, ... 7 will return you the 't' in 'there'.

