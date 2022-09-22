
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * <p>
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        int x = 0;
        StringBuilder str = new StringBuilder();
        while(x<size) {
            size++;
            str.append("*");
        }
        return str.toString();
    }


    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * <p>
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        int l = 0;
        int h = 0;
        StringBuilder newString = new StringBuilder();
        while(l <length || h<height) {
            if (l < length) {
                l++;
                newString.append("*");
            }
            else
                newString.append("\n");
            if (h < height) {
                h++;
                newString.append("*");
            }
        }

        // write your code here
        return newString.toString();
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        StringBuilder newString = new StringBuilder();
        for(int i=1; i<height; i++)
        {
            for(int x = i; x>0; x--)
            newString.append("*");
            newString.append("\n");

        }
        // write your code here
        return newString.toString();
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     * <p>
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        StringBuilder newString = new StringBuilder();
        for(int i = 1; i<height; i++)
        {
            for(int x = 0; x<height - i; x++)
                newString.append("*");
                newString.append("\n");
        }
        // write your code here
        return "";
    }
}

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @return a string that looks like the shape above when printed
     */



