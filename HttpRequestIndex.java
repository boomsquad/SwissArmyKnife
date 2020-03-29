public class HttpRequestIndex extends HttpRequest
{
    public Boolean parseIndex()
    {
        for (final String line: urlContent)
        {
            parseLine(line);
        }
        return true;
    }

    private void parseLine(final String line)
    {
        System.out.println(line);

        //Wherever there is an ending quotation mark, the line is broken
        final String[] subString = line.split("\"");

        /*if (subString.length > 0)
        {
            int n = 0;
            for (final String s: subString)
            {
                System.out.println("Substring: " + n + " = " + s);
                n++;
            }
        }*/

        // subString[7] = email address
        /*if (subString.length > 11)
        {
            if (subString[9].equals("ContactURL"))
            {
                String jsonURL = subString[11];

                System.out.println("\nContact URL: " + jsonURL);
                

                //Todo: Send the email.
            }
        }*/
    }
}