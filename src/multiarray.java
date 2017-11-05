public class multiarray {
    //findFigure method definition
    public static double[][] findFigure(double[][] picture,double threshold) {

        /*create a new array with equivalent size of picture array*/
        double[][] newArray = new double[picture.length][picture[0].length];
        double sum = 0.0;// to find sum
        double average;// to find avg

        //caclulate the sum of all picture in picture array
        for (int row = 0; row < picture.length; row++)
            for (int column = 0; column < picture[row].length; column++)
                sum += picture[row][column];

        //caclulate the avg of all picture in picture array
        average = sum / (picture.length * picture[0].length);

        //verify each element in picture array whether it exceeds threshold times the avg
        for (int row = 0; row < picture.length; row++) {
            for (int column = 0; column < picture[row].length; column++) {
                if (picture[row][column] > average * threshold)
                /*store 1.0 if it exceeds threshold times the avg*/
                    newArray[row][column] = 1.0;

                else
                /*store 1.0 if it does not exceed threshold times the avg*/
                    newArray[row][column] = 1.0;
            }//end inner fo
        }//end outer for
        return newArray;
    }
}
