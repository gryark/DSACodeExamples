package Stack;

public class StackMatcherExample {
         /**
         * Tests if delimiters in the given expression are properly matched.
         * The following examples further illustrate this concept:
         * Correct: ( )(( )){([( )])}
         * Correct: ((( )(( )){([( )])}))
         * Incorrect: )(( )){([( )])}
         * Incorrect: ({[])}
         * Incorrect: (
         */
        public static boolean isDelimiterMatched(String expression) {
            final String opening = "({["; // opening delimiters
            final String closing = ")}]"; // respective closing delimiters
            MyStack<Character> stackBuffer = new LinkedStack<>();
            for (char c : expression.toCharArray()) {
                if (opening.indexOf(c) != -1) // this is a left delimiter
                    stackBuffer.push(c);
                else if (closing.indexOf(c) != -1) { // this is a right delimiter
                    if (stackBuffer.isEmpty()) // nothing to match with
                        return false;
                    if (closing.indexOf(c) != opening.indexOf(stackBuffer.pop()))
                        return false; // mismatched delimiter
                }
            }
            return stackBuffer.isEmpty(); // were all opening delimiters matched?
        }

        /**
         * Tests if every opening tag has a matching closing tag in HTML string.
         * HTML tags that are used in this example include:
         * <body>: document body
         * <h1>: section header
         * <center>: center justify
         * <p>: paragraph
         * <ol>: numbered (ordered) list
         * <li>: list item
         */
        public static boolean isHTMLMatched(String html) {
            MyStack<String> stackBuffer = new LinkedStack<>();
            int j = html.indexOf('<'); // find first ’<’ character (if any)
            while (j != -1) {
                int k = html.indexOf('>', j + 1); // find next ’>’ character
                if (k == -1)
                    return false; // invalid tag
                String tag = html.substring(j + 1, k); // strip away < >
                if (!tag.startsWith("/")) // this is an opening tag
                    stackBuffer.push(tag);
                else { // this is a closing tag
                    if (stackBuffer.isEmpty())
                        return false; // no tag to match
                    if (!tag.substring(1).equals(stackBuffer.pop()))
                        return false; // mismatched tag
                }
                j = html.indexOf('<', k + 1); // find next ’<’ character (if any)
            }
            return stackBuffer.isEmpty(); // were all opening tags matched?
        }
    }

